
package org.geekbang.thinking.in.spring.bean.factory;

import org.geekbang.thinking.in.spring.ioc.overview.domain.User;

/**
 * {@link User} 工厂类
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * 
 */
public interface UserFactory {

    default User createUser() {
        return User.createUser();
    }
}
