
package org.geekbang.thinking.in.spring.annotation;

import java.lang.annotation.*;

/**
 * {@link MyComponent} "派生"注解
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * 
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@MyComponent
public @interface MyComponent2 {
}
