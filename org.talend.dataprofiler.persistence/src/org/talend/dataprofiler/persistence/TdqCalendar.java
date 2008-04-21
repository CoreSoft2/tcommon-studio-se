package org.talend.dataprofiler.persistence;

// Generated Apr 21, 2008 5:00:51 PM by Hibernate Tools 3.2.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TdqCalendar generated by hbm2java
 */
public class TdqCalendar implements java.io.Serializable {

	private Integer calPk;
	private Date calDate;
	private int calDayInMinth;
	private int calDayInYear;
	private int calLastWeekDay;
	private int calLastMonthDay;
	private int calWeekDay;
	private String calDayName;
	private int calWeekNum;
	private int calMonth;
	private String calMonthName;
	private int calYear;
	private String calMonthPeriod;
	private int calQuarter;
	private String calQuarterPeriod;
	private int calSemester;
	private char calDayOff;
	private char calSpecialDay;
	private String calSpecDayLabel;
	private Set<TdqIndicatorValue> tdqIndicatorValues = new HashSet<TdqIndicatorValue>(
			0);

	public TdqCalendar() {
	}

	public TdqCalendar(Date calDate, int calDayInMinth, int calDayInYear,
			int calLastWeekDay, int calLastMonthDay, int calWeekDay,
			String calDayName, int calWeekNum, int calMonth,
			String calMonthName, int calYear, String calMonthPeriod,
			int calQuarter, String calQuarterPeriod, int calSemester,
			char calDayOff, char calSpecialDay, String calSpecDayLabel) {
		this.calDate = calDate;
		this.calDayInMinth = calDayInMinth;
		this.calDayInYear = calDayInYear;
		this.calLastWeekDay = calLastWeekDay;
		this.calLastMonthDay = calLastMonthDay;
		this.calWeekDay = calWeekDay;
		this.calDayName = calDayName;
		this.calWeekNum = calWeekNum;
		this.calMonth = calMonth;
		this.calMonthName = calMonthName;
		this.calYear = calYear;
		this.calMonthPeriod = calMonthPeriod;
		this.calQuarter = calQuarter;
		this.calQuarterPeriod = calQuarterPeriod;
		this.calSemester = calSemester;
		this.calDayOff = calDayOff;
		this.calSpecialDay = calSpecialDay;
		this.calSpecDayLabel = calSpecDayLabel;
	}

	public TdqCalendar(Date calDate, int calDayInMinth, int calDayInYear,
			int calLastWeekDay, int calLastMonthDay, int calWeekDay,
			String calDayName, int calWeekNum, int calMonth,
			String calMonthName, int calYear, String calMonthPeriod,
			int calQuarter, String calQuarterPeriod, int calSemester,
			char calDayOff, char calSpecialDay, String calSpecDayLabel,
			Set<TdqIndicatorValue> tdqIndicatorValues) {
		this.calDate = calDate;
		this.calDayInMinth = calDayInMinth;
		this.calDayInYear = calDayInYear;
		this.calLastWeekDay = calLastWeekDay;
		this.calLastMonthDay = calLastMonthDay;
		this.calWeekDay = calWeekDay;
		this.calDayName = calDayName;
		this.calWeekNum = calWeekNum;
		this.calMonth = calMonth;
		this.calMonthName = calMonthName;
		this.calYear = calYear;
		this.calMonthPeriod = calMonthPeriod;
		this.calQuarter = calQuarter;
		this.calQuarterPeriod = calQuarterPeriod;
		this.calSemester = calSemester;
		this.calDayOff = calDayOff;
		this.calSpecialDay = calSpecialDay;
		this.calSpecDayLabel = calSpecDayLabel;
		this.tdqIndicatorValues = tdqIndicatorValues;
	}

	public Integer getCalPk() {
		return this.calPk;
	}

	public void setCalPk(Integer calPk) {
		this.calPk = calPk;
	}

	public Date getCalDate() {
		return this.calDate;
	}

	public void setCalDate(Date calDate) {
		this.calDate = calDate;
	}

	public int getCalDayInMinth() {
		return this.calDayInMinth;
	}

	public void setCalDayInMinth(int calDayInMinth) {
		this.calDayInMinth = calDayInMinth;
	}

	public int getCalDayInYear() {
		return this.calDayInYear;
	}

	public void setCalDayInYear(int calDayInYear) {
		this.calDayInYear = calDayInYear;
	}

	public int getCalLastWeekDay() {
		return this.calLastWeekDay;
	}

	public void setCalLastWeekDay(int calLastWeekDay) {
		this.calLastWeekDay = calLastWeekDay;
	}

	public int getCalLastMonthDay() {
		return this.calLastMonthDay;
	}

	public void setCalLastMonthDay(int calLastMonthDay) {
		this.calLastMonthDay = calLastMonthDay;
	}

	public int getCalWeekDay() {
		return this.calWeekDay;
	}

	public void setCalWeekDay(int calWeekDay) {
		this.calWeekDay = calWeekDay;
	}

	public String getCalDayName() {
		return this.calDayName;
	}

	public void setCalDayName(String calDayName) {
		this.calDayName = calDayName;
	}

	public int getCalWeekNum() {
		return this.calWeekNum;
	}

	public void setCalWeekNum(int calWeekNum) {
		this.calWeekNum = calWeekNum;
	}

	public int getCalMonth() {
		return this.calMonth;
	}

	public void setCalMonth(int calMonth) {
		this.calMonth = calMonth;
	}

	public String getCalMonthName() {
		return this.calMonthName;
	}

	public void setCalMonthName(String calMonthName) {
		this.calMonthName = calMonthName;
	}

	public int getCalYear() {
		return this.calYear;
	}

	public void setCalYear(int calYear) {
		this.calYear = calYear;
	}

	public String getCalMonthPeriod() {
		return this.calMonthPeriod;
	}

	public void setCalMonthPeriod(String calMonthPeriod) {
		this.calMonthPeriod = calMonthPeriod;
	}

	public int getCalQuarter() {
		return this.calQuarter;
	}

	public void setCalQuarter(int calQuarter) {
		this.calQuarter = calQuarter;
	}

	public String getCalQuarterPeriod() {
		return this.calQuarterPeriod;
	}

	public void setCalQuarterPeriod(String calQuarterPeriod) {
		this.calQuarterPeriod = calQuarterPeriod;
	}

	public int getCalSemester() {
		return this.calSemester;
	}

	public void setCalSemester(int calSemester) {
		this.calSemester = calSemester;
	}

	public char getCalDayOff() {
		return this.calDayOff;
	}

	public void setCalDayOff(char calDayOff) {
		this.calDayOff = calDayOff;
	}

	public char getCalSpecialDay() {
		return this.calSpecialDay;
	}

	public void setCalSpecialDay(char calSpecialDay) {
		this.calSpecialDay = calSpecialDay;
	}

	public String getCalSpecDayLabel() {
		return this.calSpecDayLabel;
	}

	public void setCalSpecDayLabel(String calSpecDayLabel) {
		this.calSpecDayLabel = calSpecDayLabel;
	}

	public Set<TdqIndicatorValue> getTdqIndicatorValues() {
		return this.tdqIndicatorValues;
	}

	public void setTdqIndicatorValues(Set<TdqIndicatorValue> tdqIndicatorValues) {
		this.tdqIndicatorValues = tdqIndicatorValues;
	}

}
