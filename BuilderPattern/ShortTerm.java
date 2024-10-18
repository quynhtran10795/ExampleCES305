package BuilderPattern;

public class ShortTerm implements Contract{
    private String contractID;
    private int rentAmount;
    private String tenantID;
    private String propertyID;


    public ShortTerm (String Id, String property, int amount, String tenant){
        this.contractID = Id;
        this.propertyID = property;
        this.rentAmount = amount;
        this.tenantID = tenant;
    }

    public String buildContractID(String Id){
        this.contractID = Id;
        return this.contractID;
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
    @Override
    public String toString() {
        return "Shorterm contract detail:  [Id=" + contractID + ", Rent amount=" + rentAmount + 
        ", Property Id=" + propertyID + ", Tennant =" + tenantID +"]";
    }
    public Contract signContract(){
        ShortTerm shortTermContract = new ShortTerm(buildContractID(contractID), buildProperty(propertyID)
        , buildRentAmount(rentAmount), buildTenantID(tenantID));
        return shortTermContract;
    };
    
}
