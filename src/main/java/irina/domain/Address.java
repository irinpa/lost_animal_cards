package irina.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
public class Address {
    private Long latitude;
    private Long longitude;
    private String address;
}
