

public class Employee {
    static private String name;
    static private String position;
    static private String eMail;
    static private int phoneNum;
    static private int salary;
    static private int age;


    public Employee(String name, String position, String eMail, int phoneNum, int salary, int age){
        this.name = name;
        this.position = position;
        this.eMail = eMail;

        if ( age >= 40){
            System.out.println(name + ": " + position + ", " + eMail + ", " + phoneNum + ", " + salary + ", "
                    + age + ".");}




    }

}
