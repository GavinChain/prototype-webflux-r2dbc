package com.example.demo;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("table_name")
@Data
public class TableName {
  @Id
  @CreatedBy
  private Long id;
  private String name;
  private Integer seril;
}
