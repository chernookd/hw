package edu.hw3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Task6Test {
    private Task6 stockMarket;

    @BeforeEach
    public void setUp() {
        stockMarket = new Task6();
        stockMarket.createQueue();
    }

    @Test
    public void AddAndMostValuableStockTest() {
        Stock stock1 = new Stock(100);
        Stock stock2 = new Stock(200);
        Stock stock3 = new Stock(4);
        Stock stock4 = new Stock(33);
        Stock stock5 = new Stock(199);
        stockMarket.add(stock1);
        stockMarket.add(stock2);
        stockMarket.add(stock3);
        stockMarket.add(stock4);
        stockMarket.add(stock5);

        assertEquals(stock2, stockMarket.mostValuableStock());
    }

    @Test
    public void RemoveTest() {
        Stock stock1 = new Stock(100);
        Stock stock2 = new Stock(200);
        Stock stock3 = new Stock(4);
        Stock stock4 = new Stock(33);
        Stock stock5 = new Stock(199);
        stockMarket.add(stock1);
        stockMarket.add(stock2);
        stockMarket.add(stock3);
        stockMarket.add(stock4);
        stockMarket.add(stock5);
        stockMarket.remove(stock2);

        assertEquals(stock5, stockMarket.mostValuableStock());
    }

    @Test
    public void EmptyTest() {

        assertNull(stockMarket.mostValuableStock());
    }
}
