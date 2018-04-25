
public class GameRunned {
    static boolean exit = false;

    public static void main(String args[]) {

        GameLogic b = new GameLogic();

        Field.FieldArr();  // Vvidodim massiv
        b.start();         // Zapusk igri

    }
}