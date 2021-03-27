import java.util.Scanner;

public class test7186 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] a;
        int num;
        a = new int[]{-2, 1, 4, 5, 8, 12, 17, 23, 45, 56, 90, 100};
        num = cin.nextInt();
        int cnt = 0;
        for(int i:a){
            ++cnt;
            if(i == num){
                System.out.println(num+"是数组中的第"+cnt+"个元素");
                break;
            }
        }
        if(cnt > a.length){
            System.out.println(num+"不在数组中");
        }
    }
}