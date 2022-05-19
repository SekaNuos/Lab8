package com.company;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Train> newList = Logic.getTrain();
        String station;
        int  time;
        int year;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        List<Train> print = Logic.printAll(newList);
        Logic.print(print);
        System.out.println("|А - Список поездов идущих к одной заданой станции по времени отправки |");
        System.out.println("Введите название станции: ");
        station = sc.nextLine();
        List<Train> trainsToStation = Logic.trainsToStation(newList,station);
        Logic.print(trainsToStation);

        System.out.println("_________________________________________");
        System.out.println("|B - Список поездов идущих к одной заданой станции после заданой времени отправки|");
        System.out.println("Введите название станции::");
        station = sc.nextLine();
        System.out.println("\nВведите время отправки: ");
        time = sc2.nextInt();
        List<Train> trainsToStationAfterTime = Logic.trainsToStationAfterTime(newList , station, time);
        Logic.print(trainsToStationAfterTime);

        System.out.println("_________________________________________");
        System.out.println("|C - Список поездов идущих к одной заданой станции с местами Купе|");
        System.out.println("Введите название станции: ");
        station = sc.nextLine();
        List<Train> afterYear = Logic.trainsToStationWithCourierSeats(newList , station);
        Logic.print(afterYear);

        System.out.println("_________________________________________");
        System.out.println("|D - Список поездов идущих к одной заданой станции по зростанию мест|");
        System.out.println("\nВведите название станции: ");
        station=sc.nextLine();
        List<Train> trainsByNumberOfSeats = Logic.trainsToStationsIncreasingSeats(newList, station);
        Logic.print(trainsByNumberOfSeats);

        System.out.println("_________________________________________");
        System.out.println("|E - Список всех станций в порядке возростания запланированных поездов|");
        Set<String> stationsByPopularity = Logic.listOfStations(newList);
        Logic.printIncreasingStations(stationsByPopularity);

        System.out.println("_________________________________________");
        System.out.println("|F - Список станций и поездов, которые к ним надвигаются:|");
        Logic.printIndex(Logic.getStationsAndTrains(newList));

    }
}