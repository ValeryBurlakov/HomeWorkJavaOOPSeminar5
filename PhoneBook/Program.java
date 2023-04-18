package PhoneBook;

public class Program {
    public static void main(String[] args) {

        Contact oleg = new Contact("Oleg", "Barvin", "1", "1@mail.ru");
        Contact Vitya = new Contact("Vitya", "Lagov", "2", "2@mail.ru");
        Contact Tom = new Contact("Tom", "Cruize", "3", "3@mail.ru");
        
        PhoneBook firstBook = new PhoneBook();
        PhoneBook twoBook = new PhoneBook();


        firstBook.addContact(oleg);
        firstBook.addContact(Vitya);
        firstBook.addContact(Tom);


        System.out.println("Контакты книги" + firstBook.getContacts());

        firstBook.exportToCSV("PhoneBook");
        
        System.out.println();

        twoBook.importFromCSV("PhoneBook.csv");
        twoBook.exportToCSVTAB("twoBook");

        System.out.println("контакты импортированной книги" + twoBook.getContacts());


        
    }

    
}
