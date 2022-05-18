package figures;

import java.util.Arrays;

public class Figure {
    private int[] sides;
    private int perimiter;

    public Figure (){}

    public Figure(int[] sides) {
        this.sides = sides;
        int perimiterCalc = 0;
        for (int i = 0; i <sides.length; i++) {
            perimiterCalc = perimiterCalc+sides[i];
        }
        this.perimiter = perimiterCalc;
    }

    public int getPerimiter() {
        return perimiter;
    }

    public int[] getSides() {
        return sides;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.sides.length; i++) {
            sb.append(this.sides[i]).append(" ");
        }
        sb.append("- obwód: ");
        sb.append(this.perimiter);
        return sb.toString();
    }
    public boolean checkIfPossible(){
        int[] sortedSides = this.sides;
        Arrays.sort(sortedSides);
        if(sortedSides.length==3){
            if ((sortedSides[sortedSides.length - 1] < (sortedSides[0] + sortedSides[1]))) {
                return true;
            }
        }
        if(sortedSides.length==4){
            if ((sortedSides[sortedSides.length - 1] < (sortedSides[0] + sortedSides[1]+sortedSides[2]))) {
                return true;
            }
        }
        return false;
    }
}
