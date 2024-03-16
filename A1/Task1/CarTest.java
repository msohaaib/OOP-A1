package A1.Task1;
import java.util.Scanner;

public class CarTest {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Car car = new Car();
        System.out.println("How much fuel you want to add : ");
        car.addFuel(sc.nextInt());
        System.out.println("How much you want to drive : ");
        car.distanceDrived(sc.nextInt());
        car.details();
        
        sc.close();
    }

}
