class RegularEmployee extends Employee {

    private double bonus;

    public RegularEmployee(String fname, String lname, int id,
                           String pos, String dept,
                           double hoursWork, double hourlyRate,
                           double bonus) {

        super(fname, lname, id, pos, dept, hoursWork, hourlyRate);
        this.bonus = bonus;
    }

    // Getter
    public double getBonus() {
        return bonus;
    }

    // Setter
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return (getHoursWork() * getHourlyRate()) + bonus;
    }
}