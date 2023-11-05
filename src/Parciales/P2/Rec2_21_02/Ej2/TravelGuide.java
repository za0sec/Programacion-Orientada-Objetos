package Parciales.P2.Rec2_21_02.Ej2;

import java.util.*;

public class TravelGuide {

    Map<String, Map<String, Set<Landmark>>> myMap = new HashMap<>();

    public void addLandmark(String country, String city, Landmark landmark){
        myMap.putIfAbsent(country, new TreeMap<>(String.CASE_INSENSITIVE_ORDER));
        myMap.get(country).putIfAbsent(city, new TreeSet<>());
        myMap.get(country).get(city).add(landmark);
    }

    public int landmarksCount(String country, String city){
        if (!myMap.containsKey(country)){
            return 0;
        }
        if (!myMap.get(country).containsKey(city)){
            return 0;
        }
        return myMap.get(country).get(city).size();
    }

    public int landmarksCount(String country){
        if (myMap.getOrDefault(country, null) == null){
            return 0;
        }
        int count = 0;
        for (Map.Entry<String, Set<Landmark>> innerMap : myMap.get(country).entrySet()){
            count += innerMap.getValue().size();
        }
        return count;
    }

    public Collection<Landmark> getLandmarksFromCity(String country, String city) {
        if (myMap.containsKey(country) && myMap.get(country).containsKey(city)) {
            return myMap.get(country).get(city);
        }
        return new ArrayList<>();
    }

    public Collection<Landmark> getLandmarksFromCountry(String country){
        List<Landmark> list = new ArrayList<>();
        if (myMap.containsKey(country)) {
            for (Set<Landmark> set : myMap.get(country).values()) {
                list.addAll(set);
            }
        }
        return list;
    }

    public void moveLandmark(String country, String cityfrom, String cityTo, Landmark landmark ){
        Map<String, Set<Landmark>> cityMap = myMap.get(country);
        if (cityMap == null) {
            throw new TravelGuideException("Country does not exist.\n");
        }
        Set<Landmark> landmarks = cityMap.get(cityfrom);
        if (landmarks == null) {
            throw new TravelGuideException("Origin city does not exist.\n");
        }
        if (!landmarks.contains(landmark)) {
            throw new TravelGuideException("Landmark does not exist in origin city.\n");
        }
        myMap.get(country).get(cityfrom).remove(landmark);
        myMap.get(country).get(cityTo).add(landmark);

    }





}
