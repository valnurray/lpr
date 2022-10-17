package com.lankin.lpr.controller;

import com.lankin.lpr.model.ProductMembers;
import com.lankin.lpr.service.ProductMembersService;
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
@RequestMapping("/api/productMembers")
public class ProductMembersController {

    private ProductMembersService productMembersService;

    public ProductMembersController (ProductMembersService productMembersService) {
        this.productMembersService = productMembersService;
    }

    @PostMapping
    public ResponseEntity<ProductMembers> addProductMember(@RequestBody ProductMembers productMembers){
        return new ResponseEntity<ProductMembers>(productMembersService.addProductMembers(productMembers), HttpStatus.CREATED);
    }

    @GetMapping
    public List<ProductMembers> getAllProductMembers(){
        return productMembersService.getAllProductMembers();
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductMembers> getProductMembersById(@PathVariable("id") long productMemberId){
        return new ResponseEntity<ProductMembers>(productMembersService.getProductMembersById(productMemberId), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<ProductMembers> updateProductMembers(@PathVariable("id") long id
            ,@RequestBody ProductMembers productMembers){
        return new ResponseEntity<ProductMembers>(productMembersService.updateProductMembers(productMembers, id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteProductMembers(@PathVariable("id") long id){
        productMembersService.deleteProductMembers(id);
        return new ResponseEntity<String>("ProductMember deleted successfully!", HttpStatus.OK);
    }

}
