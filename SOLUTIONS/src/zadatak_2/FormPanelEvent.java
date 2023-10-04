package zadatak_2;


import java.util.EventObject;

public class FormPanelEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */

    private String height;
    private String weight;
    private String ageGroup;
    private Double BodyMassIndex;
    public FormPanelEvent(Object source, String height, String weight, String ageGroup) {
        super(source);
        this.height = height;
        this.weight = weight;
        this.ageGroup = ageGroup;


    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public String getBodyMassIndex() {
        double heightDouble = Double.parseDouble(height);
        double weightDouble = Double.parseDouble(weight);
        Double result = weightDouble / (heightDouble * heightDouble);
        return result.toString();

    }
}
