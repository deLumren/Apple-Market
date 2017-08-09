package edu.bionic.domain;

import java.math.BigDecimal;

public class Product {

    private Integer id;
    private String name;
    private BigDecimal price;
    private Color color;
    private Integer capacity;
    private String display;
    private String description;

    public Product() { }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", color=" + color +
                ", capacity=" + capacity +
                ", display='" + display + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != null ? !id.equals(product.id) : product.id != null) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        if (price != null ? !price.equals(product.price) : product.price != null) return false;
        if (color != product.color) return false;
        if (capacity != null ? !capacity.equals(product.capacity) : product.capacity != null) return false;
        return display != null ? display.equals(product.display) : product.display == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (capacity != null ? capacity.hashCode() : 0);
        result = 31 * result + (display != null ? display.hashCode() : 0);
        return result;
    }

    public Product(Integer id, String name, BigDecimal price, Color color, Integer capacity, String display) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.capacity = capacity;
        this.display = display;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String printInfo() {
        return String.format("%d. %s %s %d - %.2f", id, name, color, capacity, price);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
