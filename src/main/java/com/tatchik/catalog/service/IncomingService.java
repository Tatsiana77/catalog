package com.tatchik.catalog.service;

import com.tatchik.catalog.dto.BookDto;
import com.tatchik.catalog.dto.IncomingDto;

import java.util.List;
import java.util.Set;

public interface IncomingService {

    Set<IncomingDto> getAllIncoming();

}
