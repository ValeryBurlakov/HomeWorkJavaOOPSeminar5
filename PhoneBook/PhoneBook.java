package PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void exportToCSV(String filePath) {
        CsvExporter exporter = new CsvExporter();
        exporter.exportContacts(contacts, filePath);
    }

    public void importFromCSV(String filePath) {
        CsvImporter importer = new CsvImporter();
        List<Contact> importedContacts = importer.importContacts(filePath);
        contacts.addAll(importedContacts);
    }
}
