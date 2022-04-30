package com.example.architecture.hexagonal.ports.postgres.mappers;

import com.example.architecture.hexagonal.adapters.out.SearchResultWebDto;
import com.example.architecture.hexagonal.core.domain.SearchResult;
import com.example.architecture.hexagonal.ports.Mapper;
import org.springframework.stereotype.Component;

@Component
public class SearchResultWebMapper implements Mapper<SearchResult, SearchResultWebDto> {

    @Override
    public SearchResultWebDto map(SearchResult source) {
        return null;
    }
}
