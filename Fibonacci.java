import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first=0;
        int second=1;
        for (int i = 0; i <=n ; i++) {
            System.out.println(first);
            int newThird=first+second;
            first=second;
            second=newThird;

        }

    }
}
