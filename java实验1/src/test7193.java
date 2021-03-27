import java.util.Scanner;
public class test7193 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double f = cin.nextDouble();
        double c = 5 * (f - 50) / 9 + 10;
        System.out.println("The temprature is "+String.format("%.2f",c));
    }
}
/*
* 输入:
17.2
输出：
The temprature is -8.22
* */
