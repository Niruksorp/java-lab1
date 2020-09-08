package Entity;

import java.util.Objects;

public class Plane extends Vehicle {

    private int averageFlightAltitude;
    private String baseAirportName;

    public Plane(int creatingDate, String name, int averageFlightAltitude, String baseAirportName) {
        super(creatingDate, name);
        this.averageFlightAltitude = averageFlightAltitude;
        this.baseAirportName = baseAirportName;
    }

    public int getAverageFlightAltitude() {
        return averageFlightAltitude;
    }

    public void setAverageFlightAltitude(int averageFlightAltitude) {
        this.averageFlightAltitude = averageFlightAltitude;
    }

    public String getBaseAirportName() {
        return baseAirportName;
    }

    public void setBaseAirportName(String baseAirportName) {
        this.baseAirportName = baseAirportName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Plane plane = (Plane) o;
        return averageFlightAltitude == plane.averageFlightAltitude &&
                Objects.equals(baseAirportName, plane.baseAirportName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), averageFlightAltitude, baseAirportName);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "averageFlightAltitude=" + averageFlightAltitude +
                ", baseAirportName='" + baseAirportName + '\'' +
                '}';
    }
}
