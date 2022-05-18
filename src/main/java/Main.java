import figures.Figure;
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

        int numberOfInputs = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Figure figure = new Figure();
        boolean checkInput = true;

        while (checkInput) {
            checkInput = false;

            System.out.println("podaj dane wejściowe");

            for (int i = 0; i < numberOfInputs; i++) {
                String input = br.readLine();
                String[] inputArray = input.split(" ");
                int[] sides = new int[3];
                for (int j = 0; j < 3; j++) {
                    sides[j] = Integer.parseInt(inputArray[j]);
                    System.out.println(sides[j]);
                }
                if (!figure.checkIfPossible(sides)) {
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
                        System.out.println(figure);
                    } else if (inputArray.length == 4) {

                    } else if (inputArray.length == 5) {

                    } else if (inputArray.length == 6) {

                    }
                }
            }


        }

    }
}
