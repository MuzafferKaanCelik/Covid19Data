import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();

        ArrayList<Covid19Data> data = fileHandler.loadAllData();

        for (Covid19Data c19d : data) {
            System.out.println(c19d);

        }
    }
}
