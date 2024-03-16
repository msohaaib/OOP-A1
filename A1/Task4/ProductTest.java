package A1.Task4;
import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product prod = new Product();
        System.out.print("Enter id of item : ");
        prod.setId(sc.nextLine());
        System.out.print("Enter name of item : ");
        prod.setName(sc.nextLine());
        System.out.print("Enter price of item : ");
        prod.setPrice(sc.nextInt());
        System.out.print("Enter quantity of item : ");
        prod.setQuantity(sc.nextInt());

        prod.totalValue();
        prod.itemDetails();
        sc.close();
    }
    
}
