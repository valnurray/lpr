package com.lankin.lpr.controller;

import com.lankin.lpr.model.Bascet;
import com.lankin.lpr.model.Role;
import com.lankin.lpr.service.BascetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/bascet")
public class BascetController {

    private BascetService bascetService;

    public BascetController (BascetService bascetService) {
        this.bascetService = bascetService;
    }

    @PostMapping
    public ResponseEntity<Bascet> addBascet(@RequestBody Bascet bascet){
        return new ResponseEntity<Bascet>(bascetService.addBascet(bascet), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Bascet> getAllBascet(){
        return bascetService.getAllBascets();
    }

    @GetMapping("{id}")
    public ResponseEntity<Bascet> getBascetById(@PathVariable("id") long bascetId){
        return new ResponseEntity<Bascet>(bascetService.getBascetById(bascetId), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Bascet> updateBascet(@PathVariable("id") long id
            ,@RequestBody Bascet bascet){
        return new ResponseEntity<Bascet>(bascetService.updateBascet(bascet, id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBascet(@PathVariable("id") long id){
        bascetService.deleteBascet(id);
        return new ResponseEntity<String>("Bascet deleted successfully!", HttpStatus.OK);
    }
}
