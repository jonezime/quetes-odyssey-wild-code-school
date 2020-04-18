package com.wildcodeschool.myProjectWithSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import static org.springframework.security.config.Customizer.withDefaults;

@EnableWebSecurity
public class MySecurityConfig {
    @Bean
    public UserDetailsService userDetailsService() throws Exception {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        // ensure the passwords are encoded properly
        User.UserBuilder users = User.builder();
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(users.username("user").password(encoder.encode("password")).roles("USER").build());
        manager.createUser(users.username("Steve").password(encoder.encode("motdepasse")).roles("USER", "CHAMPION").build());
        manager.createUser(users.username("Nick").password(encoder.encode("flerken")).roles("USER", "DIRECTOR").build());
        return manager;
    }

    @Configuration
    @Order(1)
    public static class ApiWebSecurityConfigurationAdapter extends WebSecurityConfigurerAdapter {
        protected void configure(HttpSecurity http) throws Exception {
            http
                    .antMatcher("/avengers/assemble")
                    .authorizeRequests(authorizeRequests ->
                            authorizeRequests
                                    .anyRequest().hasRole("CHAMPION")
                                    .and())
                    .formLogin(withDefaults());
        }
    }

    @Configuration
    @Order(2)
    public static class ApiWebSecurityConfigurationAdapter2 extends WebSecurityConfigurerAdapter {
        protected void configure(HttpSecurity http) throws Exception {
            http
                    .antMatcher("/secret-bases")
                    .authorizeRequests(authorizeRequests ->
                            authorizeRequests
                                    .anyRequest().hasRole("DIRECTOR")
                                    .and())
                    .formLogin(withDefaults());
        }
    }

    @Configuration
    public static class FormLoginWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                    .authorizeRequests(authorizeRequests ->
                            authorizeRequests
                                    .anyRequest().authenticated()
                    )

                    .formLogin();
        }
    }
}
