package enerji;

import java.util.List;

// Strategy Pattern Interface (SOLID - Open/Closed & Dependency Inversion)
public interface IDistributionStrategy {
    void distribute(List<EnergySource> sources, List<ConsumerNode> consumers);
}