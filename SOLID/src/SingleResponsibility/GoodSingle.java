package SingleResponsibility;

class Employee {
    private String employeeId;
    private String name;
    private String address;

}

class HRPromotions {
    public boolean isPromotionDueThisYear() {
        return true;
    }
}

class FinITCalculations {
    public double calcIncomeTaxForCurrentYear() {
        return 1;
    }
}
