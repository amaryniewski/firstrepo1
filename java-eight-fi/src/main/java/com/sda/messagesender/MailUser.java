package com.sda.messagesender;


public class MailUser extends User {

    private String physicallAddress;

    public String getPhysicallAddress() {
        return this.physicallAddress;
    }

    public void setPhysicallAddress(String physicallAddress) {
        this.physicallAddress = physicallAddress;
    }

    @Override
    public Contact getPreferableContact() {
        return User.Contact.MAIL;
    }

	@Override
	public String toString() {
		return "MailUser [physicallAddress=" + physicallAddress + ", getName()=" + getName() + "]";
	}
    

}
