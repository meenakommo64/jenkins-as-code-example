package com.muatik.testappforjenkins.service;

import org.springframework.stereotype.Service;

@Service
public class BookServiceBean implements BookService {
    @Override
    public double calculateCost(int pageSize) {
        return pageSize * 0.32;
    }
}
