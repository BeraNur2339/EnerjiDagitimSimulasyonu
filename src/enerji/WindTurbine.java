package enerji;

// Kalıtım (Inheritance) & Çok Biçimlilik (Polymorphism)
public class WindTurbine extends EnergySource {
    private double windSpeed; // Rüzgar hızı (m/s)

    public WindTurbine(String id, String name, double capacity, double windSpeed) {
        super(id, name, capacity);
        this.windSpeed = windSpeed;
    }

    @Override
    public double calculateEnergyOutput() {
        if (windSpeed < 3.0) return 0.0; // Rüzgar yetersiz
        if (windSpeed > 25.0) return 0.0; // Güvenlik kapatması
        return getCapacity() * Math.min(windSpeed / 12.0, 1.0);
    }

    public double getWindSpeed() { return windSpeed; }
}