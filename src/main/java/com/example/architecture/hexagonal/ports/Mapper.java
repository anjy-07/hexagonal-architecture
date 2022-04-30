package com.example.architecture.hexagonal.ports;

public interface Mapper<T, R> {
    R map(T source);
}
