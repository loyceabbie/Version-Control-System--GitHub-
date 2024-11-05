public class PrinterApp {
    public static void main(String[] args) {
         // Constants and variables declarations grouped together
         final String CREATOR = "Your Name";  
         final int NUMBER1 = 5;               
         final int NUMBER2 = 2;               

        System.out.println("Printer App");
        System.out.print("This app is made by: ");
        System.out.println(creator);

        // System.out.println(number1);  // Commented out as requested

        System.out.println("The value of number1 is " + number1);
        System.out.println("The value of number2 is " + number2);

        // multiply the numbers
        
        multiplication = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + multiplication);

        // addition of the numbers 
        
        addition = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + addition);

        // division of the numbers 
        
        division = (double) number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + division);

        // subtraction of the numbers 
        
        subtraction = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + subtraction);
    }
}
