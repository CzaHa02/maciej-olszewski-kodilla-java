package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue
    @Column(name = "invoice_id")
    private int id;

    @Column(name = "invoice_number")
    private String number;

   @OneToMany(
            targetEntity = Item.class,
           mappedBy = "invoice",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
   private List<Item> items = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(String number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public List<Item> getItems() {
      return items;
   }

   public void addItem(Item item) {
        items.add(item);
        item.setInvoice(this);
    }
}