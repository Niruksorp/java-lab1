package Obertka;

import Entity.Vehicle;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class TransortCollection implements TransportList{

    private ArrayList<Vehicle> collection = new ArrayList<>();

    public TransortCollection() {
    }

    public TransortCollection(ArrayList<Vehicle> collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        return collection.stream()
                .map(Vehicle::getName)
                .collect(Collectors.joining(" "));
    }

    public Boolean addToList(Vehicle some) {
        return collection.add(some);
    }

    public void deleteElement(int pos) {
        if (collection.size() > pos)
            collection.remove(pos);
    }

    public Boolean equals (int first, int second) {
        return Integer.max(first, second) < collection.size()
                && collection.get(first).equals(collection.get(second));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransortCollection that = (TransortCollection) o;
        return Objects.equals(collection, that.collection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collection);
    }

    public ArrayList<Vehicle> getCollection() {
        return collection;
    }

    public void setCollection(ArrayList<Vehicle> collection) {
        this.collection = collection;
    }
}
