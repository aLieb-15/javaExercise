package test;

import domain.User;
import repository.UserRepository;

import java.util.Optional;

/**
 * @author aLieb
 * @date 2023年12月20日 20:18
 */
public class OptionalTest {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        Optional<User> userOptional = userRepository.findUserByName("aLi11eb");
//        System.out.println("Hello world!");
//        UserRepository userRepository = new UserRepository();
//        User user = userRepository.findUserByName("alieb");
//        System.out.println(user.getFullName());

//        String value = "nullString";
//        Optional<String> optionalBox = Optional.ofNullable(value);
//        System.out.println(optionalBox.isPresent());
//        String outValue = optionalBox.get();
//        System.out.println(outValue);

//        User user = userOptional.orElse(new User("Neo", "Thomas Anderson"));
//        System.out.println(user.getFullName());
//        User user2 = userOptional.orElseGet(() -> new User("Neo", "Thomas Anderson"));
//        // orElse()无论如何都会执行新建默认值的方法
//        // orElseGet()仅在Optional对象为空时执行，因此当获取默认值代价比较高的时候应该使用后者
//        userOptional.orElseThrow(() -> new RuntimeException("User not found!"));
//        System.out.println(user2.getFullName());

//        userOptional.ifPresent(userop -> System.out.println(userop.getFullName()));
//
//        Optional<User> user2Optional = userOptional.filter(user -> user.getFullName().equals("aLieb Jiang"));
//        System.out.println(user2Optional.isPresent());

        Optional<String> fullName = userOptional.map(User::getFullName);
        System.out.println(fullName);
    }
}
