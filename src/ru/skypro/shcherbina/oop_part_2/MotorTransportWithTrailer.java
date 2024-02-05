package ru.skypro.shcherbina.oop_part_2;

public class MotorTransportWithTrailer extends MotorTransport {
    public MotorTransportWithTrailer(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
