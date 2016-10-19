package com.sda.messagesender;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class UserReader {

    private final static Map<User.Contact, BiFunction<String, String, User>> READERS = new HashMap<User.Contact, BiFunction<String, String, User>>();

    static {
    	READERS.put(User.Contact.EMAIL, 
    			(name, contactAddress) -> { 
		    		EmailUser emailUser = new EmailUser();
		    		emailUser.setName(name);
		    		emailUser.setEmailAddress(contactAddress);
		    		return emailUser;
    	});
    	
    	READERS.put(User.Contact.MAIL, (name, physicallAddress) -> {
    		MailUser mailUser = new MailUser();
    		mailUser.setName(name);
    		mailUser.setPhysicallAddress(physicallAddress);
    		return mailUser;
    	});
    	
    	READERS.put(User.Contact.SMS, (name, mobileNumber) -> {
    		SMSUser smsUser = new SMSUser();
    		smsUser.setName(name);
    		smsUser.setMobileNumber(mobileNumber);
    		return smsUser;
    	});
    }

    public User read(User.Contact contact, String name, String contactAddress) {
    	// tworzymy obiekt typu bifunction 'createUserFunction', która przyjmuje rodzaj kontaktu - mail, email, sms
    	BiFunction<String, String, User> createUserFunction = READERS.get(contact);
    	// readers.get jest kluczem, po czym zwracasz wartość a wartością jest bifunkcja
    	User createdUser = createUserFunction.apply(name,  contactAddress);
        return createdUser;
    }

}
