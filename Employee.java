abstract class Employee extends Person {

    private int idNo;
    private String position;
    private String department;
    protected double hoursWork;
    protected double hourlyRate;

    public Employee(String fname, String lname, int id,
                    String pos, String dept,
                    double hoursWork, double hourlyRate) {

        super(fname, lname);
        this.idNo = id;
        this.position = pos;
        this.department = dept;
        this.hoursWork = hoursWork;
        this.hourlyRate = hourlyRate;
    }

    // Getters
    public int getIdNo() {
        return idNo;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public double getHoursWork() {
        return hoursWork;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    // Setters
    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setHoursWork(double hoursWork) {
        this.hoursWork = hoursWork;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // ONLY ONE displayInfo override here
    @Override
    public String displayInfo() {
        return "ID: " + idNo +
               " | Name: " + getFirstName() + " " + getLastName() +
               " | Position: " + position +
               " | Department: " + department;
    }

    public abstract double calculateSalary();
}