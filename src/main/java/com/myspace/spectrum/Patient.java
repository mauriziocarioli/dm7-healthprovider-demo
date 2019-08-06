package com.myspace.spectrum;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Patient implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Integer age;

	private java.lang.Boolean isPregnant;

	private java.lang.Boolean isAdmitted;

	private com.myspace.spectrum.Appointment appointment;

	private java.lang.Boolean hasDisability;

	public Patient() {
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public java.lang.Boolean getIsPregnant() {
		return this.isPregnant;
	}

	public void setIsPregnant(java.lang.Boolean isPregnant) {
		this.isPregnant = isPregnant;
	}

	public java.lang.Boolean getIsAdmitted() {
		return this.isAdmitted;
	}

	public void setIsAdmitted(java.lang.Boolean isAdmitted) {
		this.isAdmitted = isAdmitted;
	}

	public com.myspace.spectrum.Appointment getAppointment() {
		return this.appointment;
	}

	public void setAppointment(com.myspace.spectrum.Appointment appointment) {
		this.appointment = appointment;
	}

	public java.lang.Boolean getHasDisability() {
		return this.hasDisability;
	}

	public void setHasDisability(java.lang.Boolean hasDisability) {
		this.hasDisability = hasDisability;
	}

	public Patient(java.lang.Integer age, java.lang.Boolean isPregnant,
			java.lang.Boolean isAdmitted,
			com.myspace.spectrum.Appointment appointment,
			java.lang.Boolean hasDisability) {
		this.age = age;
		this.isPregnant = isPregnant;
		this.isAdmitted = isAdmitted;
		this.appointment = appointment;
		this.hasDisability = hasDisability;
	}

}