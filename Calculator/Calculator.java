
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
// import java.util.logging.*;


public class Calculator {
    
    private static FileWriter writer = null;   

    public static void main(String[] args) {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss\n");
        Long startTime = System.currentTimeMillis();
    
        try {
            writer = new FileWriter("logCalculate.txt", true);
            writer.write(String.format("\n" + "Старт программы - ") + formatter.format(startTime));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип чисел:\n" +
                "1. Комплексные числа\n" +
                "2. Рациональные числа\n" +
                "3. Выйти из программы");
        System.out.print("Введите номер операции: ");
    
        ComplexNumber num1c = null, num2c = null;
        RationalNumber num1r = null, num2r = null;
    
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введите первое комплексное число (в формате a+bi):");
                num1c = parseComplexNumber(scanner.next());
                System.out.println("Введите второе комплексное число (в формате a+bi):");
                num2c = parseComplexNumber(scanner.next());
                break;
            case 2:
                System.out.println("Введите первое рациональное число (в формате a/b):");
                num1r = parseRationalNumber(scanner.next());
                System.out.println("Введите второе рациональное число (в формате a/b):");
                num2r = parseRationalNumber(scanner.next());
                break;
            case 3:
                System.out.println("Программа завершена.");
                try {
                    scanner.close();
                    Long endTime = System.currentTimeMillis();

                    writer.write(String.format("Выход из программы - " + formatter.format(endTime)));
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return;
            default:
                System.out.println("Ошибка: неверный ввод.");
                scanner.close();
                return;
        }
    

        while (true) {
            System.out.println("\nВыберите операцию:\n" +
                    "1. Сложение\n" +
                    "2. Вычитание\n" +
                    "3. Умножение\n" +
                    "4. Деление\n" +
                    "5. Изменить тип чисел\n" +
                    "6. Выйти из программы");
            System.out.print("Введите номер операции: ");
            choice = scanner.nextInt();
    
            switch (choice) {
                case 1:
                    if (num1c != null) {
                        ComplexNumber result = num1c.add(num2c);
                        System.out.println(String.format("Сложение: %s + %s = %s", num1c, num2c, result));
                        try {
                            writer.write(String.format("Сложение: %s + %s = %s\n", num1c, num2c, result));
                            writer.flush();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        RationalNumber result = num1r.add(num2r);
                        System.out.println(String.format("Сложение: %s + %s = %s", num1r, num2r, result));
                        try {
                            writer.write(String.format("Сложение: %s + %s = %s\n", num1r, num2r, result));
                            writer.flush();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    if (num1c != null) {
                        ComplexNumber result = num1c.subtract(num2c);
                        System.out.println(String.format("Вычитание: %s - %s = %s", num1c, num2c, result));
                        try {
                            writer.write(String.format("Вычитание: %s - %s = %s\n", num1c, num2c, result));
                            writer.flush();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        RationalNumber result = num1r.subtract(num2r);
                        System.out.println(String.format("Вычитание: %s - %s = %s", num1r, num2r, result));
                        try {
                            writer.write(String.format("Вычитание: %s - %s = %s\n", num1r, num2r, result));
                            writer.flush();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    if (num1c != null) {
                        ComplexNumber result = num1c.multiply(num2c);
                        System.out.println(String.format("Умножение: %s * %s = %s", num1c, num2c, result));
                        try {
                            writer.write(String.format("Умножение: %s * %s = %s\n", num1c, num2c, result));
                            writer.flush();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        RationalNumber result = num1r.multiply(num2r);
                        System.out.println(String.format("Умножение: %s * %s = %s", num1r, num2r, result));
                        try {
                            writer.write(String.format("Умножение: %s * %s = %s\n", num1r, num2r, result));
                            writer.flush();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 4:
                    if (num1c != null) {
                        ComplexNumber result = num1c.divide(num2c);
                        System.out.println(String.format("Деление: %s / %s = %s", num1c, num2c, result));
                        try {
                            writer.write(String.format("Деление: %s / %s = %s\n", num1c, num2c, result));
                            writer.flush();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        RationalNumber result = num1r.divide(num2r);
                        System.out.println(String.format("Деление: %s / %s = %s", num1r, num2r, result));
                        try {
                            writer.write(String.format("Деление: %s / %s = %s\n", num1r, num2r, result));
                            writer.flush();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Выберите тип чисел:\n" +
                            "1. Комплексные числа\n" +
                            "2. Рациональные числа\n" +
                            "3. Вернуться в главное меню");
                System.out.print("Введите номер операции: ");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        num1r = null;
                        num2r = null;                    
                        System.out.println("Введите первое комплексное число (в формате a+bi):");
                        num1c = parseComplexNumber(scanner.next());
                        System.out.println("Введите второе комплексное число (в формате a+bi):");
                        num2c = parseComplexNumber(scanner.next());
                        break;
                    case 2:
                        num1c = null;
                        num2c = null;
                        System.out.println("Введите первое рациональное число (в формате a/b):");
                        num1r = parseRationalNumber(scanner.next());
                        System.out.println("Введите второе рациональное число (в формате a/b):");
                        num2r = parseRationalNumber(scanner.next());
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Ошибка: неверный ввод.");
                        break;
                }

                break;
            case 6:
                System.out.println("Программа завершена.");
                try {
                    Long endTime = System.currentTimeMillis();
                    writer.write(String.format("Выход из программы - " + formatter.format(endTime)));
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return;
            default:
                System.out.println("Ошибка: неверный ввод.");
                break;
        }
    }
}

private static ComplexNumber parseComplexNumber(String str) {
    double real = Double.parseDouble(str.substring(0, str.indexOf("+")));
    double imag = Double.parseDouble(str.substring(str.indexOf("+")+1, str.indexOf("i")));

    return new ComplexNumber(real, imag);
}

private static RationalNumber parseRationalNumber(String str) {
    int numerator = Integer.parseInt(str.substring(0, str.indexOf("/")));
    int denominator = Integer.parseInt(str.substring(str.indexOf("/")+1));

    return new RationalNumber(numerator, denominator);
}
}


