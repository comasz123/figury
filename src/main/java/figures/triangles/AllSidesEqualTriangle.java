package figures.triangles;

public class AllSidesEqualTriangle extends Triangle{
    private String name;

    public AllSidesEqualTriangle() {
    }

    public AllSidesEqualTriangle(int[] sides) {
        super(sides);
        this.name = "Trojkąt Równoboczny";
    }
    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(super.toString());
        return sb.toString();
    }
}
