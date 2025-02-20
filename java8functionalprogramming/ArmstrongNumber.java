package java8functionalprogramming;

interface Logic{
    void ArmNumber(int a);
}

public class ArmstrongNumber {

    public static void main(String[] args) {

        // Static method reference

        Logic armstrongNumber=ArmstrongNumber::checkArmstrongNumber;
        armstrongNumber.ArmNumber(153);
        armstrongNumber.ArmNumber(1234);
    }

    public static void checkArmstrongNumber(int a){
        int backup=a;
        int sum=0;
        int n=String.valueOf(a).length();
        while(a>0){
            int i=a%10;
            sum+=Math.pow(i,n);
            a=a/10;
        }
        if(sum==backup){
            System.out.println("Armstrong");
        }else {
            System.out.println("Non Armstrong");
        }

    }
}
