import figures.Figure;
import figures.pentagons.NormalPentagon;
import figures.pentagons.Pentagon;
import figures.pentagons.RegularPentagon;
import figures.quadrants.NormalQuadrant;
import figures.quadrants.Quadrant;
import figures.quadrants.Rectangle;
import figures.quadrants.Square;
import figures.triangles.AllSidesEqualTriangle;
import figures.triangles.DifferentSidesTriangle;
import figures.triangles.Triangle;
import figures.triangles.TwoSidesEqualTriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        int numberOfInputs = 2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean checkInput = true;

        for (int inputs = 0; inputs < numberOfInputs; inputs++) {

            while (checkInput) {
                checkInput = false;

                System.out.println("podaj dane wejściowe");

                for (int i = 0; i < numberOfInputs; i++) {
                    String input = br.readLine();
                    String[] inputArray = input.split(" ");
                    int[] sides = new int[inputArray.length];
                    for (int j = 0; j < inputArray.length; j++) {
                        sides[j] = Integer.parseInt(inputArray[j]);
                    }
                    Figure figure = new Figure(sides);
                    if (!figure.checkIfPossible()) {
                        System.out.println("nie da się z tego zrobić figury");
                        checkInput = true;
                    } else {
                        if (inputArray.length == 3) {
                            Triangle triangle = new Triangle(sides);
                            if (triangle.determineType() == 0) {
                                figure = new DifferentSidesTriangle(sides);
                            }
                            if (triangle.determineType() == 1) {
                                figure = new AllSidesEqualTriangle(sides);
                            }
                            if (triangle.determineType() == 2) {
                                figure = new TwoSidesEqualTriangle(sides);
                            }

                        } else if (inputArray.length == 4) {
                            Quadrant quadrant = new Quadrant(sides);
                            if (quadrant.determineType()==0){
                                figure = new NormalQuadrant(sides);
                            } else if (quadrant.determineType()==1){
                                figure = new Square(sides);
                            } else if (quadrant.determineType()==2){
                                figure = new Rectangle(sides);
                            }

                        } else if (inputArray.length == 5) {
                            Pentagon pentagon = new Pentagon(sides);
                            if (pentagon.determineType()==0){
                                figure = new NormalPentagon(sides);
                            } else if (pentagon.determineType()==1){
                                figure = new RegularPentagon(sides);
                            }

                        } else if (inputArray.length == 6) {

                        }
                        System.out.println(figure);
                    }
                }
            }

        }
    }
}
