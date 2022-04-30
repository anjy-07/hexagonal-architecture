package com.example.architecture.hexagonal.ports.rest.controllers;

import com.example.architecture.hexagonal.adapters.in.SearchQueryWebDto;
import com.example.architecture.hexagonal.adapters.out.SearchResultWebDto;
import com.example.architecture.hexagonal.core.application.contracts.SearchService;
import com.example.architecture.hexagonal.core.domain.SearchQuery;
import com.example.architecture.hexagonal.core.domain.SearchResult;
import com.example.architecture.hexagonal.ports.postgres.mappers.SearchResultWebMapper;
import com.example.architecture.hexagonal.ports.rest.controllers.mappers.SearchQueryWebMapper;
import org.springframework.stereotype.Controller;

@Controller
public class SearchResultController {
    private final SearchService searchService;
    private final SearchResultWebMapper searchResultWebMapper;
    private final SearchQueryWebMapper searchQueryWebMapper;

    public SearchResultController(SearchService searchService,
                                  SearchResultWebMapper searchResultWebMapper,
                                  SearchQueryWebMapper searchQueryWebMapper) {
        this.searchService = searchService;
        this.searchResultWebMapper = searchResultWebMapper;
        this.searchQueryWebMapper = searchQueryWebMapper;
    }

//    @GetMapping("/search/{query}")
    public SearchResultWebDto search(SearchQueryWebDto query) {
        SearchQuery searchQuery = searchQueryWebMapper.map(query);
        SearchResult searchResult = searchService.getSearchResult(searchQuery);
        return searchResultWebMapper.map(searchResult);
    }
}
