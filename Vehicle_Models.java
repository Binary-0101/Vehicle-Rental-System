package src;

import java.util.Scanner;

public class Vehicle_Models {

    Scanner scan = new Scanner(System.in);

    String ModelType;

    double rentalAmount = 0;

    public String ModelSelection(String vehicleChoice){

        if (vehicleChoice.equalsIgnoreCase("Car")){
            System.out.println("Choose one of the following car models: ");

            System.out.println("(1) BMW       Rs.50000");
            System.out.println("(2) Audi       Rs.40000");
            System.out.println("(3) Volkswagen   Rs.20000");
            System.out.println("(4) Swift        Rs.10000");
            System.out.println("(5) Hyundai   Rs.8000");

            int carType  = scan.nextInt();

            if(carType > 5){
                while(carType > 5){
                     System.out.println("Invalid input! Please select again!");
                     carType  = scan.nextInt();
                }
            }

            if (carType == 1){
                ModelType = "BMW";
                rentalAmount = 50000;
            }
            else if (carType==2) {
                ModelType = "Audi";
                rentalAmount = 40000;
            }
            else if (carType==3) {
                ModelType = "Volkswagen";
                rentalAmount = 20000;
            }
            else if (carType==4) {
                ModelType = "Swift";
                rentalAmount = 10000;
            }
            else if (carType==5) {
                ModelType = "Hyundai";
                rentalAmount = 8000;
            }

            System.out.println("Thank you for your selecting: "+ModelType);

        }
        else if (vehicleChoice.equalsIgnoreCase("Bike")) {
            System.out.println("Choose one of the following motorcycle models: ");
            System.out.println("(1) Duke -------------- Rs.8000");
            System.out.println("(2) KTM --------------- Rs.7000");
            System.out.println("(3) Enfield ----------- Rs.5000");
            System.out.println("(4) Honda ------------- Rs.1000");

            int bikeType = scan.nextInt();

             if(bikeType > 4){
                while(bikeType > 4){
                     System.out.println("Invalid input! Please select again!");
                     bikeType  = scan.nextInt();
                }
            }

            if (bikeType==1){
                ModelType = "Duke";
                rentalAmount = 8000;
            }
            else if (bikeType==2) {
                ModelType = "KTM";
                rentalAmount = 7000;
            }
            else if (bikeType==3) {
                ModelType = "Enfield";
                rentalAmount = 5000;
            }
            else if (bikeType==4) {
                ModelType = "Honda";
                rentalAmount = 1000;
            }
            else {
                System.out.println("Invalid input! Please select again!");
            }

            System.out.println("Thank you for selecting: "+ModelType);
        }
        return ModelType;
    }
}
