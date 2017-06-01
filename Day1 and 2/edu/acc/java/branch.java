package edu.acc.java;
public class Branch {
	String branchNumber;
	String address;

	public static void main (String[] args) {
            Branch myBranch = new Branch("13","3300 Bee Caves");
            Employee joe = new Employee(1200, "Joe");
            //myBranch.getAddr();
            //myBranch.getName();
						System.out.println("employee name is " + joe.name);
						System.out.println("employee salary is " + joe.salary);
						System.out.println("Branch is " + myBranch.getBranchNumber() + " and address is " + myBranch.getBranchAddress());
	}

	public Branch(String branchNumber, String address){
	    this.branchNumber = branchNumber;
			this.address = address;
	}
  public String getBranchNumber(){ return this.branchNumber;}
	public String getBranchAddress(){ return this.address;}


	public String getName(){ return "Round Rock";}
	public String getAddr(){ return "123 Pine Street";}
}
