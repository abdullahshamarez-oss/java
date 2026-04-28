public class Account {
    private String accountNumber;
    private double balance;
    
    public Account(String accN,double b){
        if(accN == null || accN.trim().isEmpty()){
            throw new IllegalArgumentException("Account number must be valid(not be null)");
        }
        if(balance<0){
            throw new IllegalArgumentException("Balance must be something real ");
        }
        accountNumber = accN;
        balance = b;
    }
    
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setAccountNumber(String accN){
         if(accN == null || accN.trim().isEmpty()){
            throw new IllegalArgumentException("Account number must be valid(not be null)");
        }
        accountNumber = accN;
        System.out.println("New account number: "+accountNumber);
    }
    public void setBalance(double b){
        if(balance<0){
            throw new IllegalArgumentException("Balance must be something real ");
        }
        balance = b;
        System.out.println("New Balance: "+balance);
        
    }
    public void deposite(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("deposite something real ");
        }
        balance += amount;
        System.out.println("New Balance after deposite: "+balance);
    }
    public void withdraw(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("withsraw something real ");
        }
        balance -= amount;
        System.out.println("New Balance after withdrawal: "+balance);
    }
    
    public void displayDetails(){
        System.out.println("------------------");
        System.out.println("---Account details---");
        System.out.println("Account Number: "+getAccountNumber());
        System.out.println("Account Balance: "+getBalance());
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        try{
        Account acc1 = new Account("cie353f",4556.654);
        acc1.displayDetails();
        acc1.deposite(3533);
        acc1.withdraw(34233.33);
        acc1.setBalance(-354);
        acc1.setAccountNumber("");
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try{
        Account acc2 = new Account("or24wf",4553454.4);
        acc2.displayDetails();
        acc2.deposite(3533);
        acc2.withdraw(34233.33);
        acc2.setBalance(-354);
        acc2.setAccountNumber("");
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    
}

