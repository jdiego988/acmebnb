
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@Access(AccessType.PROPERTY)
public class Tenant extends Actor {

	// Constructors -----------------------------------------------------------

	public Tenant() {
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

	private Collection<Application> application;


	//@ElementCollection
	@OneToMany
	public Collection<Application> getApplication() {
		return this.application;
	}

	public void setApplication(final Collection<Application> application) {
		this.application = application;
	}

}
