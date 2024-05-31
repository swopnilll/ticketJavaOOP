public interface MultiUseTicketing {

    void loadUp(int amount);

    boolean useOnce();

    double getLoadUpCost(int quantity);
}
