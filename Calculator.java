import java.util.Scanner; 
 
public class Calculator { 
 
    private double num1, num2; 
 
    // Methods for operations 
    private double add(double a, double b) { 
        return a + b; 
    } // Base class: Book
class Book {
    // Attributes of the Book class
    private String title;
    private String author;
    private String ISBN;

    // Constructor for Book
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getters and setters for Book attributes
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}

// Derived class: LibraryBook which inherits from Book
class LibraryBook extends Book {
    private boolean isAvailable;

    // Constructor for LibraryBook
    public LibraryBook(String title, String author, String ISBN, boolean isAvailable) {
        // Call to the parent class constructor
        super(title, author, ISBN);
        this.isAvailable = isAvailable;
    }

    // Getter and setter for availability
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Overridden method to display LibraryBook info, including availability
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call parent class displayInfo()
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        // Create an instance of LibraryBook
        LibraryBook libraryBook = new LibraryBook("Java Programming", "John Doe", "1234567890", true);
        
        // Display the information of the library book
        libraryBook.displayInfo();
    }
}

 
    private double subtract(double a, double b) { 
        return a - b; 
    } 
 
    private double multiply(double a, double b) { 
        return a * b; 
    } 
 
    private double divide(double a, double b) { 
        if (b == 0) { 
            System.out.println("Error: Division by zero is not allowed."); 
            return 0; 
        } 
        return a / b; 
    } 
 
    // Perform calculation 
    public void calculate() { 
        Scanner sc = new Scanner(System.in); 
        try { 
            System.out.print("Enter first number: "); 
            num1 = sc.nextDouble(); 
 
            System.out.print("Enter second number: "); 
            num2 = sc.nextDouble(); 
 
            System.out.print("Enter operator (+, -, *, /): "); 
            char op = sc.next().charAt(0); 
 
            double result = 0; 
            switch (op) { 
                case '+': 
                    result = add(num1, num2); 
                    break; 
                case '-': 
                    result = subtract(num1, num2); 
                    break; 
                case '*': 
                    result = multiply(num1, num2); 
                    break; 
                case '/': 
                    result = divide(num1, num2); 
                    break; 
                default: 
                    System.out.println("Invalid operator! Please use +, -, * or /."); 
                    return; 
            } 
 
            System.out.println("Result: " + result); 
 
        } catch (Exception e) { 
            System.out.println("Invalid input! Please enter numeric values."); 
        } 
    } 
 
    // Main Method 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        boolean cont = true; 
 
        while (cont) { 
            Calculator calc = new Calculator(); 
            calc.calculate(); 
 
            System.out.print("Do you want to perform another calculation? (yes/no): "); 
            String ans = sc.next().toLowerCase(); 
 
            if (ans.equals("yes")) { 
                cont = true; 
            } else { 
                cont = false; 
                System.out.println("Goodbye!"); 
            } 
        } 
 
        sc.close(); 
    } 
} 
