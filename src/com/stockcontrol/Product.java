package com.stockcontrol;

/**
 * Classe que representa um produto no sistema de controle de estoque.
 * Contém informações como nome, preço e quantidade em estoque.
 */
public class Product {
    private String name;
    private double price;
    private int quantity;

    /**
     * Construtor da classe Product.
     * @param name Nome do produto
     * @param price Preço do produto
     * @param quantity Quantidade inicial em estoque
     */
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
