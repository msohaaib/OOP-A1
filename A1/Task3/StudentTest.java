package A1.Task3;
import java.util.Scanner;

public class StudentTest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.print("Enter Student Id : ");
        Student.setId(sc.nextLine());
        System.out.print("Enter Student Name : ");
        s1.setName(sc.nextLine());
        System.out.print("Enter Student Age : ");
        s1.setAge(sc.nextLine());
        System.out.print("Enter Student Grade : ");
        s1.setGrade(sc.nextLine());

        s1.details();
        sc.close();
    }
}
