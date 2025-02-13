package exemploEnum.entities;

import exemploEnum.enums.Coin;

import java.util.ArrayList;
import java.util.List;

public class Pig {
    private List items = new ArrayList<>();
    private double value = 0;
    private int volume = 0;
    private int volumeMax;
    private boolean broken = false;

    public Pig(int volumeMax) {
        this.volumeMax = volumeMax;
    }

    public boolean addCoin(Coin coin) {
        if (!broken && volume + coin.getVolume() <= volumeMax) {
            value += coin.value;
            volume += coin.getVolume();
            return true;
        }
        return false;
    }

    public boolean addItem(Item item) {
        if (!broken && volume + item.getVolume() <= volumeMax) {
            items.add(item);
            volume += item.getVolume();
            return true;
        }
        return false;
    }

    public boolean breakPig() {
        if (!broken) {
            broken = true;
            return true;
        }
        return false;
    }

    public double getCoins() {
        if (!broken) {
            System.out.println("You must break the pig first");
            return 0.0;
        }
        return value;
    }

    public String getItens() {
        if (!broken) {
            return "You must break the pig first\n";
        }

        String[] descriptions = new String[items.size()];

        for (int i = 0; i < items.size(); i++) {
            descriptions[i] = (items.get(i).getDescription());
        }

        return String.join(", ", descriptions);
    }

    public int getVolume() {
        return volume;
    }

    public int getVolumeMax() {
        return volumeMax;
    }

    public boolean isBroken() {
        return broken;
    }

    public String toString() {
        StringBuilder itemDescriptions = new StringBuilder();
        for (Item item : items) {
            if (itemDescriptions.length() > 0) {
                itemDescriptions.append(", ");
            }
            itemDescriptions.append(item.getDescription());
        }
        return "I:(" + itemDescriptions.toString() + ") M:" + value + " V:" + volume + "/" + volumeMax + " EQ:" + broken;
    }
}
