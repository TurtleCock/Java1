package edu.acc.java;
public class Account {
    String name;
    String street;
    String city;
    String state;
    String zip;
    int balance;
    int maxOverDraft;

static public void main (String[] args) {

System.out.println("Test");
Account defaultConstructor = new Account();
Account balanceContructor = new Account(700,50);
Account allParamsConstructor = new Account("Jimbo Marsh", "171 South Park", "South Park", "CO", "654345", 1500, 12);
System.out.println("defaulConstructor balance " + defaultConstructor.balance + " maxOverDraft is " + defaultConstructor.maxOverDraft);
System.out.println("defaulConstructor balance " + defaultConstructor.getBalance() + " maxOverDraft is " + defaultConstructor.getMaxOverDraft());
System.out.println("balanceConstructor balance " + balanceContructor.getBalance() + " maxOverDraft is " + balanceContructor.getMaxOverDraft());
System.out.println("allParamsConstructor balance " + allParamsConstructor.getBalance() + " maxOverDraft is " + allParamsConstructor.getMaxOverDraft());
System.out.println("allParamsConstructor name " + allParamsConstructor.getName() + " Street is " + allParamsConstructor.getStreet());
System.out.println("allParamsConstructor zip " + allParamsConstructor.getZip() + " State is " + allParamsConstructor.getState());

//double Overdraft = allParamsConstructor.withdrawal(1520.12);
//System.out.println("Overdraft is " + Overdraft);
double withdrawlMoney = allParamsConstructor.withdrawal(1300.21);
System.out.println("balance after withdrawal of 1300.21 is " + allParamsConstructor.getBalance());


}

//setters
public void setName(String name) { this.name = name; }
public void setStreet(String street) { this.street = street; }
public void setCity(String city) { this.city = city; }
public void setState(String state) { this.state = state; }
public void setZip(String zip) { this.zip = zip; }
public void setBalance(int balance) { this.balance = balance; }
public void setMaxOverDraft(int maxOverDraft) { this.maxOverDraft = maxOverDraft; }

//getters
public String getName(){ return name;}
public String getStreet(){ return street;}
public String getCity(){ return city;}
public String getState(){ return state;}
public String getZip(){ return zip;}
public int getBalance(){ return balance;}
public int getMaxOverDraft(){ return maxOverDraft;}

//constructors
public Account(){
    balance = 500;
    maxOverDraft = -100;
}

public  Account(int balance, int maxOverDraft){
    this.balance = balance;
    this.maxOverDraft = maxOverDraft;
}

public Account(String name, String street, String city, String state, String zip, int balance, int maxOverDraft){
    this.name = name;
    this.street = street;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.balance = balance;
    this.maxOverDraft = maxOverDraft;
}

public double deposit(double amount){
    this.balance += amount;
    return balance;
}

public double withdrawal(double amount) {
    double subBalance = (balance - amount);
    if(subBalance < this.maxOverDraft){
        throw new IllegalArgumentException(amount + "Amount exceeds over draft limit.");
    }
    return balance - amount;
    //return balance;
}

}
