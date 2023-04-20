/*
* A Program to Perform basic
* Arithmetic operations
* "add,subtract,division,multiply"
* based on the operation string
* And it should print invalid operation
* for all other strings and return the
* default value of result variable equals zero
*/

public class BasicArithmeticOperations {

    public static int operation(String num1,String num2, String operation){
        int numOne,numTwo,result=0;
        numOne = Integer.parseInt(num1);
        numTwo = Integer.parseInt(num2);
        if(operation.equals("add")||operation.equals("Add")){
            result = numOne+numTwo;
        }
        else if(operation.equals("subtract")||operation.equals("Subtract")){
            result = numOne-numTwo;
        }
        else if(operation.equals("multiply")||operation.equals("Multiply")){
            result = numOne*numTwo;
        }
        else if(operation.equals("divide")||operation.equals("Divide")){
            result = numOne/numTwo;
        }
        else {
            System.out.println("Invalid Operation");
        }
        return result;
    }

    public static void main(String[]args){
        System.out.println(operation("1",  "2",  "add" ));
        // output : 3
        System.out.println(operation("4",  "5",  "subtract"));
        // output : -1
        System.out.println(operation("6",  "3",  "divide"));
        // output : 2
        System.out.println(operation("6",  "5",  "divide"));
        // output : 1
        System.out.println(operation("6",  "5",  "mod"));
        // output : Invalid Operation
        //          Default value of result = 0
    }
}
