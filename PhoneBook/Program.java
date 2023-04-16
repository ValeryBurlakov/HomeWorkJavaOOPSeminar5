package PhoneBook;

public class Program {
    public static void main(String[] args) {
        Contact oleg = new Contact("Oleg", "Barvin", "1", "1@mail.ru");
        Contact Vitya = new Contact("Vitya", "Lagov", "2", "2@mail.ru");
        PhoneBook firstBook = new PhoneBook();
        firstBook.addContact(oleg);
        firstBook.addContact(Vitya);
        System.out.println(firstBook.getContacts());
        firstBook.exportToCSV("PhoneBook");
        
    }

    
}
