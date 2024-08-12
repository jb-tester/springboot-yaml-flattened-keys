package com.example.demo;

import com.example.demo.config.MapConfigProperties;
import com.example.demo.config.WithNestedPojoConfigProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner  {
    @Value("${some.dummy.props}")
    String dummy;

    private final MapConfigProperties mapConfigProperties;
    private final WithNestedPojoConfigProperties withNestedPojoConfigProperties;

    public DemoApplication(MapConfigProperties mapConfigProperties, WithNestedPojoConfigProperties withNestedPojoConfigProperties) {
        this.mapConfigProperties = mapConfigProperties;
        this.withNestedPojoConfigProperties = withNestedPojoConfigProperties;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        mapConfigProperties.getMapOfMaps().forEach((k, v) -> System.out.println((k + ":" + v)));
        mapConfigProperties.getMapOfStrings().forEach((k, v) -> System.out.println((k + ":" + v)));
        mapConfigProperties.getEnumkeys().forEach((k, v) -> System.out.println((k + ":" + v)));
        System.out.println(withNestedPojoConfigProperties.getTopStr());
        System.out.println(withNestedPojoConfigProperties.getNested().getNestedStr());
        System.out.println(withNestedPojoConfigProperties.getNested().getDeep().getDeepNestedStr());
    }
}
