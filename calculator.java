import java.util.Scanner;

class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Calculator build in Java with Switch Case.");

      

        System.out.print("Enter first Number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second Number: ");
        double number2 = sc.nextDouble();
        sc.nextLine(); // to make compiler wait for next input

        System.out.print("Enter Operator: ");
        String operator = sc.nextLine();

        switch(operator){
            case "+":            
            System.out.printf("addition of %f + %f = %f \n", number1, number2, number1 + number2 );
            break;

            case "-":
            System.out.printf("subtraction of %f - %f = %f \n", number1, number2, number1 - number2 );
            break;

            case "*":            
            System.out.printf("multiplication of %f * %f = %f \n", number1, number2, number1 * number2 );
            break;

            case "/":
            if (number2 == 0){
                System.out.println("you cannot divide by zero");
            } else {               
                System.out.printf("division of %f / %f = %f", number1, number2, number1 / number2 );
            }
            break;

            default:
            System.out.printf("Invalid operator!");


        }
        sc.close();
        
    }
}
