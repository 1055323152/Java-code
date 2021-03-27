import java.util.Scanner;

public class test1464 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int maxNum = -1,maxR = 0, maxC = 0;
        int [][]Matrix = new int[4][4];
        for(int i = 0 ; i <= 3 ; i++){
            for(int j = 0 ; j <= 3 ; j++){
                Matrix[i][j] = cin.nextInt();
                if(Matrix[i][j] > maxNum){
                    maxNum = Matrix[i][j];
                    maxR = i;
                    maxC = j;
                }
            }
        }
        System.out.printf("行:%d 列:%d 最大值:%d\n",maxR,maxC,maxNum);
    }
}
