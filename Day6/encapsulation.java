class BankAccount{
    //1. private fields(hidden from outside)
    private String holderName;
    private double balance;

    public BankAccount(String holderName,double balance){
        this.holderName=holderName;
        setBalance(balance); // use setter for validation

    } 
    //  Getter (read only access)
    public double getBalance(){
        return this.balance;
    }

    //Setter (controled write access with validation)
    public void setBalance(double amount){
        if(amount>=0){
            this.balance=amount;
        }else{
            System.out.println("Invalid balance: cannot be negative!");
        }
    }
}
public class encapsulation {
    public static void main(String[] args){
        BankAccount acc=new BankAccount("Srushti", 500);
        // acc.balance=-100 // compiler error balance has private access
        acc.setBalance(-100);  //Prints:Invalid balance: cannot be negative
        System.out.println(acc.getBalance());
    }        
}
