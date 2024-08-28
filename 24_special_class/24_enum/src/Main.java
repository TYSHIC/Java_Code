public class Main {
    public static void main(String[] args) {
        for (Role role : Role.values()) {
            new Person(role).printInfo().eat();
        }
    }
}

interface Eat {
    void eat();
}

enum Role implements Eat {
    WORKER("上班族") {
        @Override
        public void eat() {
            System.out.println("吃土");
        }
    }, BABY("嬰兒") {
        @Override
        public void eat() {
            System.out.println("喝奶");
        }
    }, STUDENT("學生") {
        @Override
        public void eat() {
            System.out.println("叫外送");
        }
    };

    final String description;

    Role(String description) {
        this.description = description;
    }
}

class Person {
    Role role;

    Person(Role role) {
        this.role = role;
    }

    Person printInfo() {
        System.out.println(
                role.description +
                        "：" + switch (role) {
                    case WORKER -> "上班";
                    case BABY -> "哭";
                    case STUDENT -> "上課";
                });
        return this;
    }

    void eat() {
        role.eat();
    }
}
