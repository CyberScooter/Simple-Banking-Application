import java.util.ArrayList;

/**
 * Created by hrith on 10/07/2017.
 */
public class Customer {
    public ArrayList<Double> transaction = new ArrayList<>();//attributes contain different data for different objects
    private String customerName;

    public Customer(String customerName, double initialTransaction) {
        this.transaction = new ArrayList<Double>();
        this.customerName = customerName;
        addTransaction(initialTransaction);
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public void addTransaction(double transactions) {
        transaction.add(transactions);
    }

    public String getCustomerName(){
        return customerName;
    }

    public void name(String name) {
        this.customerName = name;
    }
}


