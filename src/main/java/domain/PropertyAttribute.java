
package domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class PropertyAttribute extends DomainEntity {

	public PropertyAttribute() {
		super();
	}


	private String	name;
	private boolean	addedSuccessfully;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public boolean getAddedSuccesfully() {
		return this.addedSuccessfully;
	}

	public void setAddedSuccesfully(final boolean addedSuccesfully) {
		this.addedSuccessfully = addedSuccesfully;
	}


	/*
	 * private Property property;
	 *
	 *
	 * @ManyToMany
	 * public Property getProperty() {
	 * return this.property;
	 * }
	 *
	 * public void setProperty(final Property property) {
	 * this.property = property;
	 * }
	 */

	private Collection<Has> has;


	@OneToMany
	public Collection<Has> getHas() {
		return this.has;
	}

	public void setHas(final Collection<Has> has) {
		this.has = has;
	}
}
