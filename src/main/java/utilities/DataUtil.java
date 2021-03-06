package utilities;

import com.github.javafaker.Faker;

public class DataUtil {

	private Faker faker;
	public DataUtil() {
		faker = new Faker();
	}
	
	public static DataUtil getData() {
	
		return new DataUtil();
	}
	
	public String getFirstName() {
		return faker.name().firstName();
	}
	
	public String getEditFirstName() {
		return faker.name().firstName();
	}
	
	public String getLastName() {
		return faker.name().lastName();
	}
	
	public String getEditLastName() {
		return faker.name().lastName();
	}
	
	public String getFullName() {
		return getFirstName() + " " + getLastName();
	}
	
	public String getEmailAddress() {
		return faker.internet().emailAddress();
	}
	
	public String getUserName() {
		return faker.name().username();
	}
	
	public String getPassword() {
		return faker.internet().password();
	}
	
	public String getPhoneNumber() {
		return faker.phoneNumber().cellPhone();
	}
	
	public String getCardNumber() {
		return faker.finance().creditCard();
	}
	
	public int getRandom6DegitNumber() {
		return faker.number().numberBetween(100000, 999999);
	}
	
	
	
}
