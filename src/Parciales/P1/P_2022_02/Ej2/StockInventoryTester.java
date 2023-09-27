package Parciales.P1.P_2022_02.Ej2;

import java.util.Iterator;
import java.util.function.Predicate;

public class StockInventoryTester {
    public static void main(String[] args) {
        // Se instancia un inventario
        // donde la condición de alerta de bajo stock es 1 o menos unidades
        StockInventory stockInventory = new StockInventory();
        // Se agrega un producto de nombre A con su stock actual de 1 unidad
        stockInventory.add("Rhodesia", 1);
        stockInventory.add("Tita", 4);
        // Si ya existe un producto con ese nombre también se agrega
        stockInventory.add("Tita", 0);
        // Se reduce en 1 el stock del producto de nombre Tita
        // Si hay más de uno con ese nombre, reduce el stock del que se agregó primero
        stockInventory.reduceStock("Tita");

        // Se consultan los productos del inventario según el orden de inserción.
        // Los que tengan un stock <= 1 dirán "Low Stock!". Los demás dirán "Stock OK"
        Iterator<StockResult> oneOrBelowIt = stockInventory.iterator();
        while (oneOrBelowIt.hasNext()) {
            System.out.println(oneOrBelowIt.next());
        }
        // Product Rhodesia has 1 units <> Low Stock!
        // Product Tita has 3 units <> Stock OK
        // Product Tita has 0 units <> Low Stock!

        // Se cambia la condición de alerta de bajo stock a 2 o menos unidades
        stockInventory.setMinimumStock(new Predicate<Integer>() {
            @Override
            public boolean test(Integer stock) {
                return stock <= 2;
            }
        });


        // Se consultan los productos del inventario según el orden de inserción.
        // Los que tengan un stock <= 2 dirán "Low Stock!". Los demás dirán "Stock OK"
        Iterator<StockResult> twoOrBelowIt = stockInventory.iterator();

        // Se cambia la condición de alerta de bajo stock a 3 o menos unidades.
        stockInventory.setMinimumStock(stock -> stock <= 3);
        // Se consultan los productos del inventario según el orden de inserción.
        // Los que tengan un stock <= 3 dirán "Low Stock!". Los demás dirán "Stock OK".
        Iterator<StockResult> threeOrBelowIt = stockInventory.iterator();

        stockInventory.add("Mogul", 1);

        while (twoOrBelowIt.hasNext()) {
            System.out.println(twoOrBelowIt.next());
        }
        // Product Rhodesia has 1 units <> Low Stock!
        // Product Tita has 3 units <> Stock OK
        // Product Tita has 0 units <> Low Stock!
        // Product Mogul has 1 units <> Low Stock!

        while (threeOrBelowIt.hasNext()) {
            System.out.println(threeOrBelowIt.next());
        }
        // Product Rhodesia has 1 units <> Low Stock!
        // Product Tita has 3 units <> Low Stock!
        // Product Tita has 0 units <> Low Stock!
        // Product Mogul has 1 units <> Low Stock!

        try {
            stockInventory.reduceStock("Figuritas del mundial");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            // No product found with name Figuritas del mundial
        }
        try {
            // Falla pues se intenta agregar al inventario un producto con stock negativo
            stockInventory.add("Figuritas del mundial", -1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Stock cannot be negative.
        }

        stockInventory.reduceStock("Mogul");
        try {
            // Falla pues se intenta reducir el stock de un producto con 0 unidades
            stockInventory.reduceStock("Mogul");
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // No stock to reduce.
        }
    }
}

