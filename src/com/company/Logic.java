package com.company;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.*;
import static java.util.stream.Collectors.toMap;

public class Logic {
    // Получение начального списка покупателей
    public static List<Train> getTrain() {
        return List.of(
                new Train(1,  "Киев", 2213, 1500, 8, 0, 8),
                new Train(2,  "Киев", 1351, 1200, 2, 7, 2),
                new Train(3,  "Ужгород", 9183, 1100, 6, 3, 3),
                new Train(4,  "Киев", 1544, 930, 4, 2, 1),
                new Train(5,  "Винница", 2613, 930, 0, 6, 5),
                new Train(6,  "Ужгород", 1895, 2300, 5, 3, 3)
        );
    }
    //a
    public static List<Train> trainsToStation(List<Train> toStation, String station) {
        return toStation.stream().filter(train -> train.getStation().equals(station)).sorted(Comparator.comparing(Train::getTime))
                .collect(Collectors.toList());
    }
    //b
    public static List<Train> trainsToStationAfterTime(List<Train> afterTime, String station, int time) {
        return afterTime.stream().filter(train -> train.getStation().equals(station)).filter(train -> train.getTime()>time)
                .collect(Collectors.toList());
    }
    //c
    public static List<Train> trainsToStationWithCourierSeats (List<Train> withCourier, String station) {
        return withCourier.stream().filter(train -> train.getStation().equals(station)).filter(train -> train.getSeatsCoupe() > 0)
                .collect(Collectors.toList());
    }
    //d
    public static List<Train> trainsToStationsIncreasingSeats (List<Train> IncreasingSeats, String station) {
        return IncreasingSeats.stream().filter(train -> train.getStation().equals(station)).sorted(Comparator.comparing(Train::getSeatsNumber))
                .collect(Collectors.toList());
    }
    //e
/*    public static Set<String> listOfStations (List<Train> onlyStations) {
        Map<String, Long> map = onlyStations.stream()
                .collect(Collectors.groupingBy(Train::getStation,Collectors.counting()));
        Map<String, Long> sortedByValue = map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        return sortedByValue.keySet();
    }*/
    //e
    public static Set<String> listOfStations (List<Train> onlyStations) {
        Map<String, Long> map = onlyStations.stream()
                .collect(Collectors.groupingBy(Train::getStation,Collectors.counting()));
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new)).keySet();
    }
        //f
    public static Map<String, List<Train>> getStationsAndTrains(List<Train> stationsOfTrain ) {
        return stationsOfTrain.stream().collect(
                Collectors.groupingBy(Train::getStation));

    }

    public static List<Train> printAll(List<Train> trains) {
        return trains.stream().collect(Collectors.toList());
    }

    public static void print(List<Train> trains) {
        trains.forEach(out::println);
    }

//    public static void printByAlbhabet(List<String> trains) {
//        trains.forEach(out::println);
//    }
    public static void printIncreasingStations(Set<String> map) {
        System.out.println(map);
    }
    public static void printIndex(Map<String, List<Train>> index){
        System.out.println(index);
    }


}
