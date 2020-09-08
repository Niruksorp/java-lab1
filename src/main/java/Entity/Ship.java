package Entity;

import java.util.Objects;

public class Ship extends Vehicle {

    private int coordinateLive;
    private String captainName;

    public Ship(int creatingDate, String name, int coordinateLive, String captainName) {
        super(creatingDate, name);
        this.coordinateLive = coordinateLive;
        this.captainName = captainName;
    }

    public int getCoordinateLive() {
        return coordinateLive;
    }

    public void setCoordinateLive(int coordinateLive) {
        this.coordinateLive = coordinateLive;
    }

    public String getCaptainName() {
        return captainName;
    }

    public void setCaptainName(String captainName) {
        this.captainName = captainName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ship ship = (Ship) o;
        return coordinateLive == ship.coordinateLive &&
                Objects.equals(captainName, ship.captainName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), coordinateLive, captainName);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "coordinateLive=" + coordinateLive +
                ", captainName='" + captainName + '\'' +
                '}';
    }
}
