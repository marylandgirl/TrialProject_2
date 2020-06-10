package com.example.demo;

import com.example.demo.model.DailyTimeEntry;
import com.example.demo.model.TimeSheet;
import org.apache.tomcat.jni.Local;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class WeeklyTimeEntry {

    private String[] regTimeStart;
    private String[] regTimeEnd;
    private String[] overtimeStart;
    private String[] overtimeEnd;
    private String[] paidHdyStart;
    private String[] paidHdyEnd;
    private String[] hdyWorkedStart;
    private String[] hdyWorkedEnd;
    private String[] leaveWOPayStart;
    private String[] leaveWOPayEnd;
    private String[] compTimeEarnedStart;
    private String[] compTimeEarnedEnd;
    private String[] annualLeaveStart;
    private String[] annualLeaveEnd;
    private String[] compTimeUsedStart;
    private String[] compTimeUsedEnd;
    private String[] holidayOTStart;
    private String[] holidayOTEnd;
    static final int DAYS_PER_PAY_PERIOD = 7;

    public WeeklyTimeEntry() {
        initialize();
    }

    public String[] getRegTimeStart() {
        return regTimeStart;
    }

    public void setRegTimeStart(String[] regTimeStart) {
        this.regTimeStart = regTimeStart;
    }

    public String[] getRegTimeEnd() {
        return regTimeEnd;
    }

    public void setRegTimeEnd(String[] regTimeEnd) {
        this.regTimeEnd = regTimeEnd;
    }

    public String[] getOvertimeStart() {
        return overtimeStart;
    }

    public void setOvertimeStart(String[] overtimeStart) {
        this.overtimeStart = overtimeStart;
    }

    public String[] getOvertimeEnd() {
        return overtimeEnd;
    }

    public void setOvertimeEnd(String[] overtimeEnd) {
        this.overtimeEnd = overtimeEnd;
    }

    public String[] getPaidHdyStart() {
        return paidHdyStart;
    }

    public void setPaidHdyStart(String[] paidHdyStart) {
        this.paidHdyStart = paidHdyStart;
    }

    public String[] getPaidHdyEnd() {
        return paidHdyEnd;
    }

    public void setPaidHdyEnd(String[] paidHdyEnd) {
        this.paidHdyEnd = paidHdyEnd;
    }

    public String[] getHdyWorkedStart() {
        return hdyWorkedStart;
    }

    public void setHdyWorkedStart(String[] hdyWorkedStart) {
        this.hdyWorkedStart = hdyWorkedStart;
    }

    public String[] getHdyWorkedEnd() {
        return hdyWorkedEnd;
    }

    public void setHdyWorkedEnd(String[] hdyWorkedEnd) {
        this.hdyWorkedEnd = hdyWorkedEnd;
    }

    public String[] getLeaveWOPayStart() {
        return leaveWOPayStart;
    }

    public void setLeaveWOPayStart(String[] leaveWOPayStart) {
        this.leaveWOPayStart = leaveWOPayStart;
    }

    public String[] getLeaveWOPayEnd() {
        return leaveWOPayEnd;
    }

    public void setLeaveWOPayEnd(String[] leaveWOPayEnd) {
        this.leaveWOPayEnd = leaveWOPayEnd;
    }

    public String[] getCompTimeEarnedStart() {
        return compTimeEarnedStart;
    }

    public void setCompTimeEarnedStart(String[] compTimeEarnedStart) {
        this.compTimeEarnedStart = compTimeEarnedStart;
    }

    public String[] getCompTimeEarnedEnd() {
        return compTimeEarnedEnd;
    }

    public void setCompTimeEarnedEnd(String[] compTimeEarnedEnd) {
        this.compTimeEarnedEnd = compTimeEarnedEnd;
    }

    public String[] getAnnualLeaveStart() {
        return annualLeaveStart;
    }

    public void setAnnualLeaveStart(String[] annualLeaveStart) {
        this.annualLeaveStart = annualLeaveStart;
    }

    public String[] getAnnualLeaveEnd() {
        return annualLeaveEnd;
    }

    public void setAnnualLeaveEnd(String[] annualLeaveEnd) {
        this.annualLeaveEnd = annualLeaveEnd;
    }

    public String[] getCompTimeUsedStart() {
        return compTimeUsedStart;
    }

    public void setCompTimeUsedStart(String[] compTimeUsedStart) {
        this.compTimeUsedStart = compTimeUsedStart;
    }

    public String[] getCompTimeUsedEnd() {
        return compTimeUsedEnd;
    }

    public void setCompTimeUsedEnd(String[] compTimeUsedEnd) {
        this.compTimeUsedEnd = compTimeUsedEnd;
    }

    public String[] getHolidayOTStart() {
        return holidayOTStart;
    }

    public void setHolidayOTStart(String[] holidayOTStart) {
        this.holidayOTStart = holidayOTStart;
    }

    public String[] getHolidayOTEnd() {
        return holidayOTEnd;
    }

    public void setHolidayOTEnd(String[] holidayOTEnd) {
        this.holidayOTEnd = holidayOTEnd;
    }

    private void initialize() {
        regTimeStart = new String [7];
        Arrays.setAll(regTimeStart,i->"__:__ __");
        regTimeEnd = new String [7];
        Arrays.setAll(regTimeEnd,i->"__:__ __");
        overtimeStart = new String [7];
        Arrays.setAll(overtimeStart,i->"__:__ __");
        overtimeEnd = new String [7];
        Arrays.setAll(overtimeEnd,i->"__:__ __");
        paidHdyStart = new String [7];
        Arrays.setAll(paidHdyStart,i->"__:__ __");
        paidHdyEnd = new String [7];
        Arrays.setAll(paidHdyEnd,i->"__:__ __");
        hdyWorkedStart = new String [7];
        Arrays.setAll(hdyWorkedStart,i->"__:__ __");
        hdyWorkedEnd = new String [7];
        Arrays.setAll(hdyWorkedEnd,i->"__:__ __");
        leaveWOPayStart = new String [7];
        Arrays.setAll(leaveWOPayStart,i->"__:__ __");
        leaveWOPayEnd = new String [7];
        Arrays.setAll(leaveWOPayEnd,i->"__:__ __");
        compTimeEarnedStart = new String [7];
        Arrays.setAll(compTimeEarnedStart,i->"__:__ __");
        compTimeEarnedEnd = new String [7];
        Arrays.setAll(compTimeEarnedEnd,i->"__:__ __");
        annualLeaveStart = new String [7];
        Arrays.setAll(annualLeaveStart,i->"__:__ __");
        annualLeaveEnd = new String [7];
        Arrays.setAll(annualLeaveEnd,i->"__:__ __");
        compTimeUsedStart = new String [7];
        Arrays.setAll(compTimeUsedStart,i->"__:__ __");
        compTimeUsedEnd = new String [7];
        Arrays.setAll(compTimeUsedEnd,i->"__:__ __");
        holidayOTStart = new String [7];
        Arrays.setAll(holidayOTStart,i->"__:__ __");
        holidayOTEnd = new String [7];
        Arrays.setAll(holidayOTEnd,i->"__:__ __");
    }

    public boolean updateDailyEntries(LocalDate begDate, LocalDate endDate, TimeSheet timeSheet) {
        DailyTimeEntry[] dailyTimeEntries = new DailyTimeEntry[7];
        for ( int i = 0; i < DAYS_PER_PAY_PERIOD; i++) {
            try {
                LocalTime startTime = LocalTime.parse(regTimeStart[i]);
                LocalTime endTime = LocalTime.parse(regTimeEnd[i]);
                Duration diff = Duration.between(startTime,endTime);
                double regHoursWorked = ((double) diff.toMinutes()/60.0);
                System.out.println("Kim the total time entry is for regular hours is"
                        + regHoursWorked + " for " + begDate.plusDays(i));
                dailyTimeEntries[i].setRegHours(regHoursWorked);
            } catch (Exception e){
                e.getMessage();
            }
            try {
                LocalTime startTime = LocalTime.parse(overtimeStart[i]);
                LocalTime endTime = LocalTime.parse(overtimeEnd[i]);
                Duration diff = Duration.between(startTime,endTime);
                double overtimeWorked = ((double) diff.toMinutes()/60.0);
                System.out.println("Kim the total time entry is "
                        + overtimeWorked + " for " + begDate.plusDays(i));
                dailyTimeEntries[i].setOvertimeHours(overtimeWorked);
            } catch (Exception e){
                e.getMessage();
            }
        }
        return false;
    }
}
