package repository;

import domain.User;

import java.util.Optional;

/**
 * @author aLieb
 * @date 2023年12月20日 19:25
 */
public class UserRepository {

    public Optional<User> findUserByName(String name) {
        if (name.equals("aLieb")) {
            return Optional.of(new User("aLieb", "aLieb Jiang"));
        } else {
            return Optional.empty();
        }
    }
}
