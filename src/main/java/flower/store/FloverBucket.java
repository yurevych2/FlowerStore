package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FloverBucket {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.getPrice();
        }

        return price;
    }
}
