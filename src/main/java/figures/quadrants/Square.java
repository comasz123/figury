package figures.quadrants;

public class Square extends Quadrant {
    private String name;
    private double area;

    public Square() {
    }

    public Square(int[] sides) {
        super(sides);
        this.name = "Kwadrat";
        this.area = super.getSides()[0]*super.getSides()[0];
    }

    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(super.toString());
        sb.append(" - pole: ");
        sb.append(this.area);

        return sb.toString();
    }
}
