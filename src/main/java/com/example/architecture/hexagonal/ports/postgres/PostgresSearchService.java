package com.example.architecture.hexagonal.ports.postgres;

import com.example.architecture.hexagonal.core.application.contracts.SearchInputService;
import com.example.architecture.hexagonal.core.application.contracts.SearchService;
import com.example.architecture.hexagonal.core.domain.SearchQuery;
import com.example.architecture.hexagonal.core.domain.SearchResult;
import org.springframework.stereotype.Service;

@Service
public class PostgresSearchService implements SearchService {

    @Override
    public SearchResult getSearchResult(SearchQuery searchQuery) {
        return null;
    }
}
