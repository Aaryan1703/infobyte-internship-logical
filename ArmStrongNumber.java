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
}
