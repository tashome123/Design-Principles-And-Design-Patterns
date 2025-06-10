package Single_Responsibilty.Fails;

import java.io.FileWriter;
import java.io.IOException;

public class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getDetails() {
        return name + " - " + position;
    }

    // This method violates SRP — saving to file is not this class's job!
    public void saveToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(getDetails());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}