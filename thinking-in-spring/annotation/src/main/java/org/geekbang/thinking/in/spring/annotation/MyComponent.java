
package org.geekbang.thinking.in.spring.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 自定义 Component "派生性"注解
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * 
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component // 元注解，实现 @Component "派生性"
public @interface MyComponent {
}
