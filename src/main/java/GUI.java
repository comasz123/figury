import figures.Figure;

public class GUI {

    public void printDatabase(Figure[] figures){
        for (Figure figure : figures) {
            if(!(figure==null)){
                System.out.println(figure);
            }
        }
    }
}
