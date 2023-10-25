package edu.hw3;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Task6 implements StockMarket {
    private PriorityQueue<Stock> stockQueue;

    public void createQueue() {
        stockQueue = new PriorityQueue<>(Comparator.comparingDouble(Stock::getPrice).reversed());
    }

    @Override
    public void add(Stock stock) {
        this.stockQueue.offer(stock);
    }

    @Override
    public void remove(Stock stock) {
        this.stockQueue.remove(stock);
    }

    @Override
    public Stock mostValuableStock() {
        return this.stockQueue.peek();
    }
}
