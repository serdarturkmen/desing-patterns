package com.example.demo.service;

import com.example.demo.exeption.TypeOneException;
import com.example.demo.exeption.TypeTwoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleRetryClientService {
    @Autowired
    private SampleRetryService sampleRetryService;

    public String callRetryService() throws TypeOneException, TypeTwoException {
        return sampleRetryService.retryWhenException();
    }
}