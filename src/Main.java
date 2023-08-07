import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Give the operation and the numbers separated by space please.\n Possible operations: ADD, SUB, DIV, MUL.\n Example: ADD 1 2");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        Fields field = parseLine(line);

        if (field.getError() != null) {
            System.out.println("Error, reason: " + field.getError());
        }

        float rc = 0;
        if (field.getOp() == Fields.Operation.ADD) {
            rc = BasicMathOperations.add(field.getA(), field.getB());
        } else if (field.getOp() == Fields.Operation.SUM) {
            rc = BasicMathOperations.sum(field.getNumbers());
        }

        System.out.println("Result: " + rc);
    }

    public static Fields parseLine(String line) {
        Fields fields = new Fields();
        String[] strings = line.split(" ");

        if (strings.length < 3) {
            fields.setError("Not enough parameters, expected 3 or more, received: " + strings.length);
            return fields;
        }

        fields.setOp(Fields.Operation.valueOf(strings[0]));
        if (fields.getOp() == Fields.Operation.SUM) {
            int[] numbers = new int[strings.length - 1];
            for (int i = 1; i < strings.length; i++) {
                numbers[i - 1] = Integer.parseInt(strings[i]);
            }
            fields.setNumbers(numbers);
        } else {
            fields.setA(Integer.parseInt(strings[1]));
            fields.setB(Integer.parseInt(strings[2]));
        }
        return fields;
    }


}