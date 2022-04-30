package com.example.architecture.hexagonal.core.application.services.impl;

import com.example.architecture.hexagonal.core.application.contracts.SearchInputService;
import com.example.architecture.hexagonal.core.application.contracts.SearchService;
import com.example.architecture.hexagonal.core.domain.SearchMetaData;
import com.example.architecture.hexagonal.core.domain.SearchQuery;
import com.example.architecture.hexagonal.core.domain.SearchResult;

import java.util.List;

public class SearchServiceImpl implements SearchService {
    private final SearchInputService searchInputService;

    public SearchServiceImpl(SearchInputService searchInputService) {
        this.searchInputService = searchInputService;
    }

    @Override
    public SearchResult getSearchResult(SearchQuery searchQuery) {
        List<String> result = searchInputService.getSearchData(searchQuery);
        int count = searchInputService.getSearchDataCount(searchQuery);

        return searchResult(result, count, searchQuery);
    }

    SearchResult searchResult(List<String> result, int count, SearchQuery searchQuery) {
        return SearchResult.builder()
                .results(result)
                .metaData(
                        SearchMetaData.builder()
                                .count(count)
                                .pageNumber(searchQuery.getPageNumber())
                                .pageSize(searchQuery.getLimit())
                                .build()
                )
                .build();
    }
}
