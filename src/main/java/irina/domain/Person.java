package irina.domain;

import com.fasterxml.jackson.annotation.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@JsonIgnoreProperties(value = { "card" })
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Email
    @Column(unique = true, name = "email")
    private String email;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "person_id")
//    private List<Animal> animals;
    @Embedded
    @JoinColumn(name = "person_id")
    @JsonBackReference
    private List<Animal>  animals;
//
//    //    @RestResource(path = "breeds", rel="breeds")


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "person_id")
//    @JsonManagedReference
    @JsonBackReference("person-card")
    private List<Card> card;
}
