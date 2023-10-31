package com.practice.springframework.examples.calculations.components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("SQL Service")
public class SQLService implements DataService {
  @Override
  public int[] retrieveData() {
    return new int[] {1, 2, 3, 4, 5};
  }
}
