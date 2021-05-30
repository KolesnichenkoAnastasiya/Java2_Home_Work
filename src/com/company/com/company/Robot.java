package com.company;

public class Robot implements Participant {

    private final String name;
    private final int distanceRan;
    private final int distanceJump;

    public Robot(String name, int distanceRan, int distanceJump) {
        this.name = name;
        this.distanceRan = distanceRan;
        this.distanceJump = distanceJump;
    }

    @Override
    public void go (int distance) {
        if (distanceRan >= distance) {
            System.out.println("Робот " + name + " пробежал " + distance + " м");
        }
        else { System.out.println("Робот  " + name + "  не смог пробежать " + distance + " м");
        }
    }

    @Override
    public void jump (int distance) {
        if (distanceJump >= distance) {
            System.out.println("Робот " + name + " перепрыгнул через стену " + distance + " cм");
        } else {
            System.out.println("Робот " + name + "  не смог перепрыгнуть через стену " + distance + " cм");
        }
    }
}



