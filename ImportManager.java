import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ImportManager {

    public void importTasks() {

        try {

            BufferedReader reader = new BufferedReader(new FileReader("TaskReport.txt"));

            String line;

            System.out.println("\n========== IMPORTED TASKS ==========");

            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("TaskReport.txt File Not Found.");
        }
    }
}