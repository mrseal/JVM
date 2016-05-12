// How to run?
// java -Xss512k StackOverflowExample

public class StackOverflowExample {

    // Local variable is stored in Stack
    public static void recursivePrint(int num) {
        if(num == 0) {
            return;
        }
        System.out.println("Number: " + num);
        try {
            Thread.sleep(1);
        } catch(Exception e) {
        }
        recursivePrint(++num);
    }

    public static void main(String[] args) {
        recursivePrint(1);
    }

}
