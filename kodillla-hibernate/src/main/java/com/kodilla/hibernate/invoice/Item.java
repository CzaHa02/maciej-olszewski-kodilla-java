package com.kodilla.hibernate.invoice;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "value")
    private BigDecimal value;

    public Item() {
    }

    public Item(Product product, BigDecimal price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.value = price.multiply(BigDecimal.valueOf(quantity));
    }

    public int getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}