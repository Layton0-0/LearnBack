package my.com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import my.com.common.intercepter.AuthInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer{

	@Override
	public void	addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(authInterceptor());
	}
	
	@Bean
    public AuthInterceptor authInterceptor() {
        return new AuthInterceptor();
    }
	
	@Override
	public void	addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/file/**")
				.addResourceLocations("file:///C:/upload/");
	}
		
	
}
