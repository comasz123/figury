package figures.pentagons;

public class RegularPentagon extends Pentagon {
    private String name;
    private double area;

    public RegularPentagon(int sides[]) {
        super(sides);
        this.name = super.getName() + " Foremny";
        this.area = (super.getSides()[0]*super.getSides()[0])*Math.sqrt(25+10*Math.sqrt(5));
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
