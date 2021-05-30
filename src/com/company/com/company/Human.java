package com.company;

public class Human implements Participant {
    private final String name;
    private final int distanceRan;
    private final int distanceJump;

    public Human (String name, int distanceRan, int distanceJump) {
            this.name = name;
            this.distanceRan = distanceRan;
            this.distanceJump = distanceJump;
    }

    @Override
    public void go (int distance) {
        if (distanceRan >= distance) {
            System.out.println(name + " пробежал(а) " + distance + " м");
        }
        else {
            System.out.println(name + "  не смог(ла) пробежать " + distance + " м");
        }
    }

    @Override
    public void jump(int distance) {
        if (distanceJump >= distance) {
            System.out.println(name + " перепрыгнул(а) через стену " + distance + " cм");
        }
        else {
            System.out.println(name + "  не смог(ла) перепрыгнуть через стену " + distance + " cм");
        }
    }
}


