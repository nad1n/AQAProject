package school.lesson4;

import java.util.Scanner;

public class Payment {


    private int id; //id payment
    private Product[] prodArray; //list of products
    private int cost; //cost of payment
    private int sumCost;

    public Payment() {
        this.id = 1;
        this.cost = 0;
    }

    private class Product {

        private String productName;
        private int productCost;

        public Product() {
            super();
            productName = "";
            productCost = 0;
        }

        public Product(String productName, int productCost) {
            super();
            this.productName = productName;
            this.productCost = productCost;
        }

        public String getProductName() {
            return this.productName;
        }

        public int getProductCost() {
            return this.productCost;
        }

    }


    public void setPayment() {
        this.cost = 0;
        System.out.print("Введите количество товаров, которое Вы хотите приобрести: ");

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        if (count == 0) {
            System.out.println("Вы не хотите делать покупки!");
        } else {
            if (count > 0) {
                prodArray = new Product[count];
                for (int i = 0; i < count; i++) {
                    System.out.println("Товар " + (i + 1) + ": ");
                    System.out.print("Наименование: ");
                    String str_name = sc.next();
                    System.out.print("Цена: ");
                    int prod_cost = sc.nextInt();
                    sumCost += prod_cost;

                    prodArray[i] = new Product(str_name, prod_cost);
                    this.cost = this.cost + prodArray[i].productCost;
                }
            } else {
                System.out.println("Вы не хотите делать покупки!");
                System.out.println("Неверный формат");
            }

        }

    }

    public void setPayment(int count) {
        this.cost = 0;
        Scanner sc = new Scanner(System.in);

        if (count == 0) {
            System.out.println("Вы не хотите делать покупки!");
        } else {
            if (count > 0) {
                prodArray = new Product[count];
                for (int i = 0; i < count; i++) {
                    System.out.println("Товар " + (i + 1) + ": ");
                    System.out.print("Наименование: ");
                    String str_name = sc.next();
                    System.out.print("Цена: ");
                    int prod_cost = sc.nextInt();
                    sumCost += prod_cost;

                    prodArray[i] = new Product(str_name, prod_cost);
                    this.cost = this.cost + prodArray[i].productCost;
                }
            } else {
                System.out.println("Вы не хотите делать покупки!");
                System.out.println("Неверный формат");
            }

        }

    }

    public void printCheque() {
        System.out.println("============================");
        System.out.println("Чек №" + this.id);
        System.out.println("============================");

        for (int i = 0; i < this.prodArray.length; i++) {
            System.out.println(i + 1 + "  " + prodArray[i].productName + "  " + prodArray[i].productCost + " грн");
        }

        System.out.println("============================");
        System.out.println("Общая стоимость: " + sumCost + " грн");
        System.out.println("============================");
        sumCost = 0;
    }
}
