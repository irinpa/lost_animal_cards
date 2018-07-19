package irina.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity

public class Breed {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;


    @RestResource(path = "species", rel="species")
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "species_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JsonManagedReference
    private Species species;
}
