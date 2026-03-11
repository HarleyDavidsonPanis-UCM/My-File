import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Regular Employee Input
        System.out.println("Enter Regular Employee Info:");
        System.out.print("First Name: ");
        String reFname = sc.nextLine();
        System.out.print("Last Name: ");
        String reLname = sc.nextLine();
        System.out.print("ID No: ");
        int reId = sc.nextInt(); sc.nextLine();
        System.out.print("Position: ");
        String rePos = sc.nextLine();
        System.out.print("Department: ");
        String reDept = sc.nextLine();
        System.out.print("Hours Worked: ");
        double reHours = sc.nextDouble();
        System.out.print("Hourly Rate: ");
        double reRate = sc.nextDouble();
        System.out.print("Bonus: ");
        double reBonus = sc.nextDouble();
        sc.nextLine();

        RegularEmployee reg = new RegularEmployee(reFname, reLname, reId,
                rePos, reDept, reHours, reRate, reBonus);

        // Contractual Employee Input
        System.out.println("\nEnter Contractual Employee Info:");
        System.out.print("First Name: ");
        String ceFname = sc.nextLine();
        System.out.print("Last Name: ");
        String ceLname = sc.nextLine();
        System.out.print("ID No: ");
        int ceId = sc.nextInt(); sc.nextLine();
        System.out.print("Position: ");
        String cePos = sc.nextLine();
        System.out.print("Department: ");
        String ceDept = sc.nextLine();
        System.out.print("Hours Worked: ");
        double ceHours = sc.nextDouble();
        System.out.print("Hourly Rate: ");
        double ceRate = sc.nextDouble();
        System.out.print("Overtime Hours: ");
        double ceOver = sc.nextDouble();
        sc.nextLine();

        ContractualEmployee con = new ContractualEmployee(
                ceFname, ceLname, ceId, cePos, ceDept,
                ceHours, ceRate, ceOver);

        // Student Input
        System.out.println("\nEnter Student Info:");
        System.out.print("First Name: ");
        String stFname = sc.nextLine();
        System.out.print("Last Name: ");
        String stLname = sc.nextLine();
        System.out.print("Student ID: ");
        int stId = sc.nextInt(); sc.nextLine();
        System.out.print("Course: ");
        String stCourse = sc.nextLine();
        System.out.print("Department: ");
        String stDept = sc.nextLine();

        Student stu = new Student(stFname, stLname, stId, stCourse, stDept);

        
        System.out.println("\n=== Regular Employee ===");
        System.out.println(reg.displayInfo());
        System.out.println("Salary: " + reg.calculateSalary());

        System.out.println("\n=== Contractual Employee ===");
        System.out.println(con.displayInfo());      
        System.out.println("Salary: " + con.calculateSalary()); 

        System.out.println("\n=== Student ===");
        System.out.println(stu.displayInfo());

        sc.close();
    }
}