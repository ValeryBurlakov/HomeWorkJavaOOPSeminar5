package PhoneBook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvExporterNew {
    public void exportContactsNew(List<Contact> contacts, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath + ".csv"))) {
            for (Contact contact : contacts) {
                writer.write(contact.getFirstName() + ", " + contact.getLastName() + "\n" + "phonenumber: " + contact.getPhoneNumber() +
                        ", E-mail: "  + contact.getEmail());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
