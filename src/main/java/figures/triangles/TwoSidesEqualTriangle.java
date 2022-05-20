package figures.triangles;

public class TwoSidesEqualTriangle extends Triangle {
    private String name;

    public TwoSidesEqualTriangle() {
    }

    public TwoSidesEqualTriangle(int[] sides) {
        super(sides);
        this.name = super.getName()+ " równoboczny";
    }
    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(super.toString());
        return sb.toString();
    }
}
