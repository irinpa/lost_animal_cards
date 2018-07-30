package irina.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.persistence.Embeddable;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Embeddable
//@Entity
public class Animal {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;

    @NotNull
    @Size(max = 20)
    @Column(name = "alias")
    private String alias;

    @Range(min = 1, max = 20)
    @Column(name = "age")
    private int age;

//    @Enumerated(EnumType.ORDINAL)
    @NotNull
    @Size(max = 15)
    @Column(name = "gender")
    private String gender;

    @NotNull
    @Size(max = 30)
    @Column(name = "color")
    private String color;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "breed_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JsonBackReference
//    @JsonManagedReference(value = "breed-managed-ref")
    private Breed breed;

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "person_id", nullable = false)
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    private Person person;
}
