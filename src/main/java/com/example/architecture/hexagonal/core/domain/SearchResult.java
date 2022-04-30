package com.example.architecture.hexagonal.core.domain;

import lombok.Builder;

import java.util.List;

@Builder
public class SearchResult {
    List<String> results;
    SearchMetaData metaData;
}
