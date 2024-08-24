public class Main {
    public static void main(String[] args) {
        CanFly[] canFlies =
                {new Helicopter(), new Airplane(), new FlyingFish()};
        for (CanFly canFly : canFlies) {
            canFly.fly();
        }
    }
}

interface CanFly {
    void fly();
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

class FlyingFish implements CanFly {
    @Override
    public void fly() {
        System.out.println("飛魚用魚翅飛");
    }
}
