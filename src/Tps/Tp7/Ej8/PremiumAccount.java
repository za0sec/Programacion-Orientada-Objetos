package Tps.Tp7.Ej8;

import java.util.HashMap;
import java.util.Map;

public class PremiumAccount extends BankAccount{

    private final ShopDiscountsProvider discounts;



    public PremiumAccount(int id, double num, ShopDiscountsProvider discounts){
        super(id, num);
        this.discounts = discounts;
    }


    public double extract(double num, String shop) {
        double nNum = num * (1 - discounts.getDiscount(shop));
        return super.extract(new PremiumMovements(nNum, "Extraction", shop));
    }


    @Override
    protected boolean canExtract(double num) {
        return true;
    }
}
