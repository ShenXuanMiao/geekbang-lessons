
package org.geekbang.thinking.in.spring.ioc.overview.domain;

import org.geekbang.thinking.in.spring.ioc.overview.annotation.Super;

/**
 * 超级用户
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 *
 */
@Super
public class SuperUser extends User {

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "子类SuperUser{" +
                "address='" + address + '\'' +
                "} " ;
    }
}
