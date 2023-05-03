package com.atb.housing_rent_andrii_t.repository;

import com.atb.housing_rent_andrii_t.model.RentEntity;
import com.atb.housing_rent_andrii_t.model.RentList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentRepository extends JpaRepository<RentEntity, Long> {
    @Query(value = """
                SELECT
                 `rent`.`rent_id`,
                 `rent`.`client_id`,
                 `rent`.`property_id`,
                 `rent`.`start_rent`,
                 `rent`.`end_rent`,
                 `rent`.`creation_date`
                FROM
                  `housing_rent`.`rent`
                WHERE
                  rent.property_id = :id
                ORDER BY rent.start_rent DESC;

            """, nativeQuery = true)
    List<RentEntity> rentDatePropertyList(@Param("id") Long id);


    @Query(name = "rentList", nativeQuery = true)
    List<RentList> rentList(@Param("id") Long id);
}
