package com.atb.housing_rent_andrii_t.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity

@Table(name = "property", schema = "housing_rent")
public class PropertyEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "property_id", nullable = false)
    private Long propertyId;
    @NotEmpty(message = "Title may not be empty")
    @Size(min = 2, max = 75, message = "Title must be between 2 and 75 characters long")
    @Column(name = "title")
    private String title;
    @NotEmpty(message = "Region may not be empty")
    @Size(min = 2, max = 10, message = "Region must be between 2 and 10 characters long")
    @Column(name = "region")
    private String region;
    @NotEmpty(message = "City may not be empty")
    @Size(min = 2, max = 45, message = "City must be between 2 and 45 characters long")
    @Column(name = "city")
    private String city;
    @Size(min = 2, max = 45, message = "District must be between 2 and 45 characters long")
    @Column(name = "district")
    private String district;
    @NotEmpty(message = "Street may not be empty")
    @Size(min = 2, max = 45, message = "Street must be between 2 and 45 characters long")
    @Column(name = "street")
    private String street;
    @NotBlank(message = "House number may not be blank")
    @Column(name = "house_number")
    private Integer houseNumber;
    @Size(max = 2, message = "Street must be max 2 characters long")
    @Column(name = "corps")
    private String corps;
    @Column(name = "total_floors")
    private Integer totalFloors;
    @Column(name = "floor")
    private Integer floor;
    @Column(name = "unit_number")
    private Integer unitNumber;
    @NotBlank(message = "Number of rooms may not be blank")
    @Column(name = "number_of_rooms")
    private Integer numberOfRooms;
    @NotBlank(message = "Total area may not be blank")
    @Column(name = "total_area")
    private Integer totalArea;
    @NotBlank(message = "Price may not be blank")
    @Column(name = "price")
    private Integer price;
    @Size(max = 500, message = "Description must be max 500 characters long")
    @Column(name = "description")
    private String description;
    @Column(name = "creation_date")
    private Timestamp creationDate;
    @OneToMany(mappedBy = "propertyByPropertyId")
    @JsonIgnore
    private Collection<PropertyImageEntity> propertyImagesByPropertyId;
    @OneToMany(mappedBy = "propertyByPropertyId")
    @JsonIgnore
    private Collection<RentEntity> rentsByPropertyId;
    @OneToMany(mappedBy = "propertyByPropertyId")
    @JsonIgnore
    private Collection<ReviewsEntity> reviewsByPropertyId;
    @OneToMany(mappedBy = "propertyByPropertyId")
    @JsonIgnore
    private Collection<WishListEntity> wishListsByPropertyId;

    public Long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCorps() {
        return corps;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    public Integer getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(Integer totalFloors) {
        this.totalFloors = totalFloors;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(Integer unitNumber) {
        this.unitNumber = unitNumber;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Integer getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(Integer totalArea) {
        this.totalArea = totalArea;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        PropertyEntity that = (PropertyEntity) o;
        return Objects.equals(propertyId, that.propertyId) && Objects.equals(title, that.title) && Objects.equals(region, that.region) && Objects.equals(city, that.city) && Objects.equals(district, that.district) && Objects.equals(street, that.street) && Objects.equals(houseNumber, that.houseNumber) && Objects.equals(corps, that.corps) && Objects.equals(totalFloors, that.totalFloors) && Objects.equals(floor, that.floor) && Objects.equals(unitNumber, that.unitNumber) && Objects.equals(numberOfRooms, that.numberOfRooms) && Objects.equals(totalArea, that.totalArea) && Objects.equals(price, that.price) && Objects.equals(description, that.description) && Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyId, title, region, city, district, street, houseNumber, corps, totalFloors, floor, unitNumber, numberOfRooms, totalArea, price, description, creationDate);
    }

    @Override
    public String toString() {
        return "PropertyEntity{" +
               "propertyId=" + propertyId +
               ", title='" + title + '\'' +
               ", region='" + region + '\'' +
               ", city='" + city + '\'' +
               ", district='" + district + '\'' +
               ", street='" + street + '\'' +
               ", houseNumber=" + houseNumber +
               ", corps='" + corps + '\'' +
               ", totalFloors=" + totalFloors +
               ", floor=" + floor +
               ", unitNumber=" + unitNumber +
               ", numberOfRooms=" + numberOfRooms +
               ", totalArea=" + totalArea +
               ", price=" + price +
               ", description='" + description + '\'' +
               ", creationDate=" + creationDate +
               ", propertyImagesByPropertyId=" + propertyImagesByPropertyId +
               ", rentsByPropertyId=" + rentsByPropertyId +
               ", reviewsByPropertyId=" + reviewsByPropertyId +
               ", wishListsByPropertyId=" + wishListsByPropertyId +
               '}';
    }

    public Collection<PropertyImageEntity> getPropertyImagesByPropertyId() {
        return propertyImagesByPropertyId;
    }

    public void setPropertyImagesByPropertyId(Collection<PropertyImageEntity> propertyImagesByPropertyId) {
        this.propertyImagesByPropertyId = propertyImagesByPropertyId;
    }

    public Collection<RentEntity> getRentsByPropertyId() {
        return rentsByPropertyId;
    }

    public void setRentsByPropertyId(Collection<RentEntity> rentsByPropertyId) {
        this.rentsByPropertyId = rentsByPropertyId;
    }

    public Collection<ReviewsEntity> getReviewsByPropertyId() {
        return reviewsByPropertyId;
    }

    public void setReviewsByPropertyId(Collection<ReviewsEntity> reviewsByPropertyId) {
        this.reviewsByPropertyId = reviewsByPropertyId;
    }

    public Collection<WishListEntity> getWishListsByPropertyId() {
        return wishListsByPropertyId;
    }

    public void setWishListsByPropertyId(Collection<WishListEntity> wishListsByPropertyId) {
        this.wishListsByPropertyId = wishListsByPropertyId;
    }
}
