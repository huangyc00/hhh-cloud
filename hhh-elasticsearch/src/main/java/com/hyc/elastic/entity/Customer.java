package com.hyc.elastic.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "es-customer", type = "customer", shards = 2, replicas = 1, refreshInterval = "-1")
@Data
public class Customer {

    @Id
    private String id;
    private String firstName;
    private String lastName;

}
