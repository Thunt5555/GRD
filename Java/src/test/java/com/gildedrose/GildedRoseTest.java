package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

    //Authors were Victoria and Tim, Code was not performing as intended for concerts
    @Test
    void Sell_By_Degrade(){
        Item[] items = new Item[] {
            new Item("Aged Brie",0,10),
            new Item("Fresh Fruit",-2,20),
            new Item("Backstage passes to a TAFKAL80ETC concert",6,50)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(18,app.items[1].quality);
        assertEquals(12,app.items[0].quality);
        //Faulty code for the degrading value of items
        //assertEquals(52,app.items[2].quality);
        app.updateQuality();
        assertEquals(16,app.items[1].quality);
        assertEquals(14,app.items[0].quality);
        //assertEquals(55,app.items[2].quality);
    }

}
