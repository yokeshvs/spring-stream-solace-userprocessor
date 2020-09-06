
package com.yo.prototype.userprocessor;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

	public User () {
	}
	public User (
		Boolean isValid, 
		String name, 
		Integer id, 
		String email) {
		this.isValid = isValid;
		this.name = name;
		this.id = id;
		this.email = email;
	}


	private Boolean isValid;
	private String name;
	private Integer id;
	private String email;

	public Boolean getIsValid() {
		return isValid;
	}

	public User setIsValid(Boolean isValid) {
		this.isValid = isValid;
		return this;
	}


	public String getName() {
		return name;
	}

	public User setName(String name) {
		this.name = name;
		return this;
	}


	public Integer getId() {
		return id;
	}

	public User setId(Integer id) {
		this.id = id;
		return this;
	}


	public String getEmail() {
		return email;
	}

	public User setEmail(String email) {
		this.email = email;
		return this;
	}


	public String toString() {
		return "User ["
		+ " isValid: " + isValid
		+ " name: " + name
		+ " id: " + id
		+ " email: " + email
		+ " ]";
	}
}

