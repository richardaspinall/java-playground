import java.util.Scanner;  // Import the Scanner class

class TestScannerClass {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers with an operator to do some math ");

        long firstNum = s.nextLong();
        char operatorArg = s.next().charAt(0);
        long secondNum = s.nextLong();
        
        if(operatorArg == '/' && secondNum == 0){
            System.out.println("Division by 0!");
        } else {
            switch (operatorArg) {
                case '/':
                    System.out.println(firstNum / secondNum);
                    break;
                case '*':
                    System.out.println(firstNum * secondNum);
                    break;
                case '+':
                    System.out.println(firstNum + secondNum);
                    break;
                case '-':
                    System.out.println(firstNum - secondNum);
                    break;
                default:
                System.out.println("Unknown operator");
            }
        }
     
        
        

        
    }
}
