package figures.pentagons;

import figures.Figure;

public class Pentagon extends Figure {
    private String name;

    public Pentagon() {
    }
    public Pentagon(int sides[]){
        super(sides);
        this.name = "Pięciokąt";
    }

    public int determineType(){
        if(super.getSides()[0]==super.getSides()[1]&&super.getSides()[2]==super.getSides()[3]&&super.getSides()[3]==super.getSides()[4]){
            return 1;
        }
        return 0;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(" - ");
        sb.append(super.toString());

        return sb.toString();
    }
}
