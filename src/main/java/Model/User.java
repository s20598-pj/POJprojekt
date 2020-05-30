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

    public String getSecondname() {
        return lastname;
    }

    public void setSecondname(String secondname) {
        this.lastname = secondname;
    }

    public User(int id, String name, String secondname) {
        this.id = id;
        this.name = name;
        this.lastname = secondname;
    }
}