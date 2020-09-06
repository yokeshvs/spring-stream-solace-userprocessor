
package com.yo.prototype.userprocessor;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {

	public Result () {
	}
	public Result (
		Boolean isValid, 
		String email) {
		this.isValid = isValid;
		this.email = email;
	}


	private Boolean isValid;
	private String email;

	public Boolean getIsValid() {
		return isValid;
	}

	public Result setIsValid(Boolean isValid) {
		this.isValid = isValid;
		return this;
	}


	public String getEmail() {
		return email;
	}

	public Result setEmail(String email) {
		this.email = email;
		return this;
	}


	public String toString() {
		return "Result ["
		+ " isValid: " + isValid
		+ " email: " + email
		+ " ]";
	}
}

