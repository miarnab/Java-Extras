import java.io.*;
class SavingAcc extends bankAcc{
    public double rate;
    public void addInterest(int months){
        long interest;
        interest=(long)(balance*rate/100.0*months/12.0);
        balance=balance+interest;
    }
    public SavingAcc(String fn,String sn,String ad,double r){
        super(fn,sn,ad);
        rate=r;
    }
    public static void main(String args[]){
        BankAcc b1,b2;
        
        b1=new BankAcc("Rubina","Khan","D.Park");
        b2=new BankAcc("Tupur","Sen","S.lake");
        b1.deposit(15500);
        b2.deposit(10000);
        b1.display();
        b2.display();
        b1.withdraw(5500);
        b2.withdraw(11000);
        b1.display();
        b2.display();
        SavingAcc depacc;
        depacc=new SavingAcc("Bula","Paul","P.Lane",9.0);
        depacc.deposit(10000);
        depacc.addInterest(10);
        depacc.display();
    }
}

