package com.example.demo;

import org.springframework.data.relational.core.sql.Table;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

import java.util.Collection;

public interface TableNameRepository extends ReactiveCrudRepository<TableName,Long> {


}

