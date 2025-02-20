package logicalquestions;

public class MissingNumber {
    public static void main(String[] args) {
        int[] a = {21,22,23,25,26};
        int first=a[0];
        int last=a[a.length-1];
        int total = (last * (last + 1) / 2) - (first*(first-1)/2);

        int sum = 0;
        for (int num : a) {
            sum += num;
        }

        int missingNumber = total - sum;
        System.out.println("The missing number is: " + missingNumber);
    }
}

