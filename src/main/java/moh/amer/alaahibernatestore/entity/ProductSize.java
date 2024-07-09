package moh.amer.alaahibernatestore.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product_sizes")
public class ProductSize {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "size_id1", nullable = false)
    private Size sizeId1;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "price", nullable = false)
    private Float price;

    @Column(name = "sizes_id", nullable = false)
    private Integer sizesId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Size getSizeId1() {
        return sizeId1;
    }

    public void setSizeId1(Size sizeId1) {
        this.sizeId1 = sizeId1;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getSizesId() {
        return sizesId;
    }

    public void setSizesId(Integer sizesId) {
        this.sizesId = sizesId;
    }

}