package com.company;

public class Wall implements Obstruction {

    private int distance;

    public Wall (int distance) {
        this.distance = distance;
    }

    @Override
    public int getDistance(int distance) {
        this.distance=distance;
        return distance;
    }

    @Override
    public void start(Participant participant) {
        participant.jump(distance);
    }
}
