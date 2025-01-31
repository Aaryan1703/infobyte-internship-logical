public class SwapVariable {
    public static void main(String[] args) {
        int a=5;
        int b=6;

        System.out.println(" Value before swapping a : "+ a +"  b : "+b);
        a=a-b;
        b=a-b;
        a=a-b;

        System.out.println(" Value before swapping a : "+ a +"  b : "+b);
    }
}
