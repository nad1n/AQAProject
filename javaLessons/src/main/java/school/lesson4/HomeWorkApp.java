package school.lesson4;

public class HomeWorkApp {

    public static void main(String[] args) {

        //Create animals

        Animal animal = new Animal("Oscar");

        Cat catBars = new Cat("Bars", "ginger");
        Cat catMusya = new Cat("Musya", "stripe");
        Dog dogBobik = new Dog("Bobik", "black");
        Dog dogBelka = new Dog("Belka", "white");
        Dog dogStrelka = new Dog("Strelka", "brown");


        animal.info();
        catBars.info();
        catMusya.info();
        catBars.swim(50);
        catBars.swim(-50);
        dogBobik.info();
        dogBobik.run(550);
        dogBobik.run(0);
        dogBobik.run(-550);
        dogBobik.swim(-550);
        dogBelka.info();
        dogStrelka.info();

        //Count animals
        Animal.calc();
        Cat.catCalc();
        Dog.dogCalc();

        System.out.println();
        System.out.println("========================");

        //Create plates
        Cat catNyam = new Cat("Nyam", "dotted", 25);
        Cat catChik = new Cat("Chik", "red", 14);
        Plate plateNyam = new Plate(15);
        Plate plateChik = new Plate(42);

        catChik.eat(plateChik);
        catNyam.eat(plateNyam);

        catChik.info();
        catNyam.info();

        //Task 6
        Payment payment = new Payment();
        payment.setPayment(3);
        payment.printCheque();


        //Task 7
        Park.Attraction wheel = new Park("Gorky Park").new Attraction("Ferris Wheel", "General", 50);
        Park.Attraction roller = new Park("Gorky Park").new Attraction("Roller Coaster", "Extreme", 50);

        wheel.attrInfo();

        //Task 8

        //не успеваю!!! доделаю в среду в течении дня

    }

}
