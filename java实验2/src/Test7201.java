import java.security.PublicKey;
import java.util.Scanner;
class Point {

    private  int x;
    private  int y;

    public Point(int xx,int yy)	//构造方法
    {
        this.x=xx;
        this.y=yy;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    //write your code
    public Point(Point tmp){
        this.x = tmp.x;
        this.y = tmp.y;
    }
    public static void fun1(Point p)
    {
        System.out.println(p.getX());
    }

    public static Point fun2()
    {
        Point A =new Point(1,2);
        return A;
    }

}
public class Test7201 {
    public static void main(String[] args) {
        //write your code
        Scanner cin = new Scanner(System.in);
        Point A = new Point(cin.nextInt(),cin.nextInt());
        Point B = new Point(A);
        System.out.println(B.getX());
        Point.fun1(B);
        B = Point.fun2();
        //B.getX();
        System.out.println(B.getX());
    }
}