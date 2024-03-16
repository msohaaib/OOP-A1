package A1.Task1;

public class Car {
    double fuelEfficiency;
    double fuelLevel;
    double driven;
    Car(){
        fuelEfficiency = 20; // miles per gallon
        fuelLevel = 0;
    }
    public void addFuel(double Fuel){
        fuelLevel += Fuel;
    }
    public void distanceDrived(double driven){
            this.driven = driven;
        
    }
    public double remainingFuel(){
        fuelLevel -=  (driven * fuelEfficiency) - fuelLevel;
        return fuelLevel;
    }
    public void details(){
        if(driven*fuelEfficiency <= fuelLevel){
        System.out.println("You have driven  " + driven + " miles and consumed " + (driven*fuelEfficiency) + " gallons of Fuel");
        System.out.println("The remaining fuel is " + (fuelLevel-(driven*fuelEfficiency)) + " gallons.");
        }
        else{
            System.out.println("You don't have enough fuel. Please refill your car.");
        }
    }
}
