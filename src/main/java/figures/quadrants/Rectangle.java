package figures.quadrants;

public class Rectangle extends Quadrant {
    private String name;
    private double area;

    public Rectangle() {
    }

    public Rectangle(int[] sides) {
        super(sides);
        this.name = "Prostokąt";
        this.area = super.getSides()[0]*super.getSides()[2];
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
