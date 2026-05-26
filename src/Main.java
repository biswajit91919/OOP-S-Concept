//Create a Student class with attributes and methods.
class Student {
    // Attributes
    String name;
    int age;
    String grade;

    // Constructor
    Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Methods
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
