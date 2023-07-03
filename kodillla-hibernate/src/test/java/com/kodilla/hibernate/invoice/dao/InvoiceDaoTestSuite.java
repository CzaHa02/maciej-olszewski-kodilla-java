package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @BeforeEach
    public void setUp() {
        Product product1 = new Product("Product 1");
        Product product2 = new Product("Product 2");
        Product product3 = new Product("Product 3");

        Item item1 = new Item(product1, new BigDecimal("10"), 2);
        Item item2 = new Item(product2, new BigDecimal("20"), 3);
        Item item3 = new Item(product3, new BigDecimal("30"), 4);

        Invoice invoice = new Invoice("Invoice 1");
        invoice.addItem(item1);
        invoice.addItem(item2);
        invoice.addItem(item3);

        invoiceDao.save(invoice);
    }

    @AfterEach
    public void tearDown() {
        invoiceDao.deleteAll();
    }

    @Test
    @Transactional
    public void testInvoiceDaoSave() {

        List<Invoice> invoices = (List<Invoice>) invoiceDao.findAll();


        int invoicesCount = invoices.size();
        Invoice savedInvoice = invoices.get(0);
        List<Item> items = savedInvoice.getItems();
        Item savedItem1 = items.get(0);
        Item savedItem2 = items.get(1);
        Item savedItem3 = items.get(2);


        assertEquals(1, invoicesCount);
        assertEquals("Invoice 1", savedInvoice.getNumber());
        assertEquals(3, items.size());
        assertEquals("Product 1", savedItem1.getProduct().getName());
        assertEquals(new BigDecimal("10"), savedItem1.getPrice());
        assertEquals(2, savedItem1.getQuantity());
        assertEquals(new BigDecimal("20"), savedItem1.getValue());

    }
}