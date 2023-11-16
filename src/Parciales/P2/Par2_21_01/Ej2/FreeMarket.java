package Parciales.P2.Par2_21_01.Ej2;

import java.util.*;

public class FreeMarket {

    Map<ProductCategory, Map<String, Double>> myMap = new HashMap<>();
    Map<String, Double> users = new HashMap<>();

    public void addProduct(String name, double price, ProductCategory category){
        myMap.putIfAbsent(category, new TreeMap<>());
        myMap.get(category).putIfAbsent(name, price);
    }

    public Collection<String> getProductsByCategory(ProductCategory category){
        if (!myMap.containsKey(category)){
            return new TreeSet<>();
        }
        return myMap.get(category).keySet();
    }

    public void printUserPoints(String name){
        if (!users.containsKey(name)){
            throw new IllegalArgumentException(String.format("El usuario %s no existe.", name));
        }
        System.out.println("El usuario " + name + " suma: " + users.get(name));
    }

    public void buyProduct(String name, ProductCategory category, String product){
        if ( !myMap.containsKey(category) || !myMap.get(category).containsKey(product)){
            throw new IllegalArgumentException("El producto no existe.");
        }
        double pointsCalc = category.calculatePoints(myMap.get(category).get(product));
        users.put(name, users.getOrDefault(name, 0.0) + pointsCalc);
    }

}
