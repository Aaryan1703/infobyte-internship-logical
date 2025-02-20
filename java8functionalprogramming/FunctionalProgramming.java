package java8functionalprogramming;

@FunctionalInterface
interface Shape{
    void draw();
}

public class FunctionalProgramming {

    public static void main(String[] args) {

        Shape circle=()-> System.out.println("This is circle");
        circle.draw();

        Shape square=()-> System.out.println("This is Square");
        square.draw();

    }

}
