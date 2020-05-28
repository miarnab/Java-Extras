import java.io.*;
class bankAcc
{   protected static int nextAccNo=1;
    protected String firstName;
    protected String address;
    protected int accNo;
    protected long balance;
    public BankAcc(String fn,String sn,String ad){
        firstName=fn;
        surName=sn;
        address=ad;
        balance=1000;
        accNo=nextAccNo;
        ++nextAccNo;
    }
    public long getBalance(){
        return balance;
    }
    public void deposit(long amount){
        balance=balance+Amount;
    }
    public void withdraw(long amount){
        if((balance-amount)>1000)
        balance=balance-amount;
        else
        System.out.println("Can't withdraw at the main balance would be<1000 after this withdrawl.");
    }
    public void display(){
        System.out.println("\nCustomer"+firstName+" "+surName);
        System.out.println("Account Number="+accNo);
        System.out.println("Account Balance="+(balance/100.0));
    }
}