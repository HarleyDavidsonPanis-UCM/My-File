class ContractualEmployee extends Employee {

    private double contractAmount;
    private int contractMonths;

    public ContractualEmployee(String fname, String lname, int id,
                                String pos, String dept,
                                double hoursWork, double hourlyRate,
                                double contractAmount, int contractMonths) {

        super(fname, lname, id, pos, dept, hoursWork, hourlyRate);
        this.contractAmount = contractAmount;
        this.contractMonths = contractMonths;
    }

    // Getters
    public double getContractAmount() {
        return contractAmount;
    }

    public int getContractMonths() {
        return contractMonths;
    }

    // Setters
    public void setContractAmount(double contractAmount) {
        this.contractAmount = contractAmount;
    }

    public void setContractMonths(int contractMonths) {
        this.contractMonths = contractMonths;
    }

    // Only override salary computation
    @Override
    public double calculateSalary() {
        return contractAmount / contractMonths;
    }
}