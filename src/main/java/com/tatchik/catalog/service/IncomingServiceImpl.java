package com.tatchik.catalog.service;


import com.tatchik.catalog.repository.IncomingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncomingServiceImpl implements IncomingService {

    private IncomingRepository incomingRepository;

    @Autowired
    public IncomingServiceImpl(IncomingRepository incomingRepository) {
        this.incomingRepository = incomingRepository;
    }
}
