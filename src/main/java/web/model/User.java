package web.model;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "profession")
    private String profession;

    public User(){
    }

    public User(int id, String name, String surname, String profession) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String proffesion) {
        this.profession = proffesion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id =" + id +
                ", name ='" + name + '\'' +
                ", surname ='" + surname + '\'' +
                ", profession ='" + profession + '\'' +
                '}';
    }
}
