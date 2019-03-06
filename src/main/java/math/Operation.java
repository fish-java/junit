package math;

public class Operation {
    public static int add(int a, int b){
        return a + b + 1;
    }

    public  static int multiple(int a, int b){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a * b;
    }

    public static int divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }
}
