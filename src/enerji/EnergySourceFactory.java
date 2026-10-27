package enerji;

// Factory Method Pattern (Nesne oluşturma işini tek bir yerden yönetir)
public class EnergySourceFactory {
    public static EnergySource createEnergySource(String type, String id, String name, double capacity, double param1, double param2) {
        if (type.equalsIgnoreCase("SOLAR")) {
            return new SolarPanel(id, name, capacity, param1, param2);
        } else if (type.equalsIgnoreCase("WIND")) {
            return new WindTurbine(id, name, capacity, param1);
        }
        throw new IllegalArgumentException("Bilinmeyen enerji kaynağı türü: " + type);
    }
}