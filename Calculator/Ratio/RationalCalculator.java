package Ratio;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class RationalCalculator {
    private static FileWriter writer = null;   
    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss\n");

        String time = formatter.format(date); 

        try {
            writer = new FileWriter("logRatioCalculate.txt", true);
            writer.write(String.format("Старт программы - ") + time);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в калькулятор рациональных чисел!");
        System.out.println("Введите первое рациональное число:");
        int num1 = scanner.nextInt();
        int den1 = scanner.nextInt();
        RationalNumber r1 = new RationalNumber(num1, den1);

        System.out.println("Введите второе рациональное число:");
        int num2 = scanner.nextInt();
        int den2 = scanner.nextInt();
        RationalNumber r2 = new RationalNumber(num2, den2);

        while (true) {
            System.out.println("\nВыберите операцию:");
            System.out.println("1. Сумма");
            System.out.println("2. Разность");
            System.out.println("3. умножение");
            System.out.println("4. Деление");
            System.out.println("5. Выход");

            int choice = scanner.nextInt();
            RationalNumber result;

            switch (choice) {
                case 1:
                    result = r1.add(r2);
                    System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
                    try {
                        writer.write(String.format("Сложение: %s + %s = %s\n", r1, r2, result));
                        writer.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }                    
                    break;

                case 2:
                    result = r1.subtract(r2);
                    System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
                    try {
                        writer.write(String.format("Вычитание: %s - %s = %s\n", r1, r2, result));
                        writer.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    result = r1.multiply(r2);
                    System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
                    try {
                        writer.write(String.format("Умножение: %s * %s = %s\n", r1, r2, result));
                        writer.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    result = r1.divide(r2);
                    System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
                    try {
                        writer.write(String.format("Деление: %s / %s = %s\n", r1, r2, result));
                        writer.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                    
                case 5:
                    System.out.println("Выход из программы!");
                    try {
                        writer.write(String.format("Выход из программы - " + time));
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Ошибка: неверный ввод.");
                    break;
            }
        }
    }
}




// Пример вывода:

// Welcome to the Rational Calculator!
// Please enter the first rational number:
// 1 2
// Please enter the second rational number:
// 2 3

// Please choose an operation:
// 1. Addition
// 2. Subtraction
// 3. Multiplication
// 4. Division
// 5. Exit
// 1
// 1/2 + 2/3 = 7/6

// Please choose an operation:
// 1. Addition
// 2. Subtraction
// 3. Multiplication
// 4. Division
// 5. Exit
// 2
// 1/2 - 2/3 = -1/6

// Please choose an operation:
// 1. Addition
// 2. Subtraction
// 3. Multiplication
// 4. Division
// 5. Exit
// 3
// 1/2 * 2/3 = 1/3

// Please choose an operation:
// 1. Addition
// 2. Subtraction
// 3. Multiplication
// 4. Division
// 5. Exit
// 4
// 1/2 / 2/3 = 3/4

// Please choose an operation:
// 1. Addition
// 2. Subtraction
// 3. Multiplication
// 4. Division
// 5. Exit
// 5
// Thank you for using the Rational Calculator!
