package com.lankin.lpr.controller;

import com.lankin.lpr.model.OrderField;
import com.lankin.lpr.model.Role;
import com.lankin.lpr.service.OrderFieldService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/orderfield")
public class OrderFieldController {

    private OrderFieldService orderFieldService;

    public OrderFieldController (OrderFieldService orderFieldService) {
        this.orderFieldService = orderFieldService;
    }

    @PostMapping
    public ResponseEntity<OrderField> addOrderField(@RequestBody OrderField orderField){
        return new ResponseEntity<OrderField>(orderFieldService.addOrderField(orderField), HttpStatus.CREATED);
    }

    @GetMapping
    public List<OrderField> getAllOrderFields(){
        return orderFieldService.getAllOrderFields();
    }

    @GetMapping("{id}")
    public ResponseEntity<OrderField> getOrderFieldById(@PathVariable("id") long orderFieldId){
        return new ResponseEntity<OrderField>(orderFieldService.getOrderFieldById(orderFieldId), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<OrderField> updateOrderField(@PathVariable("id") long id
            ,@RequestBody OrderField orderField){
        return new ResponseEntity<OrderField>(orderFieldService.updateOrderField(orderField, id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteOrderField(@PathVariable("id") long id){
        orderFieldService.deleteOrderField(id);
        return new ResponseEntity<String>("OrderField deleted successfully!", HttpStatus.OK);
    }

}
