
package domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Property extends DomainEntity {

	public Property() {
		super();
	}


	private String	name;
	private float	fee;
	private String	description;
	private String	address;
	private String	country;
	private String	province;
	private String	state;
	private String	city;
	private String	capacity;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public float getFee() {
		return this.fee;
	}

	public void setFee(final float fee) {
		this.fee = fee;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@NotBlank
	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	@NotBlank
	public String getCountry() {
		return this.country;
	}

	public void setCountry(final String country) {
		this.country = country;
	}

	@NotBlank
	public String getProvince() {
		return this.province;
	}

	public void setProvince(final String province) {
		this.province = province;
	}

	@NotBlank
	public String getState() {
		return this.state;
	}

	public void setState(final String state) {
		this.state = state;
	}

	@NotBlank
	public String getCity() {
		return this.city;
	}

	public void setCity(final String city) {
		this.city = city;
	}

	@NotBlank
	public String getCapacity() {
		return this.capacity;
	}

	public void setCapacity(final String capacity) {
		this.capacity = capacity;
	}


	//public PropertyAttribute	propertyAttribute;
	public Lessor					lessor;
	private Collection<Application>	application;
	public Collection<Has>			has;


	/*
	 * @ManyToMany
	 * public PropertyAttribute getPropertyAttribute() {
	 * return this.propertyAttribute;
	 * }
	 *
	 * public void setProperty(final PropertyAttribute propertyAttribute) {
	 * this.propertyAttribute = propertyAttribute;
	 * }
	 */

	@OneToMany
	public Collection<Has> getHas() {
		return this.has;
	}

	public void setHas(final Collection<Has> has) {
		this.has = has;
	}

	@ManyToOne
	public Lessor getLessor() {
		return this.lessor;
	}

	public void setLessor(final Lessor lessor) {
		this.lessor = lessor;
	}

	@OneToMany
	public Collection<Application> getApplication() {
		return this.application;
	}

	public void setApplication(final Collection<Application> application) {
		this.application = application;
	}
}
