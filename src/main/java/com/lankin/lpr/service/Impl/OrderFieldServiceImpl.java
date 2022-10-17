package com.lankin.lpr.service.Impl;

import com.lankin.lpr.exception.ResourceNotFoundException;
import com.lankin.lpr.model.OrderField;
import com.lankin.lpr.repository.OrderFieldRepository;
import com.lankin.lpr.service.OrderFieldService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderFieldServiceImpl implements OrderFieldService {

    private OrderFieldRepository orderFieldRepository;

    public OrderFieldServiceImpl (OrderFieldRepository orderFieldRepository) {
        this.orderFieldRepository = orderFieldRepository;
    }

    @Override
    public OrderField addOrderField(OrderField orderField) {
        return orderFieldRepository.save(orderField);
    }

    @Override
    public List<OrderField> getAllOrderFields() {
        return orderFieldRepository.findAll();
    }

    @Override
    public OrderField getOrderFieldById(long id) {
        return orderFieldRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("OrderField", "Id", id));
    }

    @Override
    public OrderField updateOrderField(OrderField orderField, long id) {
        OrderField existingOrderField = orderFieldRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("OrderField", "Id", id));

        existingOrderField.setTimeOrder(orderField.getTimeOrder());
        existingOrderField.setTotalPrice(orderField.getTotalPrice());
        orderFieldRepository.save(orderField);
        return existingOrderField;
    }

    @Override
    public void deleteOrderField(long id) {
        orderFieldRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("OrderField", "Id", id));
        orderFieldRepository.deleteById(id);
    }
}
