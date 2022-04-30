package com.example.architecture.hexagonal.core.application.contracts;

import com.example.architecture.hexagonal.core.domain.SearchQuery;

import java.util.List;

public interface SearchInputService {
    List<String> getSearchData(SearchQuery searchQuery);
    int getSearchDataCount(SearchQuery searchQuery);
}
