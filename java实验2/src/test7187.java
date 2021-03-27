import java.util.Scanner;
class Demo{
    int x,y,z;
    Demo(int x,int y,int z){
            this.x = x;
            this.y = y;
            this.z = z;
        /*
            x = xx;
            y = yy;
            z = zz;
        */
    }
    Demo(){
        this.x = this.y = this.z = 0;
    }
    public int getValue(Demo t){
        return t.x * t.y * t.z;
    }
}
public class test7187 {
    public static void main(String []args){
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt(), y = cin.nextInt(), z = cin.nextInt();
        Demo a = new Demo(x,y,z);
        System.out.println("体积="+a.getValue(a));
    }
}
