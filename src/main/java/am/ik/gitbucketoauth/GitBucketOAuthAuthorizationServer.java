package am.ik.gitbucketoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAuthorizationServer
@RestController
public class GitBucketOAuthAuthorizationServer {

	@RequestMapping("/")
	String hello() {
		return "Hello OAuth2!";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitBucketOAuthAuthorizationServer.class, args);
	}
}
