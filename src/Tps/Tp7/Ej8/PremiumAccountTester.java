package Tps.Tp7.Ej8;

public class PremiumAccountTester {

    public static void main(String[] args) {
        BankAccount c1 = new CheckingAccount(1234, 5000);
        c1.deposit(200);
        c1.extract(300);
        c1.showMovements();

        ShopDiscountsProvider shopDiscountsProvider = new ShopDiscountsProvider();
        shopDiscountsProvider.addShop("Falabella", 0.1D);
        shopDiscountsProvider.addShop("Nike", 0.15D);
        shopDiscountsProvider.addShop("Garbarino", 0.3D);

        PremiumAccount premiumAccount = new PremiumAccount(9999, 5000, shopDiscountsProvider);
        premiumAccount.deposit(1000);
        premiumAccount.extract(150, "Nike");
        premiumAccount.extract(250, "Lacoste");
        premiumAccount.extract(50, "Starbucks");
        premiumAccount.extract(150, "Nike");
        premiumAccount.showMovements();
    }

}
