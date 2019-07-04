package guru.springframework.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="vets")
public class Vet extends Person {

}
