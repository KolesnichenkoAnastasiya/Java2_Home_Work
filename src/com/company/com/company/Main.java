package com.company;
public class Main {

    public static void main(String[] args) {

        Participant[] participants = {
                new Human("Пётр", 1500, 30),
                new Human("Светлана", 2500, 40),
                new Cat("Барсик", 200, 20),
                new Cat("Мурзик", 400, 45),
                new Cat("Бася", 800, 70),
                new Robot("R2d2", 600, 40),
                new Robot("Y-781", 800, 100)
        };

        Obstruction[] obstructions = {
                new Treadmill(500),
                new Wall(50),
                new Treadmill(100),
                new Wall(60),
                new Treadmill(50)
        };

        for (Participant p : participants) {
            for (Obstruction o : obstructions) {
                o.start(p);
            }
        }
    }
}



