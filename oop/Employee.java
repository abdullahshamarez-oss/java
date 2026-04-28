public class Employee {
   private String name;
   private String employeeId;
   private double salary;
   
   public Employee(String N, String ID, double S){
       if(N.trim().isEmpty() || N == null){
           throw new IllegalArgumentException("Name can't be null or empty");
       }
       if(ID.trim().isEmpty() || ID == null){
           throw new IllegalArgumentException("EmployeeId can't be null or empty");
       }
       if(S <= 0){
           throw new IllegalArgumentException("Salary can't zero");
       }
       name = N;
       employeeId = ID;
       salary = S;
               
   }
   
   public String getName(){
       return name;
   }
   
   public String getEmployeeId(){
       return employeeId;
   }
   public double getSalary(){
       return salary;
   }
   public void setSalary(double S){
       if(S <= 0){
           throw new IllegalArgumentException("Salary can't zero");
       }
       salary = S;
   }
   public void displayDetails(){
       System.out.println("======================");
       System.out.println("---Employee Details---");
       System.out.println("Name: "+getName());
       System.out.println("Employee Id: "+getEmployeeId());
       System.out.println("Salary: "+getSalary());
       System.out.println("======================");
   }
public static void main(String[] args) {
        try{
            Employee E1 = new Employee("ABDU","243FEERE",33000);
            E1.displayDetails();
            E1.setSalary(-34334);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try{
            Employee E2 = new Employee("Ali","240pkr",30000);
            E2.displayDetails();
            E2.setSalary(0);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    
}
