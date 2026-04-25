import java.util.Scanner;

class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }
    int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }
        if (foe.health - this.damage < 0) return 0;
        return foe.health - this.damage;
    }
    boolean dodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
}

class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    void run() {
        if (!checkWeight()) {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
            return;
        }
        boolean f1Starts = Math.random() < 0.5;
        while (f1.health > 0 && f2.health > 0) {
            System.out.println("======== YENİ ROUND ===========");
            if (f1Starts) {
                f2.health = f1.hit(f2);
                if (isWin()) break;
                f1.health = f2.hit(f1);
                if (isWin()) break;
            } else {
                f1.health = f2.hit(f1);
                if (isWin()) break;
                f2.health = f1.hit(f2);
                if (isWin()) break;
            }
            printScore();
        }
    }
    boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }
    boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Maçı Kazanan : " + f1.name);
            return true;
        }
        return false;
    }
    void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 15, 100, 90, 0);
        Fighter alex = new Fighter("Alex", 10, 95, 100, 0);
        Ring r = new Ring(marc, alex, 90, 100);
        r.run();
    }
}
