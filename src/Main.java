import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sum = 0, a = 0, b = 0;
        int p = 1;
        String[] inputString;

        System.out.print("Введите пример: ");
        Scanner input = new Scanner(System.in);
        String inputData = input.nextLine();

        inputString = inputData.split(" ");

        if (inputString.length > 3){
            System.out.println("Калькулятор принимает только два операнда и один оператор");
            System.exit(0);
        }

        try{
            a = Integer.parseInt(inputString[0].trim());
            b = Integer.parseInt(inputString[2].trim());

            if (a > 10 || b > 10) {
                System.out.println("Калькулятор не принимает числа больше 10");
                System.exit(0);
            }
                if (!(a % 1 == 0) || !(b % 1 == 0)) {
                    System.out.println("Калькулятор принимает только целые числа");
                    System.exit(0);
                } if (a < 1 || b < 0){
                System.out.println("Калькулятор не принимает отрицательные числа и ноль");
                System.exit(0);
            }
                switch (inputString[1]) {
                    case "+" -> sum = a + b;
                    case "-" -> sum = a - b;
                    case "*" -> p = a * b;
                    case "/" -> p = a / b;
                    default -> {
                        System.out.println("Неверное арифметическая операция");
                        System.exit(0);
                    }
                }
                if (inputString[1].equals("*") || inputString[1].equals("/")) {
                    System.out.println("Ответ: " + p);
                } else if (inputString[1].equals("+") || inputString[1].equals("-")) {
                    System.out.println("Ответ: " + sum);
                }

        }catch (NumberFormatException d) {
            try{
                Rim rNumb1 = Rim.valueOf(inputString[0]);
                Rim rNumb2 = Rim.valueOf(inputString[2]);
                a = rNumb1.ordinal();
                b = rNumb2.ordinal();

            }catch (IllegalArgumentException e){
                System.out.println("Калькулятор принимает только целые числа дной системы счисления");
                System.exit(0);
            }

            if (a > 10 || b > 10) {
                System.out.println("Калькулятор не принимает числа больше X");
                System.exit(0);
            }
            switch (inputString[1]) {
                case "+" -> sum = a + b;
                case "-" -> sum = a - b;
                case "*" -> sum = a * b;
                case "/" -> sum = a / b;
                default -> {
                    System.out.println("Неверная арифметическая операция");
                    System.exit(0);
                }
            }
            if (sum < 1){
                System.out.println("Римская система счисления содержит только положительные числа");
                System.exit(0);
            }
            Rim sumR = Rim.values()[sum];

            if (inputString[1].equals("*") || inputString[1].equals("/")) {
                System.out.println("Ответ: " + sumR);
            } else if (inputString[1].equals("+") || inputString[1].equals("-")) {
                System.out.println("Ответ: " + sumR);
            }
        }
    }
}
enum Rim{
    A(0), I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10), XI(11), XII(12), XIII(13), XIV(14), XV(15), XVI(16), XVII(17), XVIII(18), XIX(19), XX(20), XXI(21), XXII(22), XXIII(23), XXIV(24), XXV(25), XXVI(26), XXVII(27), XXVIII(28), XXIX(29), XXX(30), XXXI(31), XXXII(32), XXXIII(33), XXXIV(34), XXXV(35), XXXVI(36), XXXVII(37), XXXVIII(38), XXXIX(39), XL(40), XLI(41), XLII(42), XLIII(43), XLIV(44), XLV(45), XLVI(46), XLVII(47), XLVIII(48), XLIX(49), L(50), LI(51), LII(52), LIII(53), LIV(54), LV(55), LVI(56), LVII(57), LVIII(58), LIX(59), LX(60), LXI(61), LXII(62), LXIII(63), LXIV(64), LXV(65), LXVI(66), LXVII(67), LXVIII(68), LXIX(69), LXX(70), LXXI(71), LXXII(72), LXXIII(73), LXXIV(74), LXXV(75), LXXVI(76), LXXVII(77), LXXVIII(78), LXXIX(79), LXXX(80), LXXXI(81), LXXXII(82), LXXXIII(83), LXXXIV(84), LXXXV(85), LXXXVI(86), LXXXVII(87), LXXXVIII(88), LXXXIX(89), XC(90), XCI(91), XCII(92), XCIII(93), XCIV(94), XCV(95), XCVI(96), XCVII(97), XCVIII(98), XCIX(99), C(100);
    private int rNumbers;
    Rim(int rNumbers){
    }
    public String getName(){
        return name();
    }
    public int getRNumbers(){
        return rNumbers;
    }
}
