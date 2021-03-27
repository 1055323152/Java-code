import java.util.*;

public class test7195 {
    public static void main(String[] args) {
        int number, digit1, digit2, digit3, digit4, newnum;
        int temp;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        digit4 = (number % 10 + 9 ) % 10;
        number /= 10;
        digit3 = (number % 10 + 9 ) % 10;
        number /= 10;
        digit2 = (number % 10 + 9 ) % 10;
        number /= 10;
        digit1 = (number % 10 + 9 ) % 10;
        newnum = digit3 * 1000 + digit1 * 10 + digit4 * 100 + digit2;
        System.out.println("The encrypted number is " + newnum);

    }

}
