package com.example.architecture.hexagonal.core.domain;

import lombok.Data;

@Data
public class SearchQuery {
    String query;
    int id;
    int pageNumber;
    int limit;
}
