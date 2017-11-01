package edu.ucsd.cse110.temperature;

public class Fahrenheit extends Temperature {

    public Fahrenheit(float t)
    {
        super(t);
    }
    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " F";
    }

    @Override
    public Temperature toCelsius() {
        float value = ((this.getValue() - 32) * 5)/9;
        return new Celsius(value);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }
}
