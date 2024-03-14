/* Create a base class Employee with common attributes such as name and employeeId. Then,
create two subclasses: Manager and Developer. Use the super keyword to invoke the constructor
of the parent class and access its methods. */

class Employee {
    private String name;
    private int employeeId;

    // Constructor
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee: " + name + ", Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    private String department;

    // Constructor invoking the superclass constructor using super
    public Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    // Method to display manager information
    public void displayManagerInfo() {
        super.displayInfo(); // invoking the method from the superclass
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    // Constructor invoking the superclass constructor using super
    public Developer(String name, int employeeId, String programmingLanguage) {
        super(name, employeeId);
        this.programmingLanguage = programmingLanguage;
    }

    // Method to display developer information
    public void displayDeveloperInfo() {
        super.displayInfo(); // invoking the method from the superclass
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Q9 {
    public static void main(String[] args) {
        // Example usage
        Manager manager = new Manager("John Cena", 101, "Sales");
        Developer developer = new Developer("Peter Shawn", 202, "Java");

        manager.displayManagerInfo();
        developer.displayDeveloperInfo();
    }
}