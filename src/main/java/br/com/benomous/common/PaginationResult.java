package br.com.benomous.common;

import java.util.List;

public record PaginationResult<Object>(int page, int size,
                                       int numberOfPages, List<Object> data) {
    public PaginationResult {
    }
}
