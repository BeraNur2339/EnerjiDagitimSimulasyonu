package enerji;

import java.util.List;
import java.util.Comparator;

// Strategy Pattern Implementation (Öncelik Odaklı Dağıtım Algoritması)
public class PriorityDistributionStrategy implements IDistributionStrategy {
    @Override
    public void distribute(List<EnergySource> sources, List<ConsumerNode> consumers) {
        double totalEnergy = sources.stream().mapToDouble(EnergySource::calculateEnergyOutput).sum();

        // Tüketicileri öncelik sırasına göre sırala (1: En Acil/Hastane vb.)
        consumers.sort(Comparator.comparingInt(ConsumerNode::getPriority));

        System.out.println("\n=== Öncelik Odaklı Enerji Dağıtımı Başlatıldı ===");
        System.out.println("Toplam Üretilen Enerji: " + totalEnergy + " kWh\n");

        for (ConsumerNode consumer : consumers) {
            if (totalEnergy >= consumer.getRequiredEnergy()) {
                totalEnergy -= consumer.getRequiredEnergy();
                System.out.println("[BAŞARILI] " + consumer.getName() + " için " + consumer.getRequiredEnergy() + " kWh enerji sağlandı.");
            } else if (totalEnergy > 0) {
                System.out.println("[KISMİ] " + consumer.getName() + " için sadece " + totalEnergy + " kWh enerji sağlandı.");
                totalEnergy = 0;
            } else {
                System.out.println("[YETERSİZ] " + consumer.getName() + " için enerji kalmadı!");
            }
        }
        System.out.println("=================================================\n");
    }
}