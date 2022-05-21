package figures;

import java.util.Arrays;

public class Figure {
    private int[] sides;
    private double perimiter;

    public Figure() {
    }

    public Figure(int[] sides) {
        this.sides = sides;
        double perimiterCalc = 0;
        if (sides.length > 2) {
            for (int i = 0; i < sides.length; i++) {
                perimiterCalc = perimiterCalc + sides[i];
            }
        } else if (sides.length == 1) {
            perimiterCalc = 2 * Math.PI * sides[0];
        }
        this.perimiter = perimiterCalc;
    }

    public double getPerimiter() {
        return perimiter;
    }

    public int[] getSides() {
        return sides;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.sides.length; i++) {
            sb.append(this.sides[i]).append(" ");
        }
        sb.append("- obwód: ");
        sb.append(this.perimiter);
        return sb.toString();
    }

    public boolean checkIfPossible() {
        int[] sortedSides = this.sides;
        int sumOfRemainingSides = 0;
        Arrays.sort(sortedSides);

        if (sortedSides.length == 1) {
            return true;
        } else if (sortedSides.length == 2) {
            return false;
        } else if (sortedSides.length > 2) {
            for (int i = 0; i < sortedSides.length - 1; i++) {
                sumOfRemainingSides = sumOfRemainingSides + sides[i];
            }
            if ((sortedSides[sortedSides.length - 1] < sumOfRemainingSides)) {
                return true;
            }

        }
        return false;
    }
}
