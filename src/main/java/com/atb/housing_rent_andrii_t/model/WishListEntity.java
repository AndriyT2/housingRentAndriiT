package com.atb.housing_rent_andrii_t.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "wish_list", schema = "housing_rent")
public class WishListEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "wish_list_id", nullable = false)
    private Long wishListId;
    @NotBlank(message = "Client id rent id may not be blank")
    @Column(name = "client_id", insertable = false, updatable = false)
    private Long clientId;
    @NotBlank(message = "Property id rent id may not be blank")
    @Column(name = "property_id", insertable = false, updatable = false)
    private Long propertyId;
    @Column(name = "creation_date")
    private Timestamp creationDate;
    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "client_id", nullable = false)
    private ClientEntity clientByClientId;
    @ManyToOne
    @JoinColumn(name = "property_id", referencedColumnName = "property_id", nullable = false)
    private PropertyEntity propertyByPropertyId;

    public Long getWishListId() {
        return wishListId;
    }

    public void setWishListId(Long wishListId) {
        this.wishListId = wishListId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WishListEntity that = (WishListEntity) o;
        return Objects.equals(wishListId, that.wishListId) && Objects.equals(clientId, that.clientId) && Objects.equals(propertyId, that.propertyId) && Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wishListId, clientId, propertyId, creationDate);
    }

    public ClientEntity getClientByClientId() {
        return clientByClientId;
    }

    public void setClientByClientId(ClientEntity clientByClientId) {
        this.clientByClientId = clientByClientId;
    }

    public PropertyEntity getPropertyByPropertyId() {
        return propertyByPropertyId;
    }

    public void setPropertyByPropertyId(PropertyEntity propertyByPropertyId) {
        this.propertyByPropertyId = propertyByPropertyId;
    }
}
