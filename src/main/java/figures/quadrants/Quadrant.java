package figures.quadrants;

import figures.Figure;

public class Quadrant extends Figure {
    private String name;

    public Quadrant() {
    }

    public Quadrant(int[] sides) {
        super(sides);
        this.name = "Czworokąt";
    }

    public String getName() {
        return name;
    }

    public int determineType(){

        if((super.getSides()[0]==super.getSides()[1])
                &&(super.getSides()[1]==super.getSides()[2])
                &&super.getSides()[2]==super.getSides()[3]){
            return 1;
        }

        if(super.getSides()[0]==super.getSides()[1]&&super.getSides()[2]==super.getSides()[3]) {
            return 2;
        }
        return 0;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(" - ");
        sb.append(super.toString());

        return sb.toString();
    }
}
