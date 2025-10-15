package br.com.benomous.common;


public record PaginationResult<Object>(int page, int size,
                                       int numberOfPages, List<Object> data) {
    public PaginationResult {
    }
}
