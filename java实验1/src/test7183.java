import java.util.Scanner;

public class test7183 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] num = new int[3];
        int tmp;
        for(int i = 0 ; i < 3 ;i++){
            num[i] = cin.nextInt();
        }
        for(int i = 0 ; i < 3 ; i++){
            for(int j = i + 1 ; j < 3 ;j++){
                if(num[i] > num[j]){
                    tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }
        for(int i = 0 ; i < 3 ; i++){
            System.out.printf("%d ",num[i]);
        }
    }
}
