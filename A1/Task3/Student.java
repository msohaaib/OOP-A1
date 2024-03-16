package A1.Task3;

public class Student {
    private static String id;
    private String name;
    private String age;
    private String grade;
    Student(){
        id = "" ;
        name = "" ;
        grade = "" ;
    }
    static void setId(String ide){
        id = ide;
    }
    public void setName(String nam){
        name = nam;
    }
    public void setAge(String ag){
        age = ag;
    }
    public void setGrade(String grd){
        grade = grd;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
    public String getGrade(){
        return grade;
    }
    public void details(){
        System.out.println("*****************");
        System.out.println("Student id : "+getId());
        System.out.println("Student Name : "+getName());
        System.out.println("Student Age : "+getAge());
        System.out.println("Student Grade : "+getGrade());
        System.out.println("*****************");
    }
}
