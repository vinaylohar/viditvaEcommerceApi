package com.viditva.ecommerce.entity;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="userdetails")
public class UserDetails  implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private int userid;
    @Column(name="username")
    private String username;
    @Column(name="userpassword")
    private String password;
    @Column(name="firstname")
    private String firstname;
    @Column(name="lastname")
    private String lastname;
    @Column(name="phonenumber")
    private String phonenumber;
    @Column(name="emailaddress")
    private String emailaddress;


    @OneToMany(mappedBy="userdetails")
    private Set<Reviews> reviews;

    public Set<Reviews> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Reviews> reviews) {
        this.reviews = reviews;
    }

//    private Set<UserType> userTypes = new HashSet<UserType>(0);

   /* @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "usertypes", joinColumns = { @JoinColumn(name = "userid") }, inverseJoinColumns = { @JoinColumn(name = "userdetails_id") })
    public Set<UserType> getUserTypes() {
        return userTypes;
    }
*/
   /* public void setUserTypes(Set<UserType> userTypes) {
        this.userTypes = userTypes;
    }*/

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
}
