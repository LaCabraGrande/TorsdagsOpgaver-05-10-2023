// Task 1
package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("Holger", "Rune", "Holger_Rune"));
        customers.add(new Customer("Peter", "Larsen", "Peter_Larsen"));
        customers.add(new Customer("Georg", "Hansen", "Georg_Hansen"));
        printCustomers(customers);
    }
        static void printCustomers(ArrayList<Customer> customers) {
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}
