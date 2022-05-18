package figures.quadrants;

public class NormalQuadrant extends Quadrant {
    private String name;
    private String area;

    public NormalQuadrant() {
    }

    public NormalQuadrant(int[] sides) {
        super(sides);
        this.name = "Czworokąt";
        this.area = "brak";
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

