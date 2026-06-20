 import java.util.*;
class bank
{  String name;
long phone_no;
 double balance;
 double amount;
static int id=1000;
void createaccount()
	{    Scanner  s= new Scanner(System.in);
	     System.out.println("Enter the full name:");
	     name=s.nextLine();
	     System.out.println("Enter the phone no.( # exactly having 10 digits)");
	      phone_no=s.nextLong();
                   String hexid=Integer.toHexString(id);
                  System.out.println("Enter the account balance:");
                   balance=s.nextDouble();
	      System.out.println("the account is created for the customer id : "+hexid);
	     System.out.println("name: "+name+"\nphone no.: "+phone_no+"\n balance: "+balance);
	     id++;}
	void withdrawl(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account balance:");
		  balance=sc.nextDouble();
		System.out.println("Enter the amount:");
		amount=sc.nextDouble();
	            String hexid =Integer.toHexString(id);
		if(balance>=amount)
		{         System.out.println("allow access");
			balance-=amount;
				System.out.println("the amount is withdrawn by customer id: "+hexid+" is "+amount+"/- Rs. only and remaining balance: "+balance+" /-Rs.");}
		else{
			System.out.println("access denied !");} }
	void deposit(){
		   Scanner ab = new Scanner(System.in);
		   System.out.println("Enter the account balance:");
		   balance=ab.nextDouble();
		   System.out.println("Enter the amount:");
		   amount=ab.nextDouble();
		   balance+=amount;
		    String hexid =Integer.toHexString(id);
		    System.out.println("the amount is deposited by customer id: "+hexid+" is "+amount+" /-Rs. only and total balance: "+balance+" /-Rs." ); }
	 void displaydetails(){
	        System.out.println("the customer ids : ");
	       String hexid=Integer.toHexString(id);
	        System.out.println(hexid+" having balance "+balance+"Rs./-");
				id++;}	}
 class Main{
	public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);
	int	n=1000;
              bank[] customers = new bank[n];
              for (int i = 0; i < n; i++) {
              customers[i] = new bank();}
   for (bank customer : customers) {
    System.out.println("Welcome to the bank!");
    System.out.println("Please choose an option:");
    System.out.println("1. Create Account");
    System.out.println("2. Deposit");
    System.out.println("3. Withdraw");
    System.out.println("4.Exit");
    int choice = scanner.nextInt();
      switch (choice) {
        case 1:
            customer.createaccount();
             break;
        case 2:
            customer.deposit();
            customer.displaydetails();
            break;
        case 3:
            customer.withdrawl();
            customer.displaydetails();
            break;
        case 4:
        	System.out.println("Thank you, have a great day sir!" );
        	System.exit(1);
         default:
            System.out.println("Invalid choice");    }  } } }
