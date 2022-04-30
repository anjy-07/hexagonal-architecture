package com.example.architecture.hexagonal.ports.rest.controllers.mappers;

import com.example.architecture.hexagonal.adapters.in.SearchQueryWebDto;
import com.example.architecture.hexagonal.core.domain.SearchQuery;
import com.example.architecture.hexagonal.ports.Mapper;
import org.springframework.stereotype.Component;

@Component
public class SearchQueryWebMapper implements Mapper<SearchQueryWebDto, SearchQuery> {
    @Override
    public SearchQuery map(SearchQueryWebDto source) {
        return null;
    }
}
