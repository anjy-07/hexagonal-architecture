package com.example.architecture.hexagonal.core.domain;

import lombok.Builder;

@Builder
public class SearchMetaData {
    int pageSize;
    int pageNumber;
    int count;
}
