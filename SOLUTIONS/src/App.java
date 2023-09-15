import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {
        List<Robot> robotList = generateRobots(10);
        robotList.add(new Robot());
        robotList.add(new Robot());

        TreeSet<Robot> robotSet = new TreeSet<>(robotList);

        System.out.println("ArrayList:");
        printCollection(robotList);
        System.out.println("----------------------------------------------------");
        System.out.println("TreeSet:");
        printCollection(robotSet);
    }

    private static List<Robot> generateRobots(int n) {
        List<Robot> robots = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            robots.add(new Robot());
        }
        return robots;
    }

    private static <T> void printCollection(Collection<T> collection) {
        for (T item : collection) {
            System.out.println(item);
        }
    }
    
}
