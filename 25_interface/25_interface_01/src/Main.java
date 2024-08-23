public class Main {
    public static void main(String[] args) {
        FlyingFish flyingFish = new FlyingFish();
        flyingFish.fly();
        flyingFish.swim();
        Aircraft aircraft1 = new Airplane();
        aircraft1.fly();
        Aircraft aircraft2 = new Helicopter();
        aircraft2.fly();
        Aircraft aircraft3 = new Aircraft() {
            @Override
            public void fly() {
                System.out.println("鸚鵡用翅膀飛");
            }
        };
        aircraft3.fly();
    }
}

interface CanFly {
    void fly();
}

interface CanSwim {
    void swim();
}

class Fish implements CanSwim {
    @Override
    public void swim() {
        System.out.println("魚兒魚兒水中遊");
    }
}

abstract class Aircraft implements CanFly {
}

class Airplane extends Aircraft {
    @Override
    public void fly() {
        System.out.println("飛機用引擎飛");
    }
}

class Helicopter extends Aircraft {
    @Override
    public void fly() {
        System.out.println("直升機用螺旋槳飛");
    }
}

class FlyingFish extends Fish implements CanFly {
    @Override
    public void fly() {
        System.out.println("飛魚用魚翅飛");
    }
}
