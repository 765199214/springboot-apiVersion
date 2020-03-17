package cn.linkpower.config;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import cn.linkpower.api.CustomRequestMappingHandlerMapping;

@Configuration
public class ApiConfiguration implements WebMvcRegistrations {
	@Override
    public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
		//调用自定义的类
        return new CustomRequestMappingHandlerMapping();
    }
}
