import java.time.LocalDate;
import java.time.Month;
import java.util.*;

class Robot implements Comparable<Robot> {
    private static final String ROOT_NAME = "Robot_";
    private static int idCounter = 100;

    private final int id;
    private final String name;
    private final LocalDate productionDate;

    public Robot() {
        this.id = idCounter++;
        this.name = ROOT_NAME + id;
        this.productionDate = generateRandomDate();
    }

    private LocalDate generateRandomDate() {
        long minDay = LocalDate.of(1980, Month.JANUARY, 1).toEpochDay();
        long maxDay = LocalDate.of(2022, Month.DECEMBER, 31).toEpochDay();
        long randomDay = minDay + (long) (Math.random() * (maxDay - minDay));
        return LocalDate.ofEpochDay(randomDay);
    }

    @Override
    public int compareTo(Robot otherRobot) {
        return this.productionDate.compareTo(otherRobot.productionDate);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productionDate=" + productionDate +
                '}';
    }
}
