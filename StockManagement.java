package Final.J4V4.Stock55;

import java.util.HashMap;

// CÓDIGO ORIGINAL A SER REFATORADO

public class StockManagement {
    private HashMap<String, Integer> stock;

    public StockManagement() {
        this.stock = new HashMap<>();
    }

    public void addProduct(String productName, int quantity) {
        if (stock.containsKey(productName)) {
            stock.put(productName, stock.get(productName) + quantity);
        } else {
            stock.put(productName, quantity);
        }
    }

    public void removeProduct(String productName, int quantity) {
        if (stock.containsKey(productName) && stock.get(productName) >= quantity) {
            stock.put(productName, stock.get(productName) - quantity);
        } else {
            System.out.println("Not enough stock or product not found");
        }
    }

    public int getStock(String productName) {
        return stock.getOrDefault(productName, -1); // -1 represents "Product not found"
    }

    // Usage
    public static void main(String[] args) {
        StockManagement stockManager = new StockManagement();
        stockManager.addProduct("Apple", 10);
        stockManager.removeProduct("Orange", 5);
        System.out.println(stockManager.getStock("Apple")); // Outputs 10
        System.out.println(stockManager.getStock("Orange")); // Outputs -1
    }
}
