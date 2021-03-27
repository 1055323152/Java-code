import java.util.*;
class Complex{
    int a = 0,b = 0;
    Complex(int a,int b){
        this.a = a;
        this.b = b;
    }
    Complex(Complex tmp){
        this.a = tmp.a;
        this.b = tmp.b;
    }
    public Complex Add(Complex tmp){
        this.a += tmp.a;
        this.b += tmp.b;
        return this;
    }
    public Complex Sub(Complex tmp){
        this.a -= tmp.a;
        this.b -= tmp.b;
        return this;
    }
    void Print(){
        if(this.a == 0 && this.b == 0){
            System.out.println(0);
        }
        else {
            System.out.println(this.a + " " + this.b + "i");
        }
    }
}
public class Test7202{
    public static void main(String[] args) {
        int m,n;    //第一个数的实部和虚部
        int p,q;    //第二个数的实部和虚部
        Scanner scanner =new Scanner(System.in);
        m=scanner.nextInt();
        n=scanner.nextInt();
        p=scanner.nextInt();
        q=scanner.nextInt();
        Complex t = new Complex(m,n);
        Complex s = new Complex(t);
        Complex r= new Complex(p,q);
        (s.Add(r)).Print();
        (t.Sub(r)).Print();
    }
}
// Write your own code