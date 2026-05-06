import java.util.*;
public class Library {
    private String author;
    private String title;
    private double price;

    public Library(String a, String t, double p){
        setAuthor(a);
        setTitle(t);
        setPrice(p);
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }

    public void setAuthor(String a){
        if(a == null || a.trim().isEmpty()){
            throw new IllegalArgumentException("Author name cannot be null or empty.");
        }
        author = a;
    }
    public void setTitle(String t){
        if(t == null || t.trim().isEmpty()){
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        title = t;
    }

    public void setPrice(double p){
        if(p <= 0){
            throw new IllegalArgumentException("Price must be greater than zero.");
        }
        price = p;
    }
    public static void main(String[] args){
        Library L1 = new Library("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", 19.99);

        System.out.println("Author: " + L1.getAuthor());
        System.out.println("Title: " + L1.getTitle());
        System.out.println("Price: $" + L1.getPrice());
        L1.setPrice(24.99);
        System.out.println("Updated Price: $" + L1.getPrice());
        System.out.println();

        System.out.println("=======Library Details=======");
        System.out.println("=======print through Scanner=======" );

        Scanner input = new Scanner(System.in);

        while(true){
            try{
                if(input.hasNextLine()){
                    input.nextLine();
                }
                System.out.println("Enter Book Author: ");
                String author = input.nextLine();;
                L1.setAuthor(author);
                System.out.println("Author updated successfully.");
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        while(true){
            try{
                System.out.println("Enter Book Title; ");
                String title = input.nextLine();
                L1.setTitle(title);
                System.out.println("Title updated successfully.");
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        while(true){
            try{
                System.out.println("Enter Book Price: ");
                double price = input.nextDouble();
                L1.setPrice(price);
                System.out.println("Price updated successfully.");
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
