public class RetailItem {
    String description;
    int unitsOnHand;
    double price;

    public RetailItem(String desc, int unit, double price) {
        description = desc;
        unitsOnHand = unit;
        this.price = price;
    }

    // muttator
    public void setDescription(String des) {
        description = des;
    }

    public void setUnits(int unitsAvail) {
        unitsOnHand = unitsAvail;
    }

    public void setPrice(double sale) {
        price = sale;
    }

    // getters - no attributes
    public String getDescription() {
        return description;
    }

    public int getUnits() {
        return unitsOnHand;
    }

    public double getPrice() {
        return price;
    }

}