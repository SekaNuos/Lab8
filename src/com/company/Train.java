package com.company;

public class Train {

    private int id;
    private String station;
    private int trainNumber;
    private int time;
    private int seatsCoupe;
    private int seatsReserved;
    private int seatsLux;


    public Train(int id, String station, int trainNumber, int time, int seatsCoupe, int seatsReserved, int seatsLux) {
        this.id = id;
        this.station = station;
        this.trainNumber = trainNumber;
        this.time = time;
        this.seatsCoupe = seatsCoupe;
        this.seatsReserved = seatsReserved;
        this.seatsLux = seatsLux;
    }

    public Train() {

    }


    public int getId() {
        return id;
    }
    public String getStation()
    {
        return station;
    }
    public int getTrainNumber()
    {
        return trainNumber;
    }
    public int getTime()
    {
        return time;
    }
    public int getSeatsCoupe() {
        return seatsCoupe;
    }
    public int getSeatsReserved() {
        return seatsReserved;
    }
    public int getSeatsLux() {
        return seatsLux;
    }
    public int getSeatsNumber() {
        int number = seatsCoupe+seatsReserved+seatsLux;
        return number;
    }

    public void setId(int id){this.id = id;}
    public void setStation(String station){this.station = station;}
    public void setTrainNumber(int trainNumber){this.trainNumber = trainNumber;}
    public void setTime(int time){this.time = time;}
    public void setSeatsCoupe(int seatsCoupe){this.seatsCoupe = seatsCoupe;}
    public void setSeatsReserved(int seatsReserved){this.seatsReserved = seatsReserved;}
    public void setSeatsLux(int seatsLux){this.seatsLux = seatsLux;}


    @Override
    public String toString() {
        return "Train " +
                "id=" + id +
                ", station=" + station +
                ", trainNumber=" + trainNumber +
                ", time=" + time +
                ", seatsCoupe=" + seatsCoupe +
                ", seatsReserved=" + seatsReserved +
                ", seatsLux=" + seatsLux + '\'' +
                ';';
    }


}