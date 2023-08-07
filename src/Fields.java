public class Fields {
    enum Operation {
        ADD,
        SUB,
        DIV,
        MUL
    }

    public int a;

    public int b;
    public int[] numbers;

    public Operation op;

    public String error;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public int[] getNumbers(){
        return numbers;
    }
    public void setNumbers(int[] numbers){
        this.numbers = numbers;
    }

    public Operation getOp() {
        return op;
    }

    public void setOp(Operation op) {
        this.op = op;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
