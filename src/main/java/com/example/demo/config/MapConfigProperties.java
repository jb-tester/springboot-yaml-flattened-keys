package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties(prefix = "my.map.props")
public class MapConfigProperties {
    private Map<String, Map<String, String>> mapOfMaps;
    private Map<String,String> mapOfStrings;
    private Map<MyEnum,String> enumkeys;

    public Map<String, Map<String, String>> getMapOfMaps() {
        return mapOfMaps;
    }

    public void setMapOfMaps(Map<String, Map<String, String>> mapOfMaps) {
        this.mapOfMaps = mapOfMaps;
    }

    public Map<String, String> getMapOfStrings() {
        return mapOfStrings;
    }

    public void setMapOfStrings(Map<String, String> mapOfStrings) {
        this.mapOfStrings = mapOfStrings;
    }

    public Map<MyEnum, String> getEnumkeys() {
        return enumkeys;
    }

    public void setEnumkeys(Map<MyEnum, String> enumkeys) {
        this.enumkeys = enumkeys;
    }
}
