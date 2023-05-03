package com.atb.housing_rent_andrii_t.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Objects;

@Entity
@Table(name = "reviews", schema = "housing_rent")
public class ReviewsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "reviews_id", nullable = false)
    private Long reviewsId;
    @Column(name = "client_id", insertable = false, updatable = false)
    private Long clientId;
    @Column(name = "property_id", insertable = false, updatable = false)
    private Long propertyId;
    @NotBlank(message = "Rating id may not be blank")
    @Column(name = "rating")
    private Object rating;
    @Size(max = 500, message = "Comment must be max 600 characters long")
    @Column(name = "comment")
    private String comment;
    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "client_id")
    private ClientEntity clientByClientId;
    @ManyToOne
    @JoinColumn(name = "property_id", referencedColumnName = "property_id")
    private PropertyEntity propertyByPropertyId;

    public Long getReviewsId() {
        return reviewsId;
    }

    public void setReviewsId(Long reviewsId) {
        this.reviewsId = reviewsId;
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

    public Object getRating() {
        return rating;
    }

    public void setRating(Object rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReviewsEntity that = (ReviewsEntity) o;
        return Objects.equals(reviewsId, that.reviewsId) && Objects.equals(clientId, that.clientId) && Objects.equals(propertyId, that.propertyId) && Objects.equals(rating, that.rating) && Objects.equals(comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewsId, clientId, propertyId, rating, comment);
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
