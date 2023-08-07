package com.poc.dataflow.springcloudstream.sink.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {

    private Long id;

    private String name;

    private double price;
}
