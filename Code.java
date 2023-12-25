package src;

import java.util.Scanner;

public class Code {

    Scanner scan = new Scanner(System.in);

    Vehicle_Type vehile_Type = new Vehicle_Type();
    Vehicle_Models VehicleModels = new Vehicle_Models();
    Availability availablity = new Availability();
    Login login = new Login();
    Payment payment = new Payment();

    public void code() {
        System.out.println("Welcome to ABD Car Rental");

        System.out.println("Admin (1) Or User (2)");

        int choice = scan.nextInt();

        if (choice > 2) {
            while (choice > 2)
                choice = scan.nextInt();
        }

        if (choice == 1) {
            if (login.LOGIN()) {

                System.out.println("For Car Inventory (1)");
                System.out.println("For Bike Inventory (2)");
                System.out.println("For Adding Car (3)");
                System.out.println("For Adding Bike (4)");
                System.out.println("For Deleting Car (5)");
                System.out.println("For Deleting Bike (6)");
                System.out.println("Exit (7)");

                choice = scan.nextInt();

                if (choice > 7) {
                    while (choice > 7)
                        choice = scan.nextInt();
                }

                while (choice != 7) {

                    if (choice == 1) {

                        System.out.println(Availability.car);
                        System.out.println("For Car Inventory (1)");
                        System.out.println("For Bike Inventory (2)");
                        System.out.println("For Adding Car (3)");
                        System.out.println("For Adding Bike (4)");
                        System.out.println("For Deleting Car (5)");
                        System.out.println("For Deleting Bike (6)");
                        System.out.println("Exit (7)");

                        choice = scan.nextInt();
                    }

                    else if (choice == 2) {
                        System.out.println(Availability.bike);

                        System.out.println("For Car Inventory (1)");
                        System.out.println("For Bike Inventory (2)");
                        System.out.println("For Adding Car (3)");
                        System.out.println("For Adding Bike (4)");
                        System.out.println("For Deleting Car (5)");
                        System.out.println("For Deleting Bike (6)");
                        System.out.println("Exit (7)");

                        choice = scan.nextInt();
                    }

                    else if (choice == 3) {
                        System.out.println("Enter Car Name which you wanna Add and Car count: ");

                        String carName = scan.next();
                        int countOfCar = scan.nextInt();

                        Availability.car.put(carName, countOfCar);

                        System.out.println("For Car Inventory (1)");
                        System.out.println("For Bike Inventory (2)");
                        System.out.println("For Adding Car (3)");
                        System.out.println("For Adding Bike (4)");
                        System.out.println("For Deleting Car (5)");
                        System.out.println("For Deleting Bike (6)");
                        System.out.println("Exit (7)");

                        choice = scan.nextInt();
                    }

                    else if (choice == 4) {
                        System.out.println("Enter Bike Name which you wanna Add and Bike count: ");

                        String bikeName = scan.next();
                        int countOfBike = scan.nextInt();

                        Availability.car.put(bikeName, countOfBike);

                        System.out.println("For Car Inventory (1)");
                        System.out.println("For Bike Inventory (2)");
                        System.out.println("For Adding Car (3)");
                        System.out.println("For Adding Bike (4)");
                        System.out.println("For Deleting Car (5)");
                        System.out.println("For Deleting Bike (6)");
                        System.out.println("Exit (7)");

                        choice = scan.nextInt();
                    }

                    else if (choice == 5) {
                        System.out.println("Enter Car Name which you wanna delete: ");

                        String carName = scan.next();

                        Availability.car.remove(carName);

                        System.out.println("For Car Inventory (1)");
                        System.out.println("For Bike Inventory (2)");
                        System.out.println("For Adding Car (3)");
                        System.out.println("For Adding Bike (4)");
                        System.out.println("For Deleting Car (5)");
                        System.out.println("For Deleting Bike (6)");
                        System.out.println("Exit (7)");

                        choice = scan.nextInt();
                    }

                    else if (choice == 6) {
                        System.out.println("Enter Bike Name which you wanna delete: ");

                        String bikeName = scan.next();

                        Availability.bike.remove(bikeName);

                        System.out.println("For Car Inventory (1)");
                        System.out.println("For Bike Inventory (2)");
                        System.out.println("For Adding Car (3)");
                        System.out.println("For Adding Bike (4)");
                        System.out.println("For Deleting Car (5)");
                        System.out.println("For Deleting Bike (6)");
                        System.out.println("Exit (7)");

                        choice = scan.nextInt();
                    }
                    else if(choice == 7)
                    System.out.println("Thank You Visting ABD Rental");
                }
            }
        } 
        else if (choice == 2) {
            System.out.println("Enter your name");
            String Name = scan.next();

            System.out.println("Enter your Age");
            int Age = scan.nextInt();

            System.out.println("Enter your Gender");
            String Gender = scan.next();

            User user = new User(Name,Age,Gender);

            int Option = 0;

            while (Option != 2) {
                System.out.println("(1) Renting a Vehicle");
                System.out.println("(2) Returning the Vehicle");
                System.out.println("(3) Exit");

                Option = scan.nextInt();

                if (Option == 1) {
                    String vehicle_Type = vehile_Type.vehicle_type();

                    if(vehicle_Type.equalsIgnoreCase("car")){
                        System.out.println( "For Renting a Car You need to Deposit 10000 for Security, If You are fine with it (1) else (2)");
                        int Deposit = scan.nextInt();

                        if(Deposit == 1){
                        String vehicle_Model = VehicleModels.ModelSelection(vehicle_Type);
                        Boolean available = availablity.Vehicle_Availability(vehicle_Type, vehicle_Model);
                        available = true;

                        if (available) {
                        double rentalAmount = VehicleModels.rentalAmount;

                        payment.paymentMethod();

                        Option = 0;

                        System.out.println("Billing Details");
                        user.userDetails();
                        System.out.println("Vehicle Type:  " + vehicle_Type);
                        System.out.println("Vehicle Model: " + vehicle_Model);
                        System.out.println("Duration: " + 1);
                        System.out.println("Rental Amount: " + rentalAmount);
                        if((10000 - rentalAmount) > 0)
                        System.out.println("Remaining Amount You receive After subtracting the rentalAmount from your deposit: "+ (10000 - rentalAmount));
                        else
                        System.out.println("Amount you have to pay, After subtracting the rentalAmount from your deposit:" + (10000 - rentalAmount));

                    } else {
                        System.out.println("Selected vehicle  is not available");
                        System.out.println("Wanna choice Another Vehicle");
                        System.out.println("Yes (1) | No (2)");

                        Option = scan.nextInt();

                        if (Option == 1) {
                            System.out.println(" Please select again: ");
                        } else {
                            System.out.println("Sorry for inconviences");
                        }
                    }
                }
                else{
                    System.out.println("Thank You for Visiting ABD Rental");
                }
            }
            else{
               if(vehicle_Type.equalsIgnoreCase("bike")){
                        System.out.println( "For Renting a Car You need to Deposit 3000 for Security, If You are fine with it (1) else (2)");
                        int Deposit = scan.nextInt();

                        if(Deposit == 1){
                        String vehicle_Model = VehicleModels.ModelSelection(vehicle_Type);
                        Boolean available = availablity.Vehicle_Availability(vehicle_Type, vehicle_Model);
                        available = true;

                        if (available) {
                        double rentalAmount = VehicleModels.rentalAmount;

                        payment.paymentMethod();

                        Option = 0;

                        System.out.println("Billing Details");
                        user.userDetails();
                        System.out.println("Vehicle Type:  " + vehicle_Type);
                        System.out.println("Vehicle Model: " + vehicle_Model);
                        System.out.println("Duration: " + 1);
                        System.out.println("Rental Amount: " + rentalAmount);
                        
                        if((3000 - rentalAmount) > 0)
                        System.out.println("Remaining Amount You receive After subtracting the rentalAmount from your deposit: "+ (3000 - rentalAmount));
                        else
                        System.out.println("Amount you have to pay, After subtracting the rentalAmount from your deposit:" + (3000 - rentalAmount));                    }
                }   
            }
        }
    }
               else if(Option == 2){
                  System.out.println("Enter the Vehicle Type that you going to return: ");
                  String vehicle_Type = scan.next();

                  if((!vehicle_Type.equalsIgnoreCase("car")) && (!vehicle_Type.equalsIgnoreCase("bike"))){
                  System.out.println("Invalid Vehicle Type");
                  break;
                  }

                  System.out.println("Enter the vehicle Model that you going to return: ");
                  String vehicle_Model = scan.next();

                  if(vehicle_Type.equalsIgnoreCase("car") && (!Availability.car.containsKey(vehicle_Model))){
                  System.out.println("Invalid Vehicle Model");
                  break;
                  }
                  
                  if(vehicle_Type.equalsIgnoreCase("bike") && (!Availability.bike.containsKey(vehicle_Model))){
                  System.out.println("Invalid Vehicle Model");
                  break;
                  }


                  availablity.Vehicle_Returing(vehicle_Type, vehicle_Model);
               }

               else if (Option == 3) {
                  System.out.println("Thank You for Visiting ABD Rental");
                  break;
               }
            }
        }
    }
}