import java.util.HashSet;
import java.util.Objects;

public class User {

    private String name;
    private HashSet<User> users;

    public User(String name, HashSet<User> users) {
        this.name = name;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<User> getUsers() {
        return users;
    }

    public void setUsers(HashSet<User> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(users, user.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, users);
    }
}
