package moh.amer.alaahibernatestore.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "categorie_id", nullable = false)
    private Category categorie;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "brands_id", nullable = false)
    private Brand brands;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Column(name = "picture_path", nullable = false, length = 100)
    private String picturePath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Category getCategorie() {
        return categorie;
    }

    public void setCategorie(Category categorie) {
        this.categorie = categorie;
    }

    public Brand getBrands() {
        return brands;
    }

    public void setBrands(Brand brands) {
        this.brands = brands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

}