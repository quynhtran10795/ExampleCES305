package BuilderPattern;

public class Permanent implements Contract{
    private String contractID;
    private int rentAmount;
    private String tenantID;
    private String propertyID;
    public Permanent ()
    {
        this.contractID = null;
        this.propertyID = null;
        this.rentAmount = 0;
        this.tenantID = null;
    }
    public Permanent (String Id, String property, int amount, String tenant){
        this.contractID = Id;
        this.propertyID = property;
        this.rentAmount = amount;
        this.tenantID = tenant;
    }

    public String buildContractID(String Id){
        this.contractID = Id;
        return contractID;
    };
    public String buildProperty(String property){
        this.propertyID = property;
        return propertyID;
    };
    public String buildTenantID(String tenant){
        this.tenantID = tenant;
        return tenantID;
    };
    public int buildRentAmount(int amount){
        this.rentAmount = amount;
        return rentAmount;
    };
    public Contract signContract(){
        Permanent permanentContract = new Permanent(this.contractID,
        this.propertyID, this.rentAmount, this.tenantID);
        return permanentContract;
    };
}
