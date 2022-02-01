package com.first.spring.dto;

import lombok.Value;

@Value
public class Book {
    Long id;
    String author;
    String title;
    Double price;
}