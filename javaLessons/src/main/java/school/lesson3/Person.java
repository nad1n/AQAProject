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

    }

    public Person(){
        this.name = "Jonh Doe";
        this.job = "unknown";
        this.email = "empty";
        this.phone = "empty";
        this.salary = 30000;
        this.age = 30;
    }

    public void info(){
        System.out.println("{ Person: " + getName() + "; Job: " + getJob() + "; Email: " + getEmail() +
                "; Phone: " + getPhone() + "; Salary: " + getSalary() + "; Age: " + getAge() + "}");
    }

    public String getName (){
        return name;
    }

    public String getJob (){
        return job;
    }

    public String getEmail (){
        return email;
    }

    public String getPhone (){
        return phone;
    }

    public int getSalary (){
        return salary;
    }

    public int getAge (){
        return age;
    }

    public String toString(){
        return("{ Person: " + getName() + "; Job: " + getJob() + "; Email: " + getEmail() +
                "; Phone: " + getPhone() + "; Salary: " + getSalary() + "; Age: " + getAge() + "}");
    }

}
