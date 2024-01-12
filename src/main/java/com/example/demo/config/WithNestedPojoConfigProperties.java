package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my.nested.props")
public class WithNestedPojoConfigProperties {

    String topStr;

    Nested nested;

    public Nested getNested() {
        return nested;
    }

    public void setNested(Nested nested) {
        this.nested = nested;
    }

    public String getTopStr() {
        return topStr;
    }

    public void setTopStr(String topStr) {
        this.topStr = topStr;
    }

    public static class Nested{

        String nestedStr;
        Deep deep;

        public Deep getDeep() {
            return deep;
        }

        public void setDeep(Deep deep) {
            this.deep = deep;
        }

        public String getNestedStr() {
            return nestedStr;
        }

        public void setNestedStr(String nestedStr) {
            this.nestedStr = nestedStr;
        }
        public static class Deep{
            String deepNestedStr;

            public String getDeepNestedStr() {
                return deepNestedStr;
            }

            public void setDeepNestedStr(String deepNestedStr) {
                this.deepNestedStr = deepNestedStr;
            }
        }
    }

}
