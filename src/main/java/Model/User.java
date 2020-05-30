package Model;

public class User {

    public int id;
    public String name;
    public String lastname;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public User(int id, String name, String secondname) {
        this.id = id;
        this.name = name;
        this.lastname = secondname;
    }
}