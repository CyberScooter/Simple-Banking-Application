import java.util.ArrayList;

/**
 * Created by hrith on 10/07/2017.
 */
public class Bank {
    public String bankName;
    private ArrayList<Branch> branches;//attributes contain different data for different objects
                                        //branch class can be accessed from this ArrayList
                                        // as the type of the arraylist is Branch
    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String newBranch){
        if(findBranch(newBranch) == null){
            return branches.add(new Branch(newBranch));
        }
        return false;
    }

    public boolean listCustomers(String branch, boolean transactions){
            if(findBranch(branch) != null){
                System.out.println("Customer for branch: " + branch);

                ArrayList<Customer> branchCustomers = findBranch(branch).getCustomers();
                for(int x = 0; x < branchCustomers.size(); x++){
                    System.out.println("Customers: " + branchCustomers.get(x).getCustomerName() + " [" + x + "]");
                    if(transactions){
                        System.out.println("Transactions:");
                        ArrayList<Double> transactionsMade = branchCustomers.get(x).getTransaction();
                        for(int j = 0; j < transactionsMade.size(); j ++){
                            System.out.println("Transactions made: " + transactionsMade.get(j) + " [" + j + "]");
                        }
                    }
                }

            }
            return false;
    }

    public boolean addCustomerToBranch(String branch,String name, double initialTransaction){
        if(findBranch(branch) != null){
            return findBranch(branch).addNewCustomer(name, initialTransaction);
            // return object.addNewCustomer(name , amount);
            //findBranch(branch) is an object
            //the customers details is added to the arraylist customers but for the object only
        }
        return false;
    }

    public boolean addTransaction(String branch, String name, double amount){
        if(findBranch(branch) != null){
            return findBranch(branch).addCustomerTransaction(name , amount);
            // return object.addNewCustomerTransaction(name , amount);
            //findBranch(branch) is an object
            //the customers details is added to the arraylist transactions but for the object only
        }
        return false;
    }

    public Branch findBranch(String branchName){
        for(int i =0; i < branches.size(); i++){
            if(branches.get(i).getBranchName().equals(branchName)){
                return branches.get(i);
            }
        }
        return null;
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
}
