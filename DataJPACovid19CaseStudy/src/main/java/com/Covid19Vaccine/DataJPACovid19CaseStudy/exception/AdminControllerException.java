package com.Covid19Vaccine.DataJPACovid19CaseStudy.exception;

public class AdminControllerException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errormessage;

	public String getErrormessage() {
		return errormessage;
	}

	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}

	public AdminControllerException(String errormessage) {
		super();
		this.errormessage = errormessage;
	}

	@Override
	public String toString() {
		return "ControllerException [errormessage=" + errormessage + "]";
	}

	public AdminControllerException() {

	}

}
