import java.io.IOException;
import java.util.Scanner;

public class Calc_Test {
    public static void main(String[] args) throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение через пробел: ");
        String scan = scanner.nextLine();
        System.out.println("Ваш ввод: " + scan);
        try {
            calc(scan);
        } catch (IndexOutOfBoundsException e){
            System.out.println("throws Exception// т.к. строка не является математической операцией");;
        }
    }


    public static void calc(String input){
        int a1;
        int a2;
        String[] ver = input.split(" "); // ver[0],vwe[1],ver[2]-> более 3х нужен - throw Exception
        if (ver.length == 4){
            try {
                throw new IOException();
            }catch (IOException e){
                System.out.println("throw Exception");
                System.exit(1);
            }
        }
        if (ver.length > 4){
            System.out.println("throws Exception// т.к. формат математическай операции не удовлетворяет заданию - два \n" +
                    "операнда и один оперотор (+, -, /, *)");
            return;
        }
        try {
            a1 = Integer.valueOf(ver[0]);
            a2 = Integer.valueOf(ver[2]);
        }catch (NumberFormatException e){
            System.out.println("Операнды могут быть только цифры!");;
            return;
        }
        if (a1 > 10 || a2 > 10){
            System.out.println("Ввод цифр должен быть не больше 10");
            return;
        }

        System.out.println("Первая опервнда: " + a1);
        System.out.println("Вторая операнда: " + a2);
        System.out.println("Оператор; " + ver[1]);

        int result;
        switch (ver[1]){
            case "+" :
                System.out.println(a1 + " + " + a2 + " = " + (result = a1 + a2));
                break;
            case "-":
                System.out.println(a1 + " - " + a2 + " = " +  (result = a1 - a2));
                break;
            case "/":
                System.out.println(a1 + " / " + a2 + " = " +  (result = a1 % a2));
                break;
            case "*":
                System.out.println(a1 + " * " + a2 + " = " +  (result = a1 * a2));
                break;
            default:
                System.out.println("Введен не верный оператор!");
        }
    }
}
