package ru.skypro.shcherbina.oop_part_2;

public class ServiceStation {
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            car.service();
            car.checkEngine();
        } else if (truck != null) {
            truck.service();
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            bicycle.service();
        }
    }
}
