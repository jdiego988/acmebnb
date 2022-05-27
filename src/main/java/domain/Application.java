
package domain;

// import java.sql.Date;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Application extends DomainEntity {

	/*
	 * enum ApplicationState {
	 * WAITING, ACCEPTED, DENIED
	 * }
	 */

	public Application() {
		super();
	}


	private Date		arrival;
	private Date		departure;
	private boolean		smoker;
	private CreditCard	creditCard;
	//private ApplicationState	applicationState;
	private String		applicationState;


	public Date getArrival() {
		return this.arrival;
	}

	public void setArrival(final Date arrival) {
		this.arrival = arrival;
	}

	public Date getDeparture() {
		return this.departure;
	}

	public void setDeparture(final Date departure) {
		this.departure = departure;
	}

	public boolean getSmoker() {
		return this.smoker;
	}

	public void setSmoker(final boolean smoker) {
		this.smoker = smoker;
	}

	public CreditCard getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(final CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	/*
	 * @Enumerated(EnumType.STRING)
	 * public ApplicationState getApplicationState() {
	 * return this.applicationState;
	 * }
	 * 
	 * public void setApplicationState(final ApplicationState applicationState) {
	 * this.applicationState = applicationState;
	 * }
	 */

	public String getApplicationState() {
		return this.applicationState;
	}

	public void setApplicationState(final String applicationState) {
		this.applicationState = applicationState;
	}


	public Tenant	tenant;
	public Property	property;


	@ManyToOne
	public Tenant getTenant() {
		return this.tenant;
	}

	public void setTenant(final Tenant tenant) {
		this.tenant = tenant;
	}

	@ManyToOne
	public Property getProperty() {
		return this.property;
	}

	public void setProperty(final Property property) {
		this.property = property;
	}
}
