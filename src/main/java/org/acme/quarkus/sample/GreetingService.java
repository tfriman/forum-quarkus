package org.acme.quarkus.sample;

import javax.enterprise.context.ApplicationScoped;
import java.util.Date;

@ApplicationScoped
public class GreetingService {

    public String greet() {
        return "Hi there, date is " + new Date();
    }

}
