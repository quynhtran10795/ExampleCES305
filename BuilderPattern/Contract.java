package BuilderPattern;

public interface Contract {

    public String buildContractID(String Id);
    public String buildProperty(String property);
    public String buildTenantID(String tenant);
    public int buildRentAmount(int amount);
    public Contract signContract();
}
