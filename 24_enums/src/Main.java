public class Main {
    public static void main(String[] args) {
        for (Role role : Role.values()) {
            new Person(role).printInfo();
        }
    }
}

enum Role {
    WORKER("上班族"), BABY("嬰兒"), STUDENT("學生");

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

    void printInfo() {
        System.out.println(role.description +
                "：" + switch (role) {
            case WORKER -> "上班";
            case BABY -> "哭";
            case STUDENT -> "上課";
        });
    }
}