package src;

import java.util.Scanner;

public class Payment {

    Scanner scan = new Scanner(System.in);

    public void paymentMethod(){
        System.out.println("Do you wanna pay with cash or card ?");
        System.out.println("(1) Cash | (2) Card"); 
        int paymentMethodSelection = scan.nextInt();
       
        if (paymentMethodSelection == 1){
            System.out.println("Thank you! See you again");
        }
        
        else {
            System.out.println("Enter your card details: ");
       
            System.out.println("Name holder: ");
            String NameHolder = scan.next();
         
            System.out.println("Enter your credit card Number: XXXX XXXX XXXX XXXX");
            String CardNumber = scan.next();
            
            System.out.println("Please enter your card validation: MM/YY");
            String CardValidation = scan.next();
           
            System.out.println("Please enter your CVV code: XXX");
            String cvv = scan.next();
        }
    }
}
