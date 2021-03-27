import java.util.Scanner;

public class test7185 {
    static boolean check(int num){
        for(int i = 2 ; i * i <= num ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        if(n <= 1){
            System.out.println("输入n不是大于1正整数");
        }
        else {
            for(int i = 2 ; i <= n ; i++){
                if(check(i) == true){
                    System.out.printf("%d ",i);
                }
            }
        }
    }
}
