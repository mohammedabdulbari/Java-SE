package practise;

class Account{
    private long accountNumber;
    private String name;
    private String address;
    private long phoneNumber;
    private String dob;
    protected double balance;
    
    public long getAccNumber(){
        return accountNumber;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String add){
         this.address=add;
    }
   public  long getPhNumber(){
        return phoneNumber;
    }
    public void setPhNumber(long num){
        this.phoneNumber=num;
    }
    public String getDob(){
        return dob;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double bal){
        this.balance=bal;
    }
    public Account(long acc,String name,String add,long phone,String dob){
        this.accountNumber=acc;
        this.name=name;
        this.address=add;
        this.phoneNumber=phone;
        this.dob=dob;
        if(this.balance <=0){
            this.balance=0.00;
        }
        else{
            this.balance = getBalance();
        }
    }
}
class SavingAccount extends Account{
	public SavingAccount(long acc,String name,String add,long phone,String dob) {
		super(acc,name,add,phone,dob);
	}
	public void deposit(double amount) {
		balance +=amount;
	}
	public void withdraw(double amount) {
		if(getBalance() > 0) {
			balance -=amount;
		}
		else {
			balance=0.00;
		}
	}
}

class LoanAccount extends SavingAccount{
	public LoanAccount(long acc,String name,String add,long phone,String dob) {
		super(acc,name,add,phone,dob);
	}
	public void interestRate(double rate) {
		if(getBalance() < 200) {
			balance = balance * 0.5 + rate;
		}
		else if(getBalance() > 200 && getBalance() < 1000) {
			balance = balance * 1.5 + rate;
		}
		else {
			balance = balance *3 + rate;
		}
	}
}
public class SCInherit
{
	public static void main(String[] args) {
	    //Account a= new Account(1230010100,"Jazib","New Karimganj",808850,"26-07-2000");
	    //a.setBalance(0);
		LoanAccount a= new LoanAccount(1230010100,"Jazib","New Karimganj",808850,"26-07-2000");
		a.deposit(100);
		a.withdraw(10);
		a.interestRate(5);
		//a.setBalance(600);
	    System.out.println("Account no:" +a.getAccNumber()+"\n" +"Name: "+a.getName()+"\n"+"Address: "+a.getAddress()+"\n"+"Phone: "+a.getPhNumber()+"\n"+"DOB: "+a.getDob()+"\n"+"Balance:"+a.getBalance());
	}
}

