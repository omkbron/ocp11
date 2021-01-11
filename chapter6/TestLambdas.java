import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class TestLambdas {
    public static void main(String... args) {
        Human human1 = new Human("Omar", false, true);
        Human human2 = new Human("Carlos", true, false);
        Human human3 = new Human("David", true, true);
        Human human4 = new Human("Lalo", false, false);
        Human human5 = new Human("Rorro", true, false);

        List<Human> humans = new ArrayList<>();
        humans.add(human1);
        humans.add(human2);
        humans.add(human3);
        humans.add(human4);
        humans.add(human5);

        print(humans, human -> human.canCode);
    }

    public static void print(List<Human> humans, Predicate<Human> codeChecker) {
        String greeting = "Hello";
        humans.forEach(human -> {
            if(codeChecker.test(human)) System.out.println(greeting + " " + human);
        });
    }
}

class Human {
    public String name;
    public boolean canSing;
    public boolean canCode;

    public Human(String name, boolean canSing, boolean canCode) {
        this.name = name;
        this.canSing = canSing;
        this.canCode = canCode;
    }

    public String toString() {
        return "The human " + name + " canSing: " + canSing + " and canCode: " + canCode;
    }
}
