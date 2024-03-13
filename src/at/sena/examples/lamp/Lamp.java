package at.sena.examples.lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private String name;
    private List<Lightelement> lightelements;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addLightElement(Lightelement lightelements){
        this.lightelements.add(lightelements);
    }

    public List<Lightelement> getLightelements() {
        return lightelements;
    }

    public Lamp(String name){
        this.name = name;
        this.lightelements = new ArrayList<>();
    }
}
