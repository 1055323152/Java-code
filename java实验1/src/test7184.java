import java.util.Scanner;

public class test7184 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String name = cin.next();
        if("圆形".equals(name)){
            double r = cin.nextDouble();
            System.out.println("圆形面积="+3.14 * r * r);
        }
        else if("矩形".equals(name)){
            double a = cin.nextDouble();
            double b = cin.nextDouble();
            System.out.println("矩形面积="+ a * b);
        }
        else {
            System.out.println("输入的不是圆形或矩形");
        }
    }
}
