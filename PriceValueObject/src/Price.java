

import java.util.Currency;
import java.util.Objects;

public class Price {
	private final Currency currency;
	private final long amount;
	
	public Price() {
		this(0);
	}

	public Price(long amount) {
		this(amount, Currency.getInstance("CHF"));
		checkIfNegative(amount);
		}
		

	public Price(long amount, Currency currency) {
		checkIfNegative(amount);
		this.amount = amount;
		this.currency = currency;
	}
	
	private void checkIfNegative(long amount) {
		if ( amount < 0) {
			throw new IllegalArgumentException("Amount cannot be < 0");
		}
	}

	public Price add(Price other) {
		// currency != other.currency) { funktioniert nicht. So wird nur der Preis verglichen, es koennen aber unterschiedliche Objekte sein
		if (!currency.equals(other.currency)) {
			throw new IllegalArgumentException("Currency must be equal");
		}
		return new Price(amount + other.amount, currency);
	}

	public Price multiply(double factor) {
		if (factor < 0) {
			throw new IllegalArgumentException("factor cannot be negative");
		}
		return new Price(Math.round(factor * amount), currency);
	}

	@Override
	public String toString() {
		int fractionDigits = currency.getDefaultFractionDigits();
		var amountString = Long.toString(amount);
		int nofDigits = amountString.length();
		if (nofDigits > fractionDigits) {// es hat komazahlen
			
		}
		int amountStringLenght = amountString.length();
		var amountDecimalString = amountString.substring(amountStringLenght - fractionDigits);
		var amountKomplete = amountString.substring(0,fractionDigits);
		
		var amString = new StringBuilder();
		amString.append(amountKomplete);
		amString.append(".");
		amString.append(amountDecimalString);
		
		System.out.println("amountString " + amountString);
		System.out.println("amountStringLength " + amountStringLenght);
		System.out.println("amountDecimalString " + amountDecimalString );
		System.out.println("amuntKomplete " + amountKomplete);
		System.out.println("currency " + currency.toString());
		
		return amString.toString();
//		return this.toString();
	}


	
	

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		
		if (other == null) {
			return false;
		}
		
		if (getClass() != other.getClass()) {
			return false;
		}
		
		Price priceToCompare = (Price) other; //(Price) other ist ein Cast von other auf Price
		//return amount == priceToCompare.amount && Objects.equals(currency, priceToCompare.currency);
		
		return Objects.equals(priceToCompare.amount, amount) && Objects.equals(priceToCompare.currency,currency);
	}


	@Override
	public int hashCode() {
		return Objects.hash(amount, currency);
	}

}

