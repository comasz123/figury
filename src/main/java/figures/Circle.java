package figures;

public class Circle extends Figure {
    private String name;
    private double area;

    public Circle() {
    }

    public Circle(int[] sides) {
        super(sides);
        this.name = "Koło";
        this.area = Math.PI*super.getSides()[0]*super.getSides()[0];

    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(" - ");
        sb.append(super.toString());

        sb.append(" - pole: ");
        sb.append(this.area);

        return sb.toString();
    }
}
