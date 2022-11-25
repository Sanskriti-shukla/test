package ProductMiniProject;

public class PartyModel {
    private int partyid;
    private long contactNumber;
    private String partyName;
    private long accountNumber;

    public PartyModel(int partyid, long contactNumber, String partyName, int accountNumber) {
        this.partyid = partyid;
        this.contactNumber = contactNumber;
        this.partyName = partyName;
        this.accountNumber = accountNumber;
    }

    public int getPartyid() {
        return partyid;
    }

    public void setPartyid(int partyid) {
        this.partyid = partyid;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}