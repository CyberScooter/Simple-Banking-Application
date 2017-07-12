/**
 * Created by hrith on 10/07/2017.
 */
public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Barclays");

        bank.addBranch("Bracknell");

        bank.addCustomerToBranch("Bracknell", "Tim", 50.05);
        bank.addCustomerToBranch("Bracknell", "Mike", 175.34);
        bank.addCustomerToBranch("Bracknell", "Percy", 220.12);

        bank.addBranch("Reading");
        bank.addCustomerToBranch("Reading", "Bob", 150.54);

        bank.addTransaction("Bracknell", "Tim", 44.22);
        bank.addTransaction("Bracknell", "Tim", 12.44);
        bank.addTransaction("Bracknell", "Mike", 1.65);

        //System.out.println(bank.getBranches());
        //System.out.println(bank.listCustomers("Bracknell", true));
        System.out.println(bank.getBankName());
        System.out.println(bank.getBranches().get(0).getCustomers().get(0).getCustomerName());
        System.out.println(bank.getBranches().get(1).getCustomers().get(0).getCustomerName());


    }
}