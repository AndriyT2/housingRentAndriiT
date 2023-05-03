package com.atb.housing_rent_andrii_t.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.sql.Timestamp;
import java.util.Objects;

@org.hibernate.annotations.NamedNativeQuery(name = "rentList",
        query = """
                SELECT
                    `property`.`property_id`,
                    `property`.`title`,
                    `property`.`region`,
                    `property`.`city`,
                    `property`.`district`,
                    `property`.`street`,
                    `property`.`house_number`,
                    `property`.`corps`,
                    `property`.`total_floors`,
                    `property`.`floor`,
                    `property`.`unit_number`,
                    `property`.`number_of_rooms`,
                    `property`.`total_area`,
                    `property`.`price`,
                    `property`.`description`,
                    `rent`.`start_rent`,
                    `rent`.`end_rent`,
                    `rent`.`creation_date`
                FROM
                    `housing_rent`.`property`
                        JOIN
                    housing_rent.rent ON property.property_id = rent.property_id
                WHERE
                    client_id = 1
                ORDER BY rent.creation_date DESC;
                       """,
        resultSetMapping = "rentListMapping")
@SqlResultSetMapping(name = "rentListMapping",
        classes = {
                @ConstructorResult(
                        columns = {
                                @ColumnResult(name = "title"),
                                @ColumnResult(name = "region"),
                                @ColumnResult(name = "city"),
                                @ColumnResult(name = "district"),
                                @ColumnResult(name = "street"),
                                @ColumnResult(name = "house_number", type = Integer.class),
                                @ColumnResult(name = "corps"),
                                @ColumnResult(name = "total_floors", type = Integer.class),
                                @ColumnResult(name = "floor", type = Integer.class),
                                @ColumnResult(name = "unit_number", type = Integer.class),
                                @ColumnResult(name = "number_of_rooms", type = Integer.class),
                                @ColumnResult(name = "total_area", type = Integer.class),
                                @ColumnResult(name = "price", type = Integer.class),
                                @ColumnResult(name = "description"),
                                @ColumnResult(name = "start_rent", type = Timestamp.class),
                                @ColumnResult(name = "end_rent", type = Timestamp.class),
                                @ColumnResult(name = "creation_date", type = Timestamp.class),
                        },
                        targetClass = RentList.class
                )}
)


@Entity
@Table(name = "rent", schema = "housing_rent")
public class RentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "rent_id", nullable = false)
    private Long rentId;
    @Column(name = "client_id", insertable = false, updatable = false)
    private Long clientId;
    @Column(name = "property_id", insertable = false, updatable = false)
    private Long propertyId;
    @NotBlank(message = "Start rent id may not be blank")
    @Column(name = "start_rent")
    private Timestamp startRent;
    @NotBlank(message = "End rent id may not be blank")
    @Column(name = "end_rent")
    private Timestamp endRent;
    @Column(name = "creation_date")
    private Timestamp creationDate;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "client_id", referencedColumnName = "client_id")
    private ClientEntity clientByClientId;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "property_id", referencedColumnName = "property_id")
    private PropertyEntity propertyByPropertyId;

    public Long getRentId() {
        return rentId;
    }

    public void setRentId(Long rentId) {
        this.rentId = rentId;
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
        RentEntity that = (RentEntity) o;
        return Objects.equals(rentId, that.rentId) && Objects.equals(clientId, that.clientId) && Objects.equals(propertyId, that.propertyId) && Objects.equals(startRent, that.startRent) && Objects.equals(endRent, that.endRent) && Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rentId, clientId, propertyId, startRent, endRent, creationDate);
    }

    @Override
    public String toString() {
        return "RentEntity{" +
               "rentId=" + rentId +
               ", clientId=" + clientId +
               ", propertyId=" + propertyId +
               ", startRent=" + startRent +
               ", endRent=" + endRent +
               ", creationDate=" + creationDate +
               ", clientByClientId=" + clientByClientId +
               ", propertyByPropertyId=" + propertyByPropertyId +
               '}';
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
