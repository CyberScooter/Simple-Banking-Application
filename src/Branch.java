import java.util.ArrayList;

/**
 * Created by hrith on 10/07/2017.
 */
public class Branch {
    public ArrayList<Customer> customers; //attributes contain different data for different objects
    private String branchName;

    public Branch(String branchName) {
        this.customers = new ArrayList<>();
        this.branchName = branchName;
    }

    public boolean addNewCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            return customers.add(new Customer(customerName, initialTransaction));
        } else {
            return false;
        }

    }
    public boolean addCustomerTransaction(String name, double amount){
        Customer customerCheck = findCustomer(name);
        if(customerCheck != null){
            customerCheck.addTransaction(amount);
            return true;
        }
        return false;

    }


    private Customer findCustomer(String name) {
        for (int x = 0; x < customers.size(); x++) {
            Customer checkCustomer = this.customers.get(x);
              if (checkCustomer.getCustomerName().equals(name)) {
                return checkCustomer;
            }
        }
        return null;
    }


    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getBranchName() {
        return branchName;
    }
}
