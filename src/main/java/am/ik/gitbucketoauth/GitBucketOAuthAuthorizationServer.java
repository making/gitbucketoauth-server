package am.ik.gitbucketoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import am.ik.gitbucketoauth.account.Account;
import am.ik.gitbucketoauth.userdetails.GitBucketUserDetails;

@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
@RestController
public class GitBucketOAuthAuthorizationServer {

    @RequestMapping("/me")
    Account me(@AuthenticationPrincipal GitBucketUserDetails details) {
        return details.getAccount();
    }

    public static void main(String[] args) {
        SpringApplication.run(GitBucketOAuthAuthorizationServer.class, args);
    }
}
