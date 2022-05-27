
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@Access(AccessType.PROPERTY)
public class Lessor extends Actor {

	// Constructors -----------------------------------------------------------

	public Lessor() {
		super();
	}


	// Attributes -------------------------------------------------------------

	private CreditCard creditCard;


	public CreditCard getcreditCard() {
		return this.creditCard;
	}

	public void setcreditCard(final CreditCard creditCard) {
		this.creditCard = creditCard;
	}


	// Relationships ----------------------------------------------------------

	private Collection<Property> property;


	@OneToMany
	public Collection<Property> getProperty() {
		return this.property;
	}

	public void setProperty(final Collection<Property> property) {
		this.property = property;
	}
}
