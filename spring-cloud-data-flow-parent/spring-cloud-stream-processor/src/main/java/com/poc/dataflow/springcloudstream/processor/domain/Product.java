package com.poc.dataflow.springcloudstream.processor.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Long id;

    private String name;

    private double price;
}
