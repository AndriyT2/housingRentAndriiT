package com.atb.housing_rent_andrii_t.service;

import com.atb.housing_rent_andrii_t.model.PropertyEntity;
import com.atb.housing_rent_andrii_t.model.RentEntity;
import com.atb.housing_rent_andrii_t.model.RentList;
import com.atb.housing_rent_andrii_t.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RentService {
    private ClientRepository clientRepository;
    private PropertyImageRepository propertyImageRepository;
    private PropertyRepository propertyRepository;
    private RentRepository rentRepository;
    private ReviewsRepository reviewsRepository;
    private WishListRepository wishListRepository;

    @Autowired
    public RentService(ClientRepository clientRepository, PropertyImageRepository propertyImageRepository, PropertyRepository propertyRepository, RentRepository rentRepository, ReviewsRepository reviewsRepository, WishListRepository wishListRepository) {
        this.clientRepository = clientRepository;
        this.propertyImageRepository = propertyImageRepository;
        this.propertyRepository = propertyRepository;
        this.rentRepository = rentRepository;
        this.reviewsRepository = reviewsRepository;
        this.wishListRepository = wishListRepository;
    }

    @Transactional(readOnly = true)
    public List<PropertyEntity> wishList(Long id) {
        return propertyRepository.wishList(id);
    }

    @Transactional(readOnly = true)
    public List<RentList> rentList(Long id) {
        return rentRepository.rentList(id);
    }

    @Transactional(readOnly = true)
    public List<RentEntity> rentDateList(Long propertyId) {
        return rentRepository.rentDatePropertyList(propertyId);
    }

}
