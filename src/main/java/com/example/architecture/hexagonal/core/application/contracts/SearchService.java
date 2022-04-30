package com.example.architecture.hexagonal.core.application.contracts;

import com.example.architecture.hexagonal.core.domain.SearchQuery;
import com.example.architecture.hexagonal.core.domain.SearchResult;

public interface SearchService {
    SearchResult getSearchResult(SearchQuery searchQuery);
}
