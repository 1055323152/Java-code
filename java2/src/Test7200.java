import com.sun.org.apache.bcel.internal.generic.ClassGen;

import javax.swing.*;
import java.util.Scanner;

class Check {
    //write your code here
    int a,b;
    double a1,b1,c1;
    String s1,s2;
    Check(int a,int b){
        this.a = a;
        this.b = b;
    }
    Check(double a1,double b1,double c1){
        this.a1 = a1;
        this.b1 = b1;
        this.c1 = c1;
    }
    Check(String s1, String s2){
        this.s1 = s1;
        this.s2 = s2;
    }
    public int getMax(){
        return (a>b?a:b);
    }
    public double getCal(){
        return a1 * b1 * c1;
    }
    public boolean equal(){
        return s1.equals(s2);
    }
}

public class Test7200 {
    public static void main(String args[]) {
        //write your code here
        Scanner cin = new Scanner(System.in);
        Check a = new Check(cin.nextInt(),cin.nextInt());
        System.out.println("Larger value: "+a.getMax());
        a = new Check(cin.nextDouble(),cin.nextDouble(),cin.nextDouble());
        System.out.println("a*b*c = "+a.getCal());
        a = new Check(cin.next(),cin.next());
        System.out.println("Are equal: "+a.equal());
    }
}
/*
* 输入：
9 15
3.3 4.4 5.5
ab
ab
输出：
Larger value: 15
a*b*c = 79.86
Are equal: true
* */