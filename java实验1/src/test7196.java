import java.util.Scanner;

public class test7196 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        double ans = 0;
        int tmp = 1, k = 1;
        for(int i = 1 ; i <= n ;i++){
            if(i % 2 == 1){
                k = 1;
            }
            else{
                k = -1;
            }
            ans += k * 1.0 / tmp;
            tmp += 3;
        }
        System.out.println(ans);
    }
}
