package logicalquestions;

public class PalindromeString {
    public static void main(String[] args) {
        String str="aryan";
        int start=0;
        String newStr="";
        while(start<str.length()){
            char i=str.charAt(start);
            newStr=newStr+i;
            start++;
        }
        System.out.println(str);
        System.out.println(newStr);
        if (newStr.equals(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
