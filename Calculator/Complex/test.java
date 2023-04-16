package Complex;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
// import java.util.logging.*;


public class test {
    
    private static FileWriter writer = null;   

    public static void main(String[] args) {
        
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss\n");
        String time = formatter.format(date); 

        try {
            writer = new FileWriter("log.txt", true);
            writer.write(String.format("Старт программы - ") + time);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое комплексное число (в формате a+bi):");
        ComplexNumber num1 = parseComplexNumber(scanner.nextLine());
    
        System.out.println("Введите второе комплексное число (в формате a+bi):");
        ComplexNumber num2 = parseComplexNumber(scanner.nextLine());
    

        while (true) {
            System.out.println("\nВыберите операцию:\n" +
                    "1. Сложение\n" +
                    "2. Вычитание\n" +
                    "3. Умножение\n" +
                    "4. Деление\n" +
                    "5. Выйти из программы");
            System.out.print("Введите номер операции: ");
    
            int choice = scanner.nextInt();
            ComplexNumber result;
    
            switch (choice) {
                case 1:
                    result = num1.add(num2);
                    System.out.println(String.format("Сложение: %s + %s = %s", num1, num2, result));
                    // Запись лога в файл
                    try {
                        writer.write(String.format("Сложение: %s + %s = %s\n", num1, num2, result));
                        writer.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    result = num1.subtract(num2);
                    System.out.println(String.format("Вычитание: %s - %s = %s", num1, num2, result));
                    // Запись лога в файл
                    try {
                        writer.write(String.format("Вычитание: %s - %s = %s\n", num1, num2, result));
                        writer.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    result = num1.multiply(num2);
                    System.out.println(String.format("Умножение: %s * %s = %s", num1, num2, result));
                    // Запись лога в файл
                    try {
                        writer.write(String.format("Умножение: %s * %s = %s\n", num1, num2, result));
                        writer.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    result = num1.divide(num2);
                    System.out.println(String.format("Деление: %s / %s = %s", num1, num2, result));
                    // Запись лога в файл
                    try {
                        writer.write(String.format("Деление: %s / %s = %s\n", num1, num2, result));
                        writer.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    System.out.println("Программа завершена.");
                    // Закрытие объекта FileWriter
                    try {
                        writer.write(String.format("Выход из программы - " + time));
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                default:
                    System.out.println("Ошибка: неверный ввод.");
                    continue;
            }
            System.out.println(String.format("Результат: %s", result));
        }
    }
    
    // Метод для парсинга комплексных чисел из строки
    private static ComplexNumber parseComplexNumber(String str) {
        // Извлечение вещественной и мнимой части из строки
        double real = Double.parseDouble(str.substring(0, str.indexOf("+")));
        double imag = Double.parseDouble(str.substring(str.indexOf("+")+1, str.indexOf("i")));
        
        return new ComplexNumber(real, imag); // возвращает комплексное число
    }
}


