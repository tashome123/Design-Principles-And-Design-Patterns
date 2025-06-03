import java.io.FileWriter;
import java.io.IOException;

public class EmployeePersistence {
    public void saveToFile(Employee employee, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(employee.getDetails());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}