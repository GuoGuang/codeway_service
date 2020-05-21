package com.codeway.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.util.pattern.PathPatternParser;

@Configuration
public class CorsConfig {

	@Bean
	public CorsWebFilter corsFilter(){
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource(new PathPatternParser());
		source.registerCorsConfiguration("/**", buildConfig());
		return new CorsWebFilter(source);
	}

	private CorsConfiguration buildConfig(){
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		//在生产环境上最好指定域名，以免产生跨域安全问题
		corsConfiguration.addAllowedOrigin("http://localhost:9527");
		corsConfiguration.addAllowedOrigin("http://121.36.158.84:9527");
		// 前台博客
		corsConfiguration.addAllowedOrigin("http://localhost:3000");
		corsConfiguration.addAllowedOrigin("http://202.182.114.223:3000");
		corsConfiguration.addAllowedOrigin("http://codeway.me");
		corsConfiguration.addAllowedOrigin("https://codeway.me");
		corsConfiguration.addAllowedOrigin("http://www.codeway.me");
		corsConfiguration.addAllowedOrigin("https://www.codeway.me");
		corsConfiguration.addAllowedHeader("*");
		corsConfiguration.addAllowedMethod("*");
		return corsConfiguration;
	}
}
