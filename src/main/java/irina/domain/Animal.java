package irina.domain;

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

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(max = 30)
    @Column(name = "alias")
    private String alias;

    @Range(min = 1, max = 20)
    @Column(name = "age")
    private int age;

    @Column(name = "gender")
    private Gender gender;

    @NotNull
    @Size(max = 50)
    @Column(name = "color")
    private String color;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "breed_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Breed breed;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "person_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Person person;
}
