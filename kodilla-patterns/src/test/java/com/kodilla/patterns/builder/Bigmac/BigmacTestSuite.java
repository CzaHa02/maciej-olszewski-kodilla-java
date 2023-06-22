package com.kodilla.patterns.builder.Bigmac;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {
    @Test
    void testBigMac() {
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sesame")
                .burgers(3)
                .sauce("barbecue")
                .ingredient("Beacon, " + "salat, " + "chilli, "+ "cheese")
                .build();
        System.out.println(bigmac);

        String whichSauce = bigmac.getSauce();
        String whichBun = bigmac.getBun();
     int howManyBurgers=bigmac.getBurgers();

        Assertions.assertEquals(whichSauce, "barbecue");
        Assertions.assertEquals(whichBun, "sesame");
       Assertions.assertEquals(howManyBurgers, 3);
    }
}
