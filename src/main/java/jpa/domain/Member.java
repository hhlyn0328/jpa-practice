package jpa.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Date createdDate;

    private Date modifiedDate;

    private Integer age;

    private String email;

    private String password;

}
