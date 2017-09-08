import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReversePolishCalc {

    // You'll need a variable here to keep track of the top of the stack
    private int topOfStack = 0;

    // The array of the input string split up
    private String[] tokens;

    // The stack
    private String[] stack;

    public double calculate(String input) {
        System.out.println("Input: " + input);

        // 1. Use the String split method to split the string into tokens at the commas
        tokens = input.split(",");
        System.out.println("Tokens: " + tokens[0] + "," + tokens[1] + "," + tokens[2]);


        // 2. Allocate a stack as big as the number of tokens
        stack = new String[tokens.length];
        System.out.println("Stack: " + stack[0] + "," + stack[1] + "," + stack[2]);
        System.out.println("Length of Stack: " + tokens.length);

        // 3. write the algorithm

        for(int i = 0; i < tokens.length; ++i) {
            if (tokens[i].contains("+") || tokens[i].contains("-") || tokens[i].contains            ("/") ||              tokens[i].contains("*")){
                System.out.println(tokens[i]);
            } else {
                System.out.println(tokens[i]);

                double num = pop(i);
            }
            // calls to push() and pop() and do the math here
        }

        // 4. return the result
        return 0;
    }

    private void push(String number) {
        // push on the stack
        if(topOfStack == tokens.length){
            System.out.println("Stack is full");
        } else {
            stack[topOfStack++] = number;
            System.out.println("Stack: " + stack[0] + "," + stack[1] + "," + stack[2]);

        }
    }

    private void changeDoub(double d) {
        // change the double to a string and then push it on the stack
        String number = Double.toString(d);
        push(number);
        System.out.println(number);
    }

    private double pop(int i) {
        // remove the string from the top of the stack and convert it to a double and return it
            Double poppedNum = Double.parseDouble(stack[i]);
            System.out.println(poppedNum);
            System.out.println("Stack: " + stack[0] + "," + stack[1] + "," + stack[2]);

            return poppedNum;

    }
}
