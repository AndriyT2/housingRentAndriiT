package com.atb.housing_rent_andrii_t.model;

import java.sql.Timestamp;
import java.util.Objects;


public class RentList {


    public RentList(String title, String region, String city, String district, String street, Integer houseNumber, String corps, Integer totalFloors, Integer floor, Integer unitNumber, Integer numberOfRooms, Integer totalArea, Integer price, String description, Timestamp startRent, Timestamp endRent, Timestamp creationDate) {
        this.title = title;
        this.region = region;
        this.city = city;
        this.district = district;
        this.street = street;
        this.houseNumber = houseNumber;
        this.corps = corps;
        this.totalFloors = totalFloors;
        this.floor = floor;
        this.unitNumber = unitNumber;
        this.numberOfRooms = numberOfRooms;
        this.totalArea = totalArea;
        this.price = price;
        this.description = description;
        this.startRent = startRent;
        this.endRent = endRent;
        this.creationDate = creationDate;
    }

    private String title;
    private String region;
    private String city;
    private String district;
    private String street;
    private Integer houseNumber;
    private String corps;
    private Integer totalFloors;
    private Integer floor;
    private Integer unitNumber;
    private Integer numberOfRooms;
    private Integer totalArea;
    private Integer price;
    private String description;
    private Timestamp startRent;
    private Timestamp endRent;
    private Timestamp creationDate;

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

    public Timestamp getStartRent() {
        return startRent;
    }

    public void setStartRent(Timestamp startRent) {
        this.startRent = startRent;
    }

    public Timestamp getEndRent() {
        return endRent;
    }

    public void setEndRent(Timestamp endRent) {
        this.endRent = endRent;
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
        if (!super.equals(o)) return false;
        RentList rentList = (RentList) o;
        return Objects.equals(title, rentList.title) && Objects.equals(region, rentList.region) && Objects.equals(city, rentList.city) && Objects.equals(district, rentList.district) && Objects.equals(street, rentList.street) && Objects.equals(houseNumber, rentList.houseNumber) && Objects.equals(corps, rentList.corps) && Objects.equals(totalFloors, rentList.totalFloors) && Objects.equals(floor, rentList.floor) && Objects.equals(unitNumber, rentList.unitNumber) && Objects.equals(numberOfRooms, rentList.numberOfRooms) && Objects.equals(totalArea, rentList.totalArea) && Objects.equals(price, rentList.price) && Objects.equals(description, rentList.description) && Objects.equals(startRent, rentList.startRent) && Objects.equals(endRent, rentList.endRent) && Objects.equals(creationDate, rentList.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title, region, city, district, street, houseNumber, corps, totalFloors, floor, unitNumber, numberOfRooms, totalArea, price, description, startRent, endRent, creationDate);
    }

    @Override
    public String toString() {
        return "RentList{" +
               "title='" + title + '\'' +
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
               ", startRent=" + startRent +
               ", endRent=" + endRent +
               ", creationDate=" + creationDate +
               '}';
    }
}
