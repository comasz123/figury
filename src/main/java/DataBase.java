import figures.Figure;

public class DataBase {
    private Figure[] figures;

    public DataBase() {
    }
    public DataBase(int lenght){
        this.figures = new Figure[lenght];
    }

    public Figure[] getFigures() {
        return figures;
    }

    public void addFigure(Figure figure, int count) {
       this.figures[count] = figure;
    }
}
