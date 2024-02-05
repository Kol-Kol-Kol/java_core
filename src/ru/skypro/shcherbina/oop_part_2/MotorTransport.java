package ru.skypro.shcherbina.oop_part_2;

public class MotorTransport extends Transport {
    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

}
