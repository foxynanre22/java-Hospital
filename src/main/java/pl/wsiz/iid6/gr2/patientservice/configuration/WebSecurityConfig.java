package pl.wsiz.iid6.gr2.patientservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        String[] staticResources  =  {
                "/css/**",
                "/images/**",
                "/fonts/**",
                "/scripts/**",
        };
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/", "/resources/**").permitAll()
                .antMatchers(staticResources).permitAll()
                .antMatchers("/leki/**", "/api/**").hasRole("USER")
                .antMatchers("/h2").hasRole("ADMIN")
                .anyRequest().authenticated() .and() .formLogin()
                .loginPage("/login") .permitAll().defaultSuccessUrl("/leki/all", true)
                .and() .logout()
                .logoutUrl("/logout");
    }
    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("AdamSokol")
                .password("haslo123")
                .roles("USER") .build();
        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("admin")
                .roles("ADMIN") .build();

        return new InMemoryUserDetailsManager(user,admin);
    }
}
