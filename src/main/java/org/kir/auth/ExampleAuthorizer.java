package org.kir.auth;

import io.dropwizard.auth.Authorizer;
import org.kir.pojos.User;

/**
 * Created by kiran on 5/9/16.
 */
public class ExampleAuthorizer implements Authorizer<User> {

    public boolean authorize(User user, String role) {
        return user.getName().equals("kiran") && role.equals("ADMIN");
    }
}