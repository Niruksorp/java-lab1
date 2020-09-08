package Entity;

import java.util.Objects;

public class Car extends Vehicle {

    private int mileage;
    private String carMark;

    public Car(int creatingDate, String name, int mileage, String carMark) {
        super(creatingDate, name);
        this.mileage = mileage;
        this.carMark = carMark;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getCarMark() {
        return carMark;
    }

    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return mileage == car.mileage &&
                Objects.equals(carMark, car.carMark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mileage, carMark);
    }

    @Override
    public String toString() {
        return "mileage:" + mileage + "car mark:" + carMark;
    }
}
