package Tps.Tp7.Ej8;

public class PremiumMovements extends Movements{
    private final String shop;
    public PremiumMovements(double price, String status, String shop) {
        super(price, status);
        this.shop = shop;
    }

    @Override
    public String toString() {
        return String.format("%s for shop %s", super.toString(), shop);
    }
}
