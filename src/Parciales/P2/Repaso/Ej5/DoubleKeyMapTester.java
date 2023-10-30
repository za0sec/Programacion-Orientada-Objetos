package Parciales.P2.Repaso.Ej5;

public class DoubleKeyMapTester {

    public static void main(String[] args) {
        DoubleKeyMap<String, String, Integer> doubleKeyMap = new DoubleKeyHashMap<>();
        doubleKeyMap.put("Juan", "Perez", 49);
        System.out.println(doubleKeyMap.size()); // 1
        doubleKeyMap.put("Lucas", "Gomez", 37);
        doubleKeyMap.put("Lucas", "Lopez", 26);
        doubleKeyMap.put("Juan", "Lopez", 55);
        System.out.println(doubleKeyMap.size()); // 4
        System.out.println(doubleKeyMap.isEmpty()); // false
        System.out.println(doubleKeyMap.containsKey("Juan", "Ramirez")); // false
        System.out.println(doubleKeyMap.containsKey("Juan", "Gomez")); // false
        System.out.println(doubleKeyMap.containsKey("Lucas", "Gomez")); // true
        System.out.println(doubleKeyMap.get("Lucas", "Gomez")); // 37
        System.out.println(doubleKeyMap.get("Lucas", "Lopez")); // 26
        System.out.println(doubleKeyMap.containsValue(26)); // true
        doubleKeyMap.put("Lucas", "Lopez", 27);
        System.out.println(doubleKeyMap.size()); // 4
        System.out.println(doubleKeyMap.containsValue(26)); // false
        System.out.println(doubleKeyMap.get("Lucas", "Lopez")); // 27
        System.out.println(doubleKeyMap.containsKey("Gomez", "Lucas")); // false
        System.out.println(doubleKeyMap.containsValue(10)); // false
    }

}
