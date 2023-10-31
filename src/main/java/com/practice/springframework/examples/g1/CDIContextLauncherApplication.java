package com.practice.springframework.examples.g1;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.Arrays;
import org.springframework.context.annotation.*;

@Named
class BusinessService {
  private DataService dataService;

  //@Autowired
  @Inject // alternative to @Autowired
  public void setDataService(DataService dataService) {
    System.out.println("Setter injection");
    this.dataService = dataService;
  }

  public DataService getDataService() {
    return dataService;
  }
}

@Named //alternative to @Component
class DataService {}

@Configuration
@ComponentScan
public class CDIContextLauncherApplication {
  public static void main(String[] args) {
    try (var context =
        new AnnotationConfigApplicationContext(CDIContextLauncherApplication.class)) {
      Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
      System.out.println(context.getBean(BusinessService.class).getDataService());
    }
  }
}
