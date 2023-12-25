package src;

import java.util.Scanner;

public class Vehicle_Type {
    Scanner scan = new Scanner(System.in);

    Vehicle_Models vehicleModels = new Vehicle_Models();

    String vehicle_Type;

    public String vehicle_type() {
        System.out.println("In ABD Car Rental the following vehicles are available: ");
        System.out.println("Choose your rental wish: ");
        System.out.println("Car (1) | Bike (2)");
        int vehicle_Choice = scan.nextInt();
        
        if (vehicle_Choice == 1) {
            vehicle_Type = "Car";
        }
        else if (vehicle_Choice == 2) {
            vehicle_Type = "Bike";
        }
           
        return vehicle_Type;
    }
}

