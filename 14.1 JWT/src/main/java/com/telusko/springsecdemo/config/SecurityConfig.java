package com.telusko.springsecdemo.config;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private JwtFilter jwtFilter;
	
	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
		return provider;
	}
	

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.csrf(customizer -> customizer.disable())
				.authorizeHttpRequests(request -> request
						.requestMatchers("register", "login")
						.permitAll()
						.anyRequest().authenticated())
				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

		return http.build();
	}

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
		return config.getAuthenticationManager();
	}
	
	
	
	
	/*
	 * @Bean public UserDetailsService userDetailsService() {
	 * 
	 * UserDetails user=User .withDefaultPasswordEncoder() .username("navin")
	 * .password("n@123") .roles("USER") .build();
	 * 
	 * UserDetails admin=User .withDefaultPasswordEncoder() .username("admin")
	 * .password("admin@789") .roles("ADMIN") .build();
	 * 
	 * return new InMemoryUserDetailsManager(user,admin); }
	 */
	
	
}
