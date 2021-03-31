package jpa.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Line {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Date createdDate;

    private Date modifiedDate;

    @Column(unique = true)
    private String name;

    private String lineColor;

}
