package com.atb.housing_rent_andrii_t.repository;

import com.atb.housing_rent_andrii_t.model.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
}
