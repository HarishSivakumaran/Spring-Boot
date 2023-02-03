package com.firstSpringApp.SpringAppBasics;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "currency-configuration")
public class CurrencyServiceConfiguration {
    private String id;
    private String password;
    private String URI;

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setURI(String URI) {
        this.URI = URI;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getURI() {
        return URI;
    }
}
