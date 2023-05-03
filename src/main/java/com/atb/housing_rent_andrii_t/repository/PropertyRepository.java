package com.atb.housing_rent_andrii_t.repository;

import com.atb.housing_rent_andrii_t.model.PropertyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertyRepository extends JpaRepository<PropertyEntity, Long> {

    @Query(value = """
            SELECT\s
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
                `property`.`creation_date`
            FROM
                `housing_rent`.`property`
                    JOIN
                housing_rent.wish_list ON property.property_id = wish_list.property_id
                    WHERE
                    client_id = :id
            ORDER BY wish_list.creation_date DESC;

            """, nativeQuery = true)
    List<PropertyEntity> wishList(@Param("id") Long id);


//    List<PropertyEntity> findAllByPropertyId (Long id);

}
