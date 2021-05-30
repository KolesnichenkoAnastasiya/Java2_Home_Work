package com.company;

public class Treadmill implements Obstruction {

    public int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public int getDistance(int distance){
        this.distance=distance;
        return distance;
    }

    @Override
    public void start(Participant participant) {

        participant.go(distance);
    }
}
