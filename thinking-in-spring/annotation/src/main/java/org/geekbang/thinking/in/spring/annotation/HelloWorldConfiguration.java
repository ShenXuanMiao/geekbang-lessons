
package org.geekbang.thinking.in.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * HelloWorld Configuration Class
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * 
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() {
        return "Hello,World";
    }
}
