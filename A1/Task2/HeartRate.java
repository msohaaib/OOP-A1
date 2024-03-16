package A1.Task2;
import java.util.Calendar;
// import java.text.DecimalFormat; 

public class HeartRate {
    // DecimalFormat decfor = new DecimalFormat("0");  
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
public  HeartRate(String fname, String lname,int day, int month, int year){
    this.firstName = fname;
    this.lastName = lname;
    this.birthDay=day;
    this.birthMonth=month;
    this.birthYear=year;
}

// Setters
public void setFirstName(String firstName){
    this.firstName = firstName;
}
public void setLastName(String lastName){
    this.lastName = lastName;
}
public void setBirthday(int birthDay){
    this.birthDay = birthDay;
}
public void setBirthMonth(int birthMonth){
    this.birthMonth = birthMonth;
}
public void setBirthYear(int birthYear){
    this.birthYear = birthYear;
}

//Getters
public String getFirstName(){
     return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - birthYear;
        return  age;
    }



    //According to https://my.clevelandclinic.org/health/diagnostics/17402-pulse--heart-rate
    public int maxHeartRate(){
        int  maxHeart = (220 - getAge());
        return maxHeart;
    }



    //According to https://my.clevelandclinic.org/health/diagnostics/17402-pulse--heart-rate
    public double lowEndHeartRate(){
        double lowEnd = (int) Math.round(maxHeartRate() * 0.6);
        return lowEnd;
    }



    //According to https://my.clevelandclinic.org/health/diagnostics/17402-pulse--heart-rate
    public double HighEndHeartRate(){
        double highEnd = (int) Math.round(maxHeartRate() * 0.8); 
        return highEnd;
    }


    // Patient Details
    public void  printInfo(){
        System.out.println("Name : " + firstName + lastName);
        System.out.println("Date of Birth : " +birthDay + "/" + birthMonth + "/" + birthYear);
        System.out.println("Age : "+ getAge());
        System.out.println("Maximum Heart Rate : "+ maxHeartRate());
        System.out.println("Target Heart Rate :  " + lowEndHeartRate() + " -- " + HighEndHeartRate()); 
    }
}

