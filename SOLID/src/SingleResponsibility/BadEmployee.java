package SingleResponsibility;

public class BadEmployee {
    private String employeeId;
    private String name;
    private String address;

    public boolean isPromotionDueThisYear() {
        return true;
    }

    public double calcIncomeTaxForCurrentYear() {
        return 1;
    }
}
