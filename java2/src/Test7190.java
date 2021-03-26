import java.util.*;
class Add{
    int a1,n,d;
    Add(int a1,int n,int d){
        this.a1 = a1;
        this.n = n;
        this.d = d;
    }
    static void getAns(Add tmp){
        System.out.println("和="+(2 * tmp.a1 + (tmp.n - 1) * tmp.d) * tmp.n / 2);
    }
}
public class Test7190{
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        int a1,n,d;
        a1 = cin.nextInt();
        n = cin.nextInt();
        d = cin.nextInt();
        Add.getAns(new Add(a1,n,d));
    }
}
