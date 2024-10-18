package BuilderPattern;

import java.util.Scanner;

public class LongTerm implements Contract{
   
    private String contractID;
    private int rentAmount;
    private String tenantID;
    private String propertyID;


    public LongTerm (String Id, String property, int amount, String tenant){
        this.contractID = Id;
        this.propertyID = property;
        this.rentAmount = amount;
        this.tenantID = tenant;
    }

    public LongTerm() {
        //TODO Auto-generated constructor stub
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
    public Contract signContract(){

        

        
        Contract longTermContract = new LongTerm (this.contractID,
        this.propertyID,
        this.rentAmount ,
        this.tenantID );
        return longTermContract;
    };
}
