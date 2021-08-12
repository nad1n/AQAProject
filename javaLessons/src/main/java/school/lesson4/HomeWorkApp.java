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
        System.out.println(" \n ========================\n Task 6 \n");

        Payment payment = new Payment();
        payment.setPayment(1);
        payment.printCheque();


        //Task 7
        System.out.println(" \n ========================\n Task 7 \n");


        Park parkGorkiy = new Park("Gorky Park");
        parkGorkiy.addAtraction(parkGorkiy.new Atraction("Ferris Wheel", "General", 40));
        parkGorkiy.addAtraction(parkGorkiy.new Atraction("Roller Coaster", "Extreme", 50));

        Park molodist = new Park("Molodist");
        molodist.addAtraction(molodist.new Atraction("Swing", "Kids", 0));
        molodist.addAtraction(molodist.new Atraction("SeeSaw", "Kids", 0));
        molodist.addAtraction(molodist.new Atraction("Tramp", "Kids", 30));

        System.out.println(parkGorkiy.parkInfo());
        System.out.println(molodist.parkInfo());


        //Task 8
        System.out.println(" \n ========================\n Task 8 \n");

        Rectangle rect1 = new Rectangle("green", "red", 5, 5);
        System.out.println(rect1.info());

        Round round = new Round("red", "yellow", 3);
        System.out.println(round.info());

        Triangle triangle = new Triangle("brown", "white", 2,2,5);
        System.out.println(triangle.info());


    }

}
