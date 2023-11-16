package Parciales.P2.Par2_21_02.Ej2;

import java.util.HashMap;
import java.util.Map;

public class GymRegistry {

    private final Map<String, Membership> clients = new HashMap<>();
    private final Map<String, Map<Integer, Integer>> myMap = new HashMap<>();

    public GymRegistry visit(String name, int month){
        if (!myMap.containsKey(name)) {
            throw new GymRegistryException(String.format("%s is not registered.\n", name));
        }
        if (!canVisit(name, month)){
            throw new GymRegistryException(String.format("Max visits per month already reached for %s", name));
        }
        int actualValue = myMap.get(name).getOrDefault(month, 0);
        myMap.get(name).put(month, actualValue + 1);
        return this;
    }


    public int visitsCount(String name, int month){
        if (!myMap.containsKey(name)){
            throw new GymRegistryException(String.format("%s is not registered.\n", name));
        }
        if (!myMap.get(name).containsKey(month)){
            return 0;
        }
        System.out.println("value = " + myMap.get(name).get(month));
        return myMap.get(name).get(month);
    }

    public int visitsCount(String name){
        int ret = 0;
        for (Integer i : myMap.get(name).values()){
            ret += i;
        }
        return ret;
    }

    public boolean canVisit(String name, int month){
        return clients.get(name).canEnter(myMap.get(name).getOrDefault(month, 0));
    }

    public void registerClient(String name, Membership membership){
        if (clients.containsKey(name)){
            throw new GymRegistryException(String.format("%s already exists.\n", name));
        }
        clients.putIfAbsent(name, membership);
        myMap.putIfAbsent(name, new HashMap<>());
    }

}
