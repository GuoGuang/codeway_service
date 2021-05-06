package com.madao.article;

import com.madao.utils.DateUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

/**
 * SpringBoot主配置类只会扫描自己所在的包及其子包下面,如果不加此扫描madao-common里的公用包则扫描不到
 *
 * @ComponentScan(basePackages = {"com.madao"})
 **/
@SpringBootApplication
@EntityScan("com.madao.model.pojo")
@EnableEurekaClient
@EnableJpaRepositories("com.madao.article.dao")
@EnableFeignClients("com.madao.api")
@ComponentScan(basePackages = {"com.madao"})
public class ArticleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticleApplication.class, args);
    }

    @PostConstruct
    void started() {
        DateUtil.setDefaultZone();
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }
}
