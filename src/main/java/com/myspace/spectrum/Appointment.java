package com.myspace.spectrum;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Appointment implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Boolean scheduled;
	private java.util.Date date;

	public Appointment() {
	}

	public java.lang.Boolean getScheduled() {
		return this.scheduled;
	}

	public void setScheduled(java.lang.Boolean scheduled) {
		this.scheduled = scheduled;
	}

	public java.util.Date getDate() {
		return this.date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public Appointment(java.lang.Boolean scheduled, java.util.Date date) {
		this.scheduled = scheduled;
		this.date = date;
	}

}