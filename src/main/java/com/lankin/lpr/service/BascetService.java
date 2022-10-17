package com.lankin.lpr.service;

import com.lankin.lpr.model.Bascet;
import com.lankin.lpr.model.Content;

import java.util.List;

public interface BascetService {
    Bascet addBascet(Bascet bascet);
    List<Bascet> getAllBascets();
    Bascet getBascetById(long id);
    Bascet updateBascet(Bascet bascet, long id);
    void deleteBascet(long id);
}
