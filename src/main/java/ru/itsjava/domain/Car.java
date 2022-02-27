package ru.itsjava.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Car {
    private final String brand;
    private final String model;

}
