package com.practice.springframework.examples.calculations.components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MongoDBService implements DataService {
  @Override
  public int[] retrieveData() {
    return new int[] {11, 22, 33, 44, 55};
  }
}
