package Ratio;

public class RationalNumber {
    private int numerator;
    private int denominator;
    
    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public RationalNumber add(RationalNumber num) {
        int newDenominator = this.denominator * num.denominator;
        int newNumerator = (this.numerator * num.denominator) + (num.numerator * this.denominator);
        
        return new RationalNumber(newNumerator, newDenominator);
    }
    
    public RationalNumber subtract(RationalNumber num) {
        int newDenominator = this.denominator * num.denominator;
        int newNumerator = (this.numerator * num.denominator) - (num.numerator * this.denominator);
        
        return new RationalNumber(newNumerator, newDenominator);
    }
    
    public RationalNumber multiply(RationalNumber num) {
        int newDenominator = this.denominator * num.denominator;
        int newNumerator = this.numerator * num.numerator;
        
        return new RationalNumber(newNumerator, newDenominator);
    }
    
    public RationalNumber divide(RationalNumber num) {
        int newDenominator = this.denominator * num.numerator;
        int newNumerator = this.numerator * num.denominator;
        
        return new RationalNumber(newNumerator, newDenominator);
    }
    
    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
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
                    writer.write(String.format("Выход из программы - " + time));
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return;
            default:
                System.out.println("Ошибка: неверный ввод.");
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
                        System.out.println(String.format("Сложение:%s + %s = %s", num1c, num2c, result));
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
                            "2. Рациональные числа\n" +"3. Вернуться в главное меню");
                            System.out.print("Введите номер операции: ");
            
                            choice = scanner.nextInt();
            
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
                                    break;
                                default:
                                    System.out.println("Ошибка: неверный ввод.");
                                    break;
                            }
            
                            break;
                        case 6:
                            System.out.println("Программа завершена.");
                            try {
                                writer.write(String.format("Выход из программы - " + time));
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
