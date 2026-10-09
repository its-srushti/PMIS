

class BankAccount {
String accountHolder;
double balance;
BankAccount(String accountHolder,double balance){
    this.accountHolder=accountHolder;
    this.balance=balance;

}   
void deposit(double amount){
    balance+=amount;
    System.out.println("Deposited:"+amount);
    System.out.println("New Baalance:"+balance);
}
void withdraw(double amount){
    if(amount<=balance){
        balance -=amount;
        System.out.println("Withdrawal:"+amount);
        System.out.println("Updated Balance:"+balance);
    

    }else{
        System.out.println("Insufficient blance");
    }

}
void displayAccount(){

        System.out.println("Account Holder Nmae"+accountHolder);
        System.out.println("Current Balance:"+balance);

}
}
public class test{
    public static void main(String[] args){
        BankAccount b1=new BankAccount("Diksha",200,)
    }
}
}
