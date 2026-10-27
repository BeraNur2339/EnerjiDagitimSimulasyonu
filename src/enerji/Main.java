package enerji;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Factory Pattern ile Enerji Kaynakları Oluşturma
        EnergySource solar = EnergySourceFactory.createEnergySource("SOLAR", "S1", "Güneş Tarlası A", 500, 8.0, 0.85);
        EnergySource wind = EnergySourceFactory.createEnergySource("WIND", "W1", "Rüzgar Santrali B", 400, 12.0, 0);

        List<EnergySource> sources = new ArrayList<>();
        sources.add(solar);
        sources.add(wind);

        // 2. Tüketici Noktaları (Öncelik Sıralı: 1 = En Acil)
        List<ConsumerNode> consumers = new ArrayList<>();
        consumers.add(new ConsumerNode("C1", "Şehir Hastanesi", 300, 1)); // En yüksek öncelik
        consumers.add(new ConsumerNode("C2", "Organize Sanayi Bölgesi", 400, 2));
        consumers.add(new ConsumerNode("C3", "TOKİ Konutları", 200, 3));

        // 3. Strategy Pattern ile Simülasyonu Çalıştırma
        IDistributionStrategy strategy = new PriorityDistributionStrategy();
        strategy.distribute(sources, consumers);
    }
}