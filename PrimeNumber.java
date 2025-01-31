import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        if (n>0 && n!=1){
            for (int i=2;i<n;i++){
                if (n%i==0){
                    flag=1;
                    break;
                }
            }
           if (flag==1){
               System.out.printf(n +" "+" is Not Prime number ");
           }else {
               System.out.println(n +" "+" is Prime number ");
           }
        }
        else {
            System.out.println("Invaliid number you enterd");
        }
    }
}
