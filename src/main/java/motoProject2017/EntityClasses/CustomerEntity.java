package motoProject2017.EntityClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Ksenia on 13.01.2017.
 */

@Entity
@Table(name = "tcustomer")
public class CustomerEntity implements Serializable {

    @NotNull
    @Column(name = "user_id")
    private Long IdCustomer;

    public Long getIdCustomer() {
        return IdCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.IdCustomer = idCustomer;
    }

    @NotNull
    @Column(name = "name")
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    @NotNull
    @Column(name = "password")
    private String Password;

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    @NotNull
    @Column
    private String Email;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

//    @NotNull
//    @Column(name = "role")
//    private Long Role;
//
//    public Long getRole() {
//        return Role;
//    }
//
//    public void setRole(Long role) {
//        Role = role;
//    }

    public CustomerEntity() {
    }

    public CustomerEntity(Long idCustomer, String name, String password, String email) {
        this.IdCustomer = idCustomer;
        this.Name = name;
        this.Password = password;
        this.Email = email;
    }
}
