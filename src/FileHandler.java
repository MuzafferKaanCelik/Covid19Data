import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private final File file = new File("Covid19Data.csv");

    public ArrayList<Covid19Data> loadAllData() {
        ArrayList<Covid19Data> covid19Data = new ArrayList();
        Scanner sc = null;
        try {
            sc = new Scanner(file, StandardCharsets.ISO_8859_1);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Covid19Data data19 = null;
        while (sc.hasNext()) {
            String line = sc.nextLine(); // Split linje og læg tokens i attributter
            String[] attributes = line.split(";");
            data19 = new Covid19Data(
                    (attributes[0]), // Region
                    (attributes[1]), // Aldersgruppe
                    (Integer.parseInt(attributes[2])),// Bekræfted
                    (Integer.parseInt(attributes[3])),// Døde
                    (Integer.parseInt(attributes[4])),// IndlagtePIA
                    (Integer.parseInt(attributes[5])),// Indlagte
                    (attributes[6])  // Dato
            );

            covid19Data.add(data19);
        }
        sc.close();
        return covid19Data;
    }
}
