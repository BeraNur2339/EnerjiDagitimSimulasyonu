package enerji;

// Kalıtım (Inheritance) & Çok Biçimlilik (Polymorphism)
public class SolarPanel extends EnergySource {
    private double sunExposureHours; // Günlük güneşlenme süresi (Saat)
    private double efficiency;       // Verimllilik oranı (0.0 - 1.0)

    public SolarPanel(String id, String name, double capacity, double sunExposureHours, double efficiency) {
        super(id, name, capacity);
        this.sunExposureHours = sunExposureHours;
        this.efficiency = efficiency;
    }

    @Override
    public double calculateEnergyOutput() {
        return getCapacity() * (sunExposureHours / 24.0) * efficiency;
    }

    public double getSunExposureHours() { return sunExposureHours; }
    public double getEfficiency() { return efficiency; }
}