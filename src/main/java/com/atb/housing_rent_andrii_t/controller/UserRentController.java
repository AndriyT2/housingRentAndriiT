package com.atb.housing_rent_andrii_t.controller;

import com.atb.housing_rent_andrii_t.model.PropertyEntity;
import com.atb.housing_rent_andrii_t.model.RentEntity;
import com.atb.housing_rent_andrii_t.model.RentList;
import com.atb.housing_rent_andrii_t.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("api/rent")
public class UserRentController {

private RentService rentService;

    @Autowired
    public UserRentController(RentService rentService) {
        this.rentService = rentService;
    }


    @GetMapping("api/wish_list")
    public ResponseEntity<List<PropertyEntity>> getWishList() {
        List<PropertyEntity> wishList = this.rentService.wishList(1L);
        if (wishList == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(wishList, HttpStatus.OK);
    }


    @GetMapping("api/rent_list")
    public ResponseEntity<List<RentList>> getRentList() {
        List<RentList> rentList = this.rentService.rentList(1L);
        if (rentList == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(rentList, HttpStatus.OK);
    }

    @GetMapping("api/rent_date_list")
    public ResponseEntity<List<RentEntity>> getRentDateList() {
        List<RentEntity> rentDateList = this.rentService.rentDateList(2L);
        if (rentDateList == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(rentDateList, HttpStatus.OK);
    }




}
