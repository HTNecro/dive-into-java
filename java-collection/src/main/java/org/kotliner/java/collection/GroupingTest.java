package org.kotliner.java.collection;

import lombok.Getter;
import lombok.Setter;
import lombok.val;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
public class GroupingTest {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("1", 2, 1),
                new User("2", 2, 2),
                new User("3", 1, 1),
                new User("4", 1, 2),
                new User("5", 1, 1),
                new User("6", 2, 2),
                new User("7", 2, 1),
                new User("8", 1, 2),
                new User("9", 1, 1)
        );

        val grouping = users.stream().collect(Collectors.groupingBy(it -> it.type + "" + it.status));
        System.out.println(grouping);

        val mapping = users.stream().collect(Collectors.toMap(User::getType, User::getStatus, (a, b) -> a));
        System.out.println(mapping);

    }

    @Getter
    @Setter
    public static class User {
        public User(String name, int type, int status) {
            this.name = name;
            this.type = type;
            this.status = status;
        }

        private String name;
        private int type;
        private int status;

    }
}
