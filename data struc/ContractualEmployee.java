class ContractualEmployee extends Employee {

    private double overtimeHours;

    public ContractualEmployee(String fname, String lname, int id,
                               String pos, String dept,
                               double hoursWork, double hourlyRate,
                               double overtimeHours) {
        super(fname, lname, id, pos, dept, hoursWork, hourlyRate);
        this.overtimeHours = overtimeHours;
    }

    // Getter and Setter
    public double getOvertimeHours() { return overtimeHours; }
    public void setOvertimeHours(double overtimeHours) { this.overtimeHours = overtimeHours; }


    @Override
    public double calculateSalary() {
        double regularPay = getHoursWork() * getHourlyRate();
        double overtimePay = overtimeHours * getHourlyRate() * 1.10;
        return regularPay + overtimePay;
    }

    @Override
    public String displayInfo() {
        return "Overtime Pay: " + (overtimeHours * getHourlyRate() * 1.10);
    }
}