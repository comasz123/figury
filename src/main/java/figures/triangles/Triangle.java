package figures.triangles;
import figures.Figure;

public class Triangle extends Figure {
    private String name;
    private double area;

    public Triangle(){
    }

    public Triangle(int[] sides) {
        super(sides);
        this.name = "Trójkąt";
        double p = super.getPerimiter();
        this.area = Math.sqrt(p*(p-sides[0])*(p-sides[1])*(p-sides[2]));
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(" - ");
        sb.append(super.toString());
        sb.append(" - pole: ");
        sb.append(this.area);

        return sb.toString();
    }

    public int determineType(){
        if(super.getSides()[0]==super.getSides()[1]&&super.getSides()[1]==super.getSides()[2]){
            return 1;
        }
        if((super.getSides()[0]==super.getSides()[1]&&!(super.getSides()[0]==super.getSides()[2]))
                ||(super.getSides()[0]==super.getSides()[2]&&!(super.getSides()[0]==super.getSides()[1]))
                ||(super.getSides()[1]==super.getSides()[2]&&!(super.getSides()[1]==super.getSides()[0]))) {
            return 2;
        }
        return 0;
    }
}
