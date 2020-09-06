package Entity;

import java.util.Objects;

public class Vehicle {

    private int creatingDate;
    private String name;

    public int getCreatingDate() {
        return creatingDate;
    }

    public void setCreatingDate(int creatingDate) {
        this.creatingDate = creatingDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return creatingDate == vehicle.creatingDate &&
                Objects.equals(name, vehicle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creatingDate, name);
    }

    @Override
    public String
    toString() {
        return "Vehicle{" +
                "creatingDate=" + creatingDate +
                ", name='" + name + '\'' +
                '}';
    }
}
