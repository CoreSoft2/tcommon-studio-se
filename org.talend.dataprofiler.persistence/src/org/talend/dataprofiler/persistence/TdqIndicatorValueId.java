package org.talend.dataprofiler.persistence;

// Generated Apr 21, 2008 5:00:51 PM by Hibernate Tools 3.2.0.CR1

/**
 * TdqIndicatorValueId generated by hbm2java
 */
public class TdqIndicatorValueId implements java.io.Serializable {

	private int anPk;
	private int eltPk;
	private int indPk;
	private int timePk;
	private int calPk;
	private int valPk;

	public TdqIndicatorValueId() {
	}

	public TdqIndicatorValueId(int anPk, int eltPk, int indPk, int timePk,
			int calPk, int valPk) {
		this.anPk = anPk;
		this.eltPk = eltPk;
		this.indPk = indPk;
		this.timePk = timePk;
		this.calPk = calPk;
		this.valPk = valPk;
	}

	public int getAnPk() {
		return this.anPk;
	}

	public void setAnPk(int anPk) {
		this.anPk = anPk;
	}

	public int getEltPk() {
		return this.eltPk;
	}

	public void setEltPk(int eltPk) {
		this.eltPk = eltPk;
	}

	public int getIndPk() {
		return this.indPk;
	}

	public void setIndPk(int indPk) {
		this.indPk = indPk;
	}

	public int getTimePk() {
		return this.timePk;
	}

	public void setTimePk(int timePk) {
		this.timePk = timePk;
	}

	public int getCalPk() {
		return this.calPk;
	}

	public void setCalPk(int calPk) {
		this.calPk = calPk;
	}

	public int getValPk() {
		return this.valPk;
	}

	public void setValPk(int valPk) {
		this.valPk = valPk;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TdqIndicatorValueId))
			return false;
		TdqIndicatorValueId castOther = (TdqIndicatorValueId) other;

		return (this.getAnPk() == castOther.getAnPk())
				&& (this.getEltPk() == castOther.getEltPk())
				&& (this.getIndPk() == castOther.getIndPk())
				&& (this.getTimePk() == castOther.getTimePk())
				&& (this.getCalPk() == castOther.getCalPk())
				&& (this.getValPk() == castOther.getValPk());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAnPk();
		result = 37 * result + this.getEltPk();
		result = 37 * result + this.getIndPk();
		result = 37 * result + this.getTimePk();
		result = 37 * result + this.getCalPk();
		result = 37 * result + this.getValPk();
		return result;
	}

}
