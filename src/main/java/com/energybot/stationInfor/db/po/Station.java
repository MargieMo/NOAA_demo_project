package com.energybot.stationInfor.db.po;

public class Station {
    private Integer id;

    private String stationId;

    private String testTime;

    private String element;

    private String value;

    private String mflag;

    private String qflag;

    private String sflag;

    private String extraValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId == null ? null : stationId.trim();
    }

    public String getTestTime() {
        return testTime;
    }

    public void setTestTime(String testTime) {
        this.testTime = testTime == null ? null : testTime.trim();
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element == null ? null : element.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getMflag() {
        return mflag;
    }

    public void setMflag(String mflag) {
        this.mflag = mflag == null ? null : mflag.trim();
    }

    public String getQflag() {
        return qflag;
    }

    public void setQflag(String qflag) {
        this.qflag = qflag == null ? null : qflag.trim();
    }

    public String getSflag() {
        return sflag;
    }

    public void setSflag(String sflag) {
        this.sflag = sflag == null ? null : sflag.trim();
    }

    public String getExtraValue() {
        return extraValue;
    }

    public void setExtraValue(String extraValue) {
        this.extraValue = extraValue == null ? null : extraValue.trim();
    }

    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", stationId='" + stationId + '\'' +
                ", testTime='" + testTime + '\'' +
                ", element='" + element + '\'' +
                ", value='" + value + '\'' +
                ", mflag='" + mflag + '\'' +
                ", qflag='" + qflag + '\'' +
                ", sflag='" + sflag + '\'' +
                ", extraValue='" + extraValue + '\'' +
                '}';
    }
}