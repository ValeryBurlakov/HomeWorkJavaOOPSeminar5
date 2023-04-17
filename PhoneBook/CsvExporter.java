package PhoneBook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvExporter {
    public void exportContacts(List<Contact> contacts, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath + ".csv"))) {
            for (Contact contact : contacts) {
                writer.write("Name " + "Lastname " + "Phonenumber " + "E-mail");
                writer.newLine();
                writer.write(contact.getFirstName() + "," + contact.getLastName() + "," + contact.getPhoneNumber() +
                        "," + contact.getEmail());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
