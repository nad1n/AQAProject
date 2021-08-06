package school.lesson3;

import java.sql.Array;
import java.util.Arrays;

public class HomeWorkApp {

    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer",
                "ivivan@mailbox.com", "892312312", 30000, 30);
        // [1] - пустой, чтоб проверить работу конструктора
        persArray[1] = new Person();
        persArray[2] = new Person("Petrov Petr", "CEO",
                "pepetr@mailbox.com", "892314312", 35000, 42);
        persArray[3] = new Person("Yanov Yan", "Manager",
                "yayanov@mailbox.com", "892314322", 28000, 22);
        persArray[4] = new Person("Levov Lev", "Boss",
                "lelev@mailbox.com", "895314322", 40000, 40);

        System.out.println("All persons:");

        for (int i=0; i<5; i++){
            persArray[i].info();
        }

        System.out.println();
        System.out.println("Persons who 40+");

        for (int i=0; i<5; i++){
            if (persArray[i].getAge() >= 40)
                persArray[i].info();
        }

    }

}
