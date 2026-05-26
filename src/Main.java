// Create a Student class with attributes and methods.
class Student {

    String name;
    int age;
    String grade;

    // Constructor
    Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {

        // Creating object of Student class
        Student s1 = new Student("Biswajit", 22, "A");

        s1.displayInfo();

        // Creating object of BankAccount class
        BankAccount acc = new BankAccount(1000);

        acc.deposit(500);
        acc.withdraw(300);

        System.out.println("Current Balance: " + acc.getBalance());
    }
}


// Create a BankAccount class using encapsulation.
class BankAccount {

    // Private variable (Encapsulation)
    private double balance;

    // Constructor
    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Getter method
    public double getBalance() {
        return balance;
    }
}