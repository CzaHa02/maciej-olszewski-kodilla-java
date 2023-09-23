package com.kodilla.patterns2.facade;

import com.kodilla.patterns2.facade.api.ItemDto;
import com.kodilla.patterns2.facade.api.OrderDto;
import com.kodilla.patterns2.facade.api.OrderFacade;
import com.kodilla.patterns2.facade.api.OrderProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ShopServiceTestSuite {

    @Autowired
    private ShopService shopService;

    @Autowired
    private OrderFacade orderFacade;

    @Test
    public void testShopFacade() {
        OrderDto order = new OrderDto();
        order.addItem(new ItemDto(10L, 2));
        order.addItem(new ItemDto(216L, 1));
        order.addItem(new ItemDto(25L, 1));
        order.addItem(new ItemDto(11L, 3));
        try {
            orderFacade.processOrder(order, 1L);
        } catch (OrderProcessingException e) {

        }
    }


}