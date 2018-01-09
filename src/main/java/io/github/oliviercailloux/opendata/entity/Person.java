package io.github.oliviercailloux.opendata.entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.google.common.base.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Ziad & sofian on 03/12/2017.
 */
public class Person {


    /**
     * id of a person ( length = 8 )
     * (not null)
     * we need to add pattern @pattern when
     * we have more information about the ID
     */
    @NotNull
    @Size(min = 8,max=8)
    String id;

	/**
	 * Returns this person's first name, or an empty string if unknown.
	 *
	 * @return not <code>null</code>.
	 */
    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = Strings.nullToEmpty(firstName);
	}

	/**
	 * Returns this person's last name, or an empty string if unknown.
	 *
	 * @return not <code>null</code>.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets this person's last name.
	 *
	 * @param lastName
	 *            if <code>null</code>, will be converted to an empty string.
	 */
	public void setLastName(String lastName) {
		this.lastName = Strings.nullToEmpty(lastName);
	}

	@NotNull
    private String firstName = "";

    @NotNull
    private String lastName = "";


    /**
     * Function type in directory
     */
    @Enumerated(EnumType.STRING)
    FunctionTypes function;

    /**
     * number
     */
    String number = "";

    /**
     * fax number
     */
    String fax = "";

    /**
     *  name of the office
     */
    String office = "";

    /**
     * email of a person
     * a person can have multiple email addresses
     * exemple :
     *
     * Courriel
     *    tristan.cazenave@lamsade.dauphine.fr
     * Courriel
     *   tristan.cazenave@dauphine.fr
     *
     *
     */
    List<String> emails = new ArrayList<String>();

    /**
     * groups of which the user is a part
     */
    List<String> structures = new ArrayList<String>();


    public Person() {
    }

	/**
	 * Returns this person's id.
	 *
	 */
    public String getId() {
        return id;
    }

	/**
	 * Sets this lecture's id.
	 *
	 * @param group
	 *            if <code>null</code>, will be converted to an empty string.
	 */
    public void setId(String id) {
        this.id = Strings.nullToEmpty(id);
    }

    public FunctionTypes getFunction() {
        return function;
    }

    public void setFunction(FunctionTypes function) {
        this.function = function;
    }

	/**
	 * Returns this person's number, or an empty string if unknown.
	 *
	 * @return not <code>null</code>.
	 */
    public String getNumber() {
        return number;
    }
    
    /**
	 * Sets this person's number.
	 *
	 * @param number
	 *            if <code>null</code>, will be converted to an empty string.
	 */
    public void setNumber(String number) {
        this.number = Strings.nullToEmpty(number);
    }

	/**
	 * Returns this person's fax, or an empty string if unknown.
	 *
	 * @return not <code>null</code>.
	 */
    public String getFax() {
        return fax;
    }

	/**
	 * Sets this person's fax.
	 *
	 * @param fax
	 *            if <code>null</code>, will be converted to an empty string.
	 */
    public void setFax(String fax) {
        this.fax = Strings.nullToEmpty(fax);
    }

	/**
	 * Returns this person's office, or an empty string if unknown.
	 *
	 * @return not <code>null</code>.
	 */
    public String getOffice() {
        return office;
    }
    /**
	 * Sets this person's office.
	 *
	 * @param office
	 *            if <code>null</code>, will be converted to an empty string.
	 */
    public void setOffice(String office) {
        this.office = Strings.nullToEmpty(office);
    }

	/**
	 * Returns the list of emails of this person (which may be empty). Writing to
	 * the list modifies the emails of this person.
	 *
	 * @return not <code>null</code>.
	 */
    public List<String> getEmails() {
        return emails;
    }

	/**
	 * Sets the list of emails of this person
	 *
	 * @param emails
	 * 				not <code>null</code>.
	 */
    public void setEmails(List<String> emails) {
        this.emails = Objects.requireNonNull(emails);
    }

	/**
	 * Add an email to the list of emails of this person
	 *
	 * @param email
	 * 				not <code>null</code>.
	 */
    public void addEmail(String email) {
        this.emails.add(Objects.requireNonNull(email));
    }

	/**
	 * Returns the list of structures of this person (which may be empty). Writing to
	 * the list modifies the structures of this person.
	 *
	 * @return not <code>null</code>.
	 */
    public List<String> getStructures() {
        return structures;
    }

	/**
	 * Sets the list of structures of this person
	 *
	 * @param structures 
	 * 				not <code>null</code>.
	 */
    public void setStructures(List<String> structures) {
        this.structures = Objects.requireNonNull(structures);
    }

	/**
	 * Add a structure to the list of structures of this person
	 *
	 * @param structure 
	 * 				not <code>null</code>.
	 */
    public void addStructure(String structure) {
        this.structures.add(Objects.requireNonNull(structure));
    }
}
