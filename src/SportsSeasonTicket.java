public class SportsSeasonTicket extends Ticket implements MultiUseTicketing{
    private double baseCost;
    private double perUseCost;
    private int remainingUses;

    public SportsSeasonTicket(double baseCost, double perUseCost, int initialUses) {
        this.baseCost = baseCost;
        this.perUseCost = perUseCost;
        this.remainingUses = initialUses;
    }

    @Override
    public void loadUp(int amount) {
        remainingUses += amount;
    }

    @Override
    public boolean useOnce() {
        if (remainingUses > 0) {
            remainingUses--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getLoadUpCost(int quantity) {
        return quantity * perUseCost;
    }

    @Override
    public String getPurpose() {
        return "Attendance to sport matches";
    }

    @Override
    public double getCost() {
        return baseCost;
    }

    @Override
    public boolean isValid() {
        return remainingUses > 0;
    }
}
