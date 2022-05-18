package figures.triangles;

public class DifferentSidesTriangle extends Triangle{
    private String name;

    public DifferentSidesTriangle() {
    }

    public DifferentSidesTriangle(int[] sides) {
        super(sides);
        this.name = "Trójkąt różnoboczny";
    }
    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(super.toString());
        return sb.toString();
    }
}
