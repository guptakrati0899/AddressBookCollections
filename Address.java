package addressbook;

public class Address {
    @Override
    public String toString() {
        return "Address [addressLocal=" + addressLocal + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
    }
    private String addressLocal;
    private String city;
    private String state;
    private String zip;
    public String getAddressLocal() {
        return addressLocal;
    }
    public void setAddressLocal(String addressLocal) {
        this.addressLocal = addressLocal;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
}

