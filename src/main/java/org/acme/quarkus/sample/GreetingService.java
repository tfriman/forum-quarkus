package org.acme.quarkus.sample;

import javax.enterprise.context.ApplicationScoped;
import java.util.Date;

@ApplicationScoped
public class GreetingService {

    public String greet() {
        return String.format("Hi there, date is %s", new Date());
    }

}
