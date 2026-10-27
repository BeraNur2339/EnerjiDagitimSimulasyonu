package enerji;

// Soyutlama (Abstraction) ve SOLID - SRP prensibi
public abstract class EnergySource {
    private String id;
    private String name;
    private double capacity; // Maksimum kapasite (kWh)

    public EnergySource(String id, String name, double capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }

    // Çok Biçimlilik (Polymorphism): Her alt sınıf kendi üretimini hesaplar
    public abstract double calculateEnergyOutput();

    public String getId() { return id; }
    public String getName() { return name; }
    public double getCapacity() { return capacity; }
}