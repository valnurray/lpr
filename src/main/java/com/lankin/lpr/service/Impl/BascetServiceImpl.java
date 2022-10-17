package com.lankin.lpr.service.Impl;

import com.lankin.lpr.exception.ResourceNotFoundException;
import com.lankin.lpr.model.Bascet;
import com.lankin.lpr.model.Content;
import com.lankin.lpr.repository.BascetRepository;
import com.lankin.lpr.service.BascetService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BascetServiceImpl implements BascetService {

    private BascetRepository bascetRepository;

    public BascetServiceImpl (BascetRepository bascetRepository) {
        this.bascetRepository = bascetRepository;
    }

    @Override
    public Bascet addBascet(Bascet bascet) {
        return bascetRepository.save(bascet);
    }

    @Override
    public List<Bascet> getAllBascets() {
        return bascetRepository.findAll();
    }

    @Override
    public Bascet getBascetById(long id) {
        return bascetRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Bascet", "Id", id));
    }

    @Override
    public Bascet updateBascet(Bascet bascet, long id) {
        Bascet existingBascet = bascetRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Bascet", "Id", id));

        existingBascet.setCountOrders(bascet.getCountOrders());
        existingBascet.setTotalOrderPrice(bascet.getTotalOrderPrice());
        bascetRepository.save(existingBascet);
        return existingBascet;
    }

    @Override
    public void deleteBascet(long id) {
        bascetRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Bascet", "Id", id));
        bascetRepository.deleteById(id);
    }
}
