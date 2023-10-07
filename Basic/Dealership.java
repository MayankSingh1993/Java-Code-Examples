import java.util.Scanner;

public class Dealership {
    public static void main(String []arg){
        Scanner scan = new Scanner (System.in);
        //a simple application that uses switch statements and if-else statments for car dealership
        //show options available
        System.out.println("Welcome to the Java Dealership");
        System.out.println("-Select option 'a' to buy a car");
        System.out.println("-Select option 'b' to sell a car"); 
        //take user input
        String option = scan.nextLine();

        switch (option){
         //to buy a car
            case "a" :System.out.println("What is your budget?");
                     int budget = scan.nextInt(); 
                     if(budget >= 30000){
                        System.out.println("Great! A Dodge charger is available");
                        System.out.println("\nDo you have an insurance? Write 'Yes' or 'No'");
                        scan.nextLine();
                           String insurance = scan.nextLine();
                        System.out.println("\nDo you have a driver's licence? 'Yes' or 'no'");
                        String licence = scan.nextLine();
                        System.out.println("\nWhat is your credit score?");
                           int creditScore = scan.nextInt();
                        if(insurance.equals("yes") && licence.equals("yes") && creditScore > 660){
                            System.out.println("\nSold! Pleasure doing business with you");
                        } else {
                         System.out.println("We're sorry. You are not eligible.");
                          } 
                        
                    }break;
                  
            //to sell a car
            case "b" :System.out.println("\nWhat is your car valued at?");
                           int value = scan.nextInt();
                        System.out.println("\nWhat is you selling price?");
                           int price = scan.nextInt(); 

                     if (value > price && price < 30000){
                        System.out.println("\nWe will buy your car. Pleasure doing business with you!");
                     } else {
                         System.out.println("\nSorry, we are not interested.");;
                     }break;
            
            default  :System.out.println("Invalid option");  
        }
      scan.close();
        }
}