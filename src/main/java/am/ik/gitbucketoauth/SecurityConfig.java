package am.ik.gitbucketoauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	UserDetailsService userDetailsService;

	@Bean
	PasswordEncoder passwordEncoder() {
		ShaPasswordEncoder encoder = new ShaPasswordEncoder(1);
		return new PasswordEncoder() {
			@Override
			public String encode(CharSequence rawPassword) {
				return encoder.encodePassword(
						rawPassword != null ? rawPassword.toString() : null, null);
			}

			@Override
			public boolean matches(CharSequence rawPassword, String encodedPassword) {
				return encoder.isPasswordValid(encodedPassword,
						rawPassword != null ? rawPassword.toString() : null, null);
			}
		};
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
}
