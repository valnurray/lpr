package com.lankin.lpr.service;

import com.lankin.lpr.model.OrderField;

import java.util.List;

public interface OrderFieldService {
    OrderField addOrderField(OrderField orderField);
    List<OrderField> getAllOrderFields();
    OrderField getOrderFieldById(long id);
    OrderField updateOrderField(OrderField orderField, long id);
    void deleteOrderField(long id);
}
