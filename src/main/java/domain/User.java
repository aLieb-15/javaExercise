package domain;

/**
 * @author aLieb
 * @date 2023年12月20日 19:25
 */
public class User {
    private String name;
    private String fullName;

    public User(String name, String fullName) {
        this.name = name;
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }
}
