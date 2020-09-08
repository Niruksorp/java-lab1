package Obertka;

import Entity.Vehicle;

public interface TransportList {
    Boolean addToList(Vehicle some);
    void deleteElement(int pos);
    Boolean equals (int first, int second);
}
