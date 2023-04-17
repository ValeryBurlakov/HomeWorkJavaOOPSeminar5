package PhoneBook;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        Contact oleg = new Contact("Oleg", "Barvin", "1", "1@mail.ru");
        Contact Vitya = new Contact("Vitya", "Lagov", "2", "2@mail.ru");
        Contact Tom = new Contact("Tom", "Cruize", "3", "3@mail.ru");
        PhoneBook firstBook = new PhoneBook();
        firstBook.addContact(oleg);
        firstBook.addContact(Vitya);
        firstBook.addContact(Tom);
        System.out.println(firstBook.getContacts());
        firstBook.exportToCSV("PhoneBook");

        
    }

    
}
