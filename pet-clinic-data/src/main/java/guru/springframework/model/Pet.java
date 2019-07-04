package guru.springframework.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="pets")
public class Pet extends BaseEntity{
	@ManyToOne
	@JoinColumn(name="type_id")
	private PetType type;
	@ManyToOne
	@JoinColumn(name="owner_id")
	private Owner owner;
	private LocalDate birthDate;
	public PetType getType() {
		return type;
	}
	public void setType(PetType type) {
		this.type = type;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

}
