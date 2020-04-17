import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1, "Firdovsi", "Rustemov"));
        customers.add(new Customer(2, "Tamerlan", "Rustemov"));
        customers.add(new Customer(3, "Engin", "Demirog"));

        customers.remove(new Customer(1, "Firdovsi", "Rustemov"));

        for (Customer customer : customers) {
            System.out.println(customer.firstName);
        }
    }
}
