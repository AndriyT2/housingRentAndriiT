package com.atb.housing_rent_andrii_t.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "property_image", schema = "housing_rent")
public class PropertyImageEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "property_image_id", nullable = false)
    private Long propertyImageId;
    @NotBlank(message = "Property id may not be blank")
    @Column(name = "property_id", insertable = false, updatable = false)
    private Long propertyId;
    @Column(name = "image_1")
    private byte[] image1;
    @Column(name = "image_2")
    private byte[] image2;
    @Column(name = "image_3")
    private byte[] image3;
    @Column(name = "image_4")
    private byte[] image4;
    @ManyToOne
    @JoinColumn(name = "property_id", referencedColumnName = "property_id", nullable = false)
    private PropertyEntity propertyByPropertyId;

    public Long getPropertyImageId() {
        return propertyImageId;
    }

    public void setPropertyImageId(Long propertyImageId) {
        this.propertyImageId = propertyImageId;
    }

    public Long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    public byte[] getImage1() {
        return image1;
    }

    public void setImage1(byte[] image1) {
        this.image1 = image1;
    }

    public byte[] getImage2() {
        return image2;
    }

    public void setImage2(byte[] image2) {
        this.image2 = image2;
    }

    public byte[] getImage3() {
        return image3;
    }

    public void setImage3(byte[] image3) {
        this.image3 = image3;
    }

    public byte[] getImage4() {
        return image4;
    }

    public void setImage4(byte[] image4) {
        this.image4 = image4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropertyImageEntity that = (PropertyImageEntity) o;
        return Objects.equals(propertyImageId, that.propertyImageId) && Objects.equals(propertyId, that.propertyId) && Arrays.equals(image1, that.image1) && Arrays.equals(image2, that.image2) && Arrays.equals(image3, that.image3) && Arrays.equals(image4, that.image4);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(propertyImageId, propertyId);
        result = 31 * result + Arrays.hashCode(image1);
        result = 31 * result + Arrays.hashCode(image2);
        result = 31 * result + Arrays.hashCode(image3);
        result = 31 * result + Arrays.hashCode(image4);
        return result;
    }

    public PropertyEntity getPropertyByPropertyId() {
        return propertyByPropertyId;
    }

    public void setPropertyByPropertyId(PropertyEntity propertyByPropertyId) {
        this.propertyByPropertyId = propertyByPropertyId;
    }
}
