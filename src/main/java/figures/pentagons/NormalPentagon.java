package figures.pentagons;

public class NormalPentagon extends Pentagon {
    private String name;
    private String area;

    public NormalPentagon() {
    }
    public NormalPentagon(int[] sides){
        super(sides);
        this.name = "Pięciokąt";

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
