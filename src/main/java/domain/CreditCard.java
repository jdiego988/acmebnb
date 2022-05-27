
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

@Embeddable
@Access(AccessType.PROPERTY)
public class CreditCard {

	private String	number;
	private int		expirationYear;
	private int		expirationMonth;
	private String	company;
	private String	holder;
	private String	cvv;


	public CreditCard() {
		super();
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(final String number) {
		this.number = number;
	}

	public int getExpirationYear() {
		return this.expirationYear;
	}

	public void setExpirationYear(final int expirationYear) {
		this.expirationYear = expirationYear;
	}
	@Range(min = 1, max = 12)
	public int getExpirationMonth() {
		return this.expirationMonth;
	}

	public void setExpirationMonth(final int expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	@NotBlank
	public String getCompany() {
		return this.company;
	}

	public void setCompany(final String company) {
		this.company = company;
	}

	@NotBlank
	public String getHolder() {
		return this.holder;
	}

	public void setHolder(final String holder) {
		this.holder = holder;
	}
	@Pattern(regexp = "^[0-9] {3,4}$")
	public String getCvv() {
		return this.cvv;
	}

	public void setCvv(final String cvv) {
		this.cvv = cvv;
	}
}
