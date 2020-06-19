
package org.geekbang.thinking.in.spring.questions;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

/**
 * 教师类
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * 
 */
public class ClassRoom {

    private String name;

    @Autowired
    private Collection<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Student> getStudents() {
        return students;
    }

    public void setStudents(Collection<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
