package school.lesson3;

public class Person {
    private String name;
    private String job;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String name, String job, String email, String phone, int salary, int age){
        this.name = name;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

        System.out.println("{ Person: " + this.name + "; Job: " + this.job + "; Email: " + this.email +
                "; Phone: " + this.phone + "; Salary: " + this.salary + "; Age: " + this.age + "}") ;
    }

    public Person(){
        this.name = "Jonh Doe";
        this.job = "unknown";
        this.email = "empty";
        this.phone = "empty";
        this.salary = 30000;
        this.age = 30;

        System.out.println("{ Person: " + this.name + "; Job: " + this.job + "; Email: " + this.email +
                "; Phone: " + this.phone + "; Salary: " + this.salary + "; Age: " + this.age + "}") ;
    }

    public int outOld (){
        return age;
    }

    public String toString(){
        return("{ Person: " + name + "; Job: " + job + "; Email: " + email +
                "; Phone: " + phone + "; Salary: " + salary + "; Age: " + age + "}");
    }

}
