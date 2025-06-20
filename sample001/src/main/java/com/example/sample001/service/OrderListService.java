package com.example.sample001.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sample001.entity.AppOrderList;
import com.example.sample001.repository.AppOrderListRepository;

@Service
public class OrderListService {

    private final AppOrderListRepository repository;

    public OrderListService(AppOrderListRepository repository) {
        this.repository = repository;
    }

    public List<AppOrderList> findAll() {
        return repository.findAll();
    }

    public void save(AppOrderList order) {
        repository.save(order);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
