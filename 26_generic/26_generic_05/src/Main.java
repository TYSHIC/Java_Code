public class Main {
    public static void main(String[] args) {
        swimThenFly(new FlyingFish());
    }

    public static <T extends Fish & CanFly> void swimThenFly(T canFlyFish) {
        canFlyFish.swim();
        canFlyFish.fly();
    }
}

interface CanFly {
    void fly();
}

class Fish {
    public void swim() {
        System.out.println("魚兒魚兒水中遊");
    }
}

class FlyingFish extends Fish implements CanFly {
    @Override
    public void fly() {
        System.out.println("飛魚用魚翅飛");
    }
}