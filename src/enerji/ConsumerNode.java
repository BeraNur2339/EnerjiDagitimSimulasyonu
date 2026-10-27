package enerji;

public class ConsumerNode {
    private String id;
    private String name;
    private double requiredEnergy; // kWh
    private int priority; // 1: Acil/Hastane, 2: Sanayi, 3: Konut

    public ConsumerNode(String id, String name, double requiredEnergy, int priority) {
        this.id = id;
        this.name = name;
        this.requiredEnergy = requiredEnergy;
        this.priority = priority;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getRequiredEnergy() { return requiredEnergy; }
    public void setRequiredEnergy(double requiredEnergy) { this.requiredEnergy = requiredEnergy; }
    public int getPriority() { return priority; }
}