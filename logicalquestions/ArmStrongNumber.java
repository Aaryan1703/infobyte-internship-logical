package logicalquestions;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int n=153;
        int backup=n;
        int sum=0;
        while(n>0){
            int i=n%10;
            sum=sum+(i*i*i);
            n=n/10;
        }
        if(backup==sum){
            System.out.println(sum);
            System.out.println("Armstrong number");
        }else {
            System.out.println(sum);
            System.out.println("Not Armstrong");
        }
    }

    public static class AllPrimeToN {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            for (int i=2;i<=n;i++){
                int flag=0;
                for (int j=2;j<i;j++){
                    if(i%j==0){
                        flag=1;
                        break;
                    }

                }
                if (flag==0){
                    System.out.println(i);
                }
            }
        }
    }
}
