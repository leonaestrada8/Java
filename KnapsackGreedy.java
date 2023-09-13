package Coliseum.J4V4.mochila;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class KnapsackGreedy {
    public static class Item {
        double ratio;
        int value;
        int weight;

        public Item(double ratio, int value, int weight) {
            this.ratio = ratio;
            this.value = value;
            this.weight = weight;
        }
    }

    public static class Result {
        int totalValue;
        ArrayList<Item> selectedItems;

        public Result(int totalValue, ArrayList<Item> selectedItems) {
            this.totalValue = totalValue;
            this.selectedItems = selectedItems;
        }
    }

    public static Result knapsackGreedy(int[] values, int[] weights, int capacity) {
        int n = values.length;
        Item[] ratios = new Item[n];
        for (int i = 0; i < n; i++) {
            ratios[i] = new Item((double) values[i] / weights[i], values[i], weights[i]);
        }
        Arrays.sort(ratios, Comparator.comparingDouble((Item item) -> item.ratio).reversed());

        int totalValue = 0;
        int currentWeight = 0;
        ArrayList<Item> selectedItems = new ArrayList<>();

        for (Item item : ratios) {
            if (currentWeight + item.weight <= capacity) {
                selectedItems.add(item);
                totalValue += item.value;
                currentWeight += item.weight;
            }
        }

        return new Result(totalValue, selectedItems);
    }

    public static void main(String[] args) {
        int[] itemValues = { 60, 100, 120 };
        int[] itemWeights = { 10, 20, 30 };
        int knapsackCapacity = 50;

        Result result = knapsackGreedy(itemValues, itemWeights, knapsackCapacity);

        System.out.println("Valor total na mochila: " + result.totalValue);
        System.out.println("Itens selecionados:");
        for (Item item : result.selectedItems) {
            System.out.println("Item - Valor: " + item.value + ", Peso: " + item.weight);
        }
    }
}
