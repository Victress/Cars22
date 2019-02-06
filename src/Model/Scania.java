package Model;

import java.awt.*;

public class Scania extends ModelTruck {

    private final static double trimFactor = 1.25;

    public Scania() {
        super(2, 150, 8.0, Vehicles.directions.UP, "Model.Scania", Color.blue, 0.0, 0.0, 3.5, 20.);
    }


    @Override
    protected double speedFactor() {
        return getEnginePower() * 0.01 * trimFactor;
    }


}