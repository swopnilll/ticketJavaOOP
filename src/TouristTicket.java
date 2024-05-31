public class TouristTicket extends Ticket implements SingleUseTicketing {

    private String attractionName;
    private double price;
    private boolean valid;

    public TouristTicket(String attractionName, double price) {
        this.attractionName = attractionName;
        this.price = price;
        this.valid = true;
    }

    @Override
    public boolean use() {
        if (valid) {
            valid = false;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getPurpose() {
        return "Entry to " + attractionName;
    }

    @Override
    public double getCost() {
        return price;
    }

    @Override
    public boolean isValid() {
        return valid;
    }

}
