package com.practice.springframework.examples.calculations.businessLogic;

import com.practice.springframework.examples.calculations.components.DataService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
  private DataService dataService;

  public BusinessCalculationService(@Qualifier("SQLService") DataService dataService) {
    this.dataService = dataService;
  }

  @Bean
  public int findMax() {
    return Arrays.stream(dataService.retrieveData()).max().orElse(0);
  }
}
