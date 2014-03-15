package com.rezwan.core;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

public class Money {
	
	public Money(BigDecimal value) {
		this.value=value; 
	}
	
	
	private static final Locale DEFAULT_LOCALE = new Locale("en", "NZ");
	private Currency currency = Currency.getInstance(DEFAULT_LOCALE);
	private BigDecimal value = BigDecimal.ZERO;

	// CONSTRUCTOR(S), GETTERS AND OTHER METHODS OMITTED

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
 	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return value.hashCode()+currency.hashCode(); 
	} 

	@Override
	public boolean equals(Object obj) {
		// EQUALS RECIPE STEP 1
		if (obj == this) {
			return true;
		}
		// EQUALS RECIPE STEP 2, INSTANCEOF TAKS CARE OF TRIVIAL CASE WHERE OBJ
		// IS NULL, IN WHICH CASE IT WILL RETURN FALSE
		if (!(obj instanceof Money)) {
			return false;
		}
		// EQUALS RECIPE STEP 3, SAFE CAST
		Money money = (Money) obj;
		// EQUALS RECIPE SETP 4, CHECK THAT ALL SIGNIFICANT FIELDS MATCH
		if (value.equals(money.getValue())
				&& currency.equals(money.getCurrency())) {
			return true;
		}
		return false;
	}
}