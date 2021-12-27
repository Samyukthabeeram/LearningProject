package com.java.beginner3;
import java.util.Date;
import java.util.Objects;

public class Student {

	private String firstName;
	private String lastName;
	private String middleName;
	private Date dateOfBirth;
	private Date dateOfJoining;
	private Contact personalContact;
	private Contact gaurdianContact;
	private String id;
	private String branch;
	private int semester;
	private Address permanentAddress;
	private Address contactAddress;
	private boolean isContactAndPermanentSame;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public Address getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(Address contactAddress) {
		this.contactAddress = contactAddress;
	}

	public boolean equals(Object o) {

		Student s = (Student) o;

		return this.firstName.equals(s.firstName) && this.lastName.equals(s.lastName);
	}

	public int hashCode() {

		return Objects.hash(firstName, lastName);
	}

	public boolean isContactAndPermanentSame() {
		return isContactAndPermanentSame;
	}

	public void setContactAndPermanentSame(boolean isContactAndPermanentSame) {
		this.isContactAndPermanentSame = isContactAndPermanentSame;
	}

	public Contact getPersonalContact() {
		return personalContact;
	}

	public void setPersonalContact(Contact personalContact) {
		this.personalContact = personalContact;
	}

	public Contact getGaurdianContact() {
		return gaurdianContact;
	}

	public void setGaurdianContact(Contact gaurdianContact) {
		this.gaurdianContact = gaurdianContact;
	}

	
	}

