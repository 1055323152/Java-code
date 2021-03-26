import java.*;
import java.util.Scanner;
class Prime{
    static boolean prime(int num){
        if(num == 1){
            return false;
        }
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
public class test1038 {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(Prime.prime(n) == false){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
