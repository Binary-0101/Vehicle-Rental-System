package src;

import java.util.*;

public class Availability {

    static TreeMap <String,Integer> car = new TreeMap<>();
    static TreeMap <String,Integer> bike = new TreeMap<>();

    public Availability(){
        car.put("BMW",2);
        car.put("Audi",2);
        car.put("Volkswagan",2);
        car.put("Swift",2);
        car.put("Hyundai",2);


        bike.put("Duke",2);
        bike.put("KTM",2);
        bike.put("Enfield",2);
        bike.put("Honda",2);
    }

    public boolean Vehicle_Availability(String vehicle_Type,String vehicle_Model){
        if(vehicle_Type.equalsIgnoreCase("car")){
            if(car.containsKey(vehicle_Model) && car.get(vehicle_Model) > 0){
            int value = car.get(vehicle_Model);
            car.put(vehicle_Model,value-1);
            return true;
        }
    }
        else if(vehicle_Type.equalsIgnoreCase("Bike")){
            if(bike.containsKey(vehicle_Model) && bike.get(vehicle_Model) > 0){
            int value = bike.get(vehicle_Model);
            bike.put(vehicle_Model,value-1);
            return true;
            }
        }
        return false;
    }
    public void Vehicle_Returing (String vehicle_Type,String vehicle_Model){
        if(vehicle_Type.equalsIgnoreCase("car")){
            if(car.containsKey(vehicle_Model)){
            int value = car.get(vehicle_Model);
            car.put(vehicle_Model,value+1);
            }
        }
        else if(vehicle_Type.equalsIgnoreCase("Bike")){
            if(bike.containsKey(vehicle_Model)){
            int value = bike.get(vehicle_Model);
            bike.put(vehicle_Model,value+1);
            }
        }
        System.out.println("Vehicle Returned Successfully. Thank You!");
    }
}