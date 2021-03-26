import java.util.Scanner;

class ObjectCounter {
    static int cnt = 0;
    ObjectCounter(){
        cnt++;
    }
    static int getCount(){
        return cnt;
    }
}

public class Test7203 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            ObjectCounter str1 = new ObjectCounter();
        }
        System.out.println(ObjectCounter.getCount());
    }
}
