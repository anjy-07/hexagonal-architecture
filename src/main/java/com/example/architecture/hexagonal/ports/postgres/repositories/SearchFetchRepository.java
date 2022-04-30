package com.example.architecture.hexagonal.ports.postgres.repositories;

import com.example.architecture.hexagonal.core.application.contracts.SearchInputService;
import com.example.architecture.hexagonal.core.domain.SearchQuery;
import com.example.architecture.hexagonal.core.domain.SearchResult;

import java.util.List;

public class SearchFetchRepository implements SearchInputService {
    @Override
    public List<String> getSearchData(SearchQuery searchQuery) {
        return null;
    }

    @Override
    public int getSearchDataCount(SearchQuery searchQuery) {
        return 0;
    }
}
