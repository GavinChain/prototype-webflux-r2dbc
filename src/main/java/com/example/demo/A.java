package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class A {
  @Autowired
  TableNameRepository tableNameRepository;
  @RequestMapping
  public Mono<TableName> a(){
    TableName t=new TableName();
    t.setName("Hello");
    return tableNameRepository.save(t);
  }

  @RequestMapping("findAll")
  public Flux<TableName> findAll(){
    return tableNameRepository.findAll();
  }
}
