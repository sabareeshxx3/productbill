import java.util.Scanner;

class Products {
    int productNo;
    String productName;
    double cost;
    double qty;

    void display() {
        System.out.println("Product No: " + productNo);
        System.out.println("Product Name: " + productName);
        System.out.println("Cost: " + cost);
        System.out.println("Quantity: " + qty);
    }

    void read() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Product details (Product No, Product Name, Cost, Quantity):");

        productNo = s.nextInt();
        productName = s.next();
        cost = s.nextDouble();
        qty = s.nextDouble();
    }
}

public class BillDemo {
    public static void main(String[] args) {
        Products[] bill = new Products[5];

        for (int i = 0; i < 5; i++) {
            bill[i] = new Products();
            bill[i].read();
        }

        for (int i = 0; i < 5; i++) {
            bill[i].display();
        }
    }
}
