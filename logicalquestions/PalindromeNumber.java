package logicalquestions;

public class PalindromeNumber {
    public static void main(String[] args) {

        int n=121;
        int backup=n;
        int revNum=0;
        while(n>0) {
            int i = n % 10;
            revNum = revNum * 10 + i;
            n = n / 10;
        }
        if (backup==revNum){
            System.out.println("Palindrome Num");
        }else {
            System.out.println("Not Palindrome Number");
        }
    }

}
