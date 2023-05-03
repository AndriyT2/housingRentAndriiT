package com.atb.housing_rent_andrii_t.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "client", schema = "housing_rent")
public class ClientEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "client_id", nullable = false)
    private Long clientId;
    @NotEmpty(message = "Lastname may not be empty")
    @Size(min = 2, max = 50, message = "Lastname must be between 2 and 50 characters long")
    @Column(name = "lastname")
    private String lastname;
    @NotEmpty(message = "Name may not be empty")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters long")
    @Column(name = "firstname", nullable = false, length = 50)
    private String firstname;
    @Size(min = 9, max = 9, message = "Phone must be 9 characters long")
    @Column(name = "phone")
    private Integer phone;
    @Email
    @Size(max = 50, message = "Email must be between 2 and 50 characters long")
    @Column(name = "email")
    private String email;
    @NotEmpty(message = "Password may not be empty")
    @Size(min = 8, max = 45, message = "Password must be between 8 and 45 characters long")
    @Column(name = "password", nullable = true, length = 45)
    private String password;
    @Column(name = "role")
    private Object role;
    @Column(name = "creation_date")
    private Timestamp creationDate;
    @OneToMany(mappedBy = "clientByClientId")
    private Collection<RentEntity> rentsByClientId;
    @OneToMany(mappedBy = "clientByClientId")
    private Collection<ReviewsEntity> reviewsByClientId;
    @OneToMany(mappedBy = "clientByClientId")
    private Collection<WishListEntity> wishListsByClientId;

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Object getRole() {
        return role;
    }

    public void setRole(Object role) {
        this.role = role;
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
        ClientEntity that = (ClientEntity) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(lastname, that.lastname) && Objects.equals(firstname, that.firstname) && Objects.equals(phone, that.phone) && Objects.equals(email, that.email) && Objects.equals(password, that.password) && Objects.equals(role, that.role) && Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, lastname, firstname, phone, email, password, role, creationDate);
    }

    public Collection<RentEntity> getRentsByClientId() {
        return rentsByClientId;
    }

    public void setRentsByClientId(Collection<RentEntity> rentsByClientId) {
        this.rentsByClientId = rentsByClientId;
    }

    public Collection<ReviewsEntity> getReviewsByClientId() {
        return reviewsByClientId;
    }

    public void setReviewsByClientId(Collection<ReviewsEntity> reviewsByClientId) {
        this.reviewsByClientId = reviewsByClientId;
    }

    public Collection<WishListEntity> getWishListsByClientId() {
        return wishListsByClientId;
    }

    public void setWishListsByClientId(Collection<WishListEntity> wishListsByClientId) {
        this.wishListsByClientId = wishListsByClientId;
    }
}
