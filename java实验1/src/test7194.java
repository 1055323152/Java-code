import java.util.Scanner;

public class test7194 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int repeat = cin.nextInt();
        while((repeat--)!=0){
            long a = cin.nextLong();
            int n = cin.nextInt();
            long ans = 0,tmp = 0;
            for(int i = 1; i <= n; i++){
                tmp = tmp * 10 + a;
                ans += tmp;
            }
            System.out.println(ans);
        }
    }
}
