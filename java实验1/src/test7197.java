import java.util.Scanner;

public class test7197 {
    public static boolean solve(int year){
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String []args){
        Scanner cin = new Scanner(System.in);
        int beginYear = cin.nextInt();
        int lastYear = cin.nextInt();
        int cnt = 0;
        for(int i = beginYear; i <= lastYear; i++){
            if(solve(i) == true){
                cnt++;
                if(cnt % 4 != 0){
                    System.out.printf("%d ",i);
                }
                else{
                    System.out.println(i);
                }
            }
        }
    }
}
