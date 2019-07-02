package guru.springframework.model;

public class Owner extends Person {

	@Override
	public String toString() {
		return "Owner [getFirstName()=" + getFirstName() + ","
				+ " getLastName()=" + getLastName() + ", getId()=" + getId()
								+ "]";
	}

}
