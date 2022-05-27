
package domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Has extends DomainEntity {

	public Has() {
		super();
	}


	private int value;


	public int getValue() {
		return this.value;
	}

	public void setValue(final int value) {
		this.value = value;
	}


	private PropertyAttribute	propertyAttribute;
	private Property			property;


	@ManyToOne
	public PropertyAttribute getPropertyAttribute() {
		return this.propertyAttribute;
	}

	public void setPropertyAttribute(final PropertyAttribute propertyAttribute) {
		this.propertyAttribute = propertyAttribute;
	}

	@ManyToOne
	public Property getProperty() {
		return this.property;
	}

	public void setProperty(final Property property) {
		this.property = property;
	}

}
