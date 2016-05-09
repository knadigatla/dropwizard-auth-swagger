package org.kir.auth;

import com.google.common.base.Optional;
import io.dropwizard.auth.AuthenticationException;
import io.dropwizard.auth.Authenticator;
import io.dropwizard.auth.basic.BasicCredentials;
import org.kir.pojos.User;

/**
 * Created by kiran on 5/9/16.
 */
public class ExampleAuthenticator implements Authenticator<BasicCredentials, User> {

    public Optional<User> authenticate(BasicCredentials credentials) throws AuthenticationException {
        if ("secret".equals(credentials.getPassword()) && "kiran".equalsIgnoreCase(credentials.getUsername())) {
            return Optional.of(new User(credentials.getUsername()));
        }
        return Optional.absent();
    }
}