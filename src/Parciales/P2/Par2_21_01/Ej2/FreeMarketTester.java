package Parciales.P2.Par2_21_01.Ej2;

public class FreeMarketTester {

    public static void main(String[] args) {
        FreeMarket freeMarket = new FreeMarket();

        freeMarket.addProduct("Las mil y una noches", 2000.0, ProductCategory.BOOKS);
        freeMarket.addProduct("TV QLED", 30000.0, ProductCategory.ELECTRONICS);
        freeMarket.addProduct("Don Quijote", 1000.0, ProductCategory.BOOKS);
        freeMarket.addProduct("Hamlet", 500.0, ProductCategory.BOOKS);

        /**
         * Imprime en orden alfabético todos los productos del mercado
         * que pertenezcan a la categoría Libros
         *
         * Don Quijote
         * Hamlet
         * Las mil y una noches
         */
        for (String productName : freeMarket.getProductsByCategory(ProductCategory.BOOKS)) {
            System.out.println(productName);
        }
        System.out.println("-----");

        /**
         * Imprime en orden alfabético todos los productos del mercado
         * que pertenezcan a la categoría Alimentos
         *
         * No imprime nada pues no se agregaron productos para esa categoría
         */
        for (String productName : freeMarket.getProductsByCategory(ProductCategory.GROCERY)) {
            System.out.println(productName);
        }
        System.out.println("-----");

        try {
            freeMarket.printUserPoints("Mariana");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage()); // Imprime: El usuario Mariana no existe.
        }
        System.out.println("-----");

        // El usuario Mariana suma:
        // 80 puntos fijos + ($30000 * 1.10) puntos adicionales = 80 + 33000 = 33080 puntos
        freeMarket.buyProduct("Mariana",  ProductCategory.ELECTRONICS, "TV QLED");
        System.out.println("-----");

        freeMarket.printUserPoints("Mariana"); // Imprime: Puntos del usuario Mariana: 33080,00
        System.out.println("-----");

        // El usuario Pablo suma:
        // 30 puntos fijos + ($1300 * 0) puntos adicionales = 30 puntos
        freeMarket.buyProduct("Pablo", ProductCategory.BOOKS, "Las mil y una noches");
        System.out.println("-----");

        freeMarket.printUserPoints("Pablo"); // Imprime: Puntos del usuario Pablo: 30,00
        System.out.println("-----");

        // El usuario Mariana suma:
        // 30 puntos fijos + ($1300 * 0) puntos adicionales = 30 puntos
        freeMarket.buyProduct("Mariana", ProductCategory.BOOKS, "Las mil y una noches");
        System.out.println("-----");

        freeMarket.printUserPoints("Mariana"); // Imprime: Puntos del usuario Mariana: 33110,00
        System.out.println("-----");

        try {
            freeMarket.buyProduct("Mariana", ProductCategory.ELECTRONICS, "Monitor 4K");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage()); // Imprime: El producto no existe.
        }
        System.out.println("-----");

        try {
            freeMarket.buyProduct("Mariana", ProductCategory.GROCERY, "Papas fritas");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage()); // Imprime: El producto no existe.
        }
    }

}


