package logicalquestions;

public class ReverseNumber {
    public static void main(String[] args) {

        int n=149;
        int revnum=0;
        while(n>0){
            int i=n%10;
            revnum=revnum*10+i;
            n=n/10;
        }
        System.out.println(revnum);
    }
}
