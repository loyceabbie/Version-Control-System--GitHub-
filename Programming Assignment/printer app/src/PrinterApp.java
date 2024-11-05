public class PrinterApp {
    public static void main(String[] args) {
         // Constants and variables declarations grouped together
         final String CREATOR = "Your Name";  
         final int NUMBER1 = 5;               
         final int NUMBER2 = 2;               

        // Print app header
        System.out.println("Printer App");
        System.out.println("This app is made by: " + CREATOR);  
        System.out.println();  

        /// Print input values
        System.out.println("The value of number1 is " + NUMBER1);
        System.out.println("The value of number2 is " + NUMBER2);
        System.out.println(); 

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
