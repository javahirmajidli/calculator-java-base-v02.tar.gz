public class BasicMathOperations {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static float div(int a, int b) {
        if(b!=0){
            return (float) a / b ;
        }else {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    }

    public static int mul(int a, int b) {
        return a * b ;
    }

    public static int sum(int[] numbers){
        int sum = 0;
        for(int num : numbers){
            sum+=num;
        }
        return sum;
    }
}
