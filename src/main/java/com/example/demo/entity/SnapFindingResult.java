package com.example.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SnapFindingResult implements Serializable {
    private Long id;

    private String user;

    private String application;

    private String applicationType;

    private String customer;

    private String overallScore;

    private BigDecimal calcOverallScore;

    private String manualOverrideScore;

    private String manualOverrideReason;

    private String conclusion;

    private Date createdDate;

    private Date modifiedDate;

    private String createdBy;

    private String modifiedBy;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public SnapFindingResult withId(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public SnapFindingResult withUser(String user) {
        this.setUser(user);
        return this;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getApplication() {
        return application;
    }

    public SnapFindingResult withApplication(String application) {
        this.setApplication(application);
        return this;
    }

    public void setApplication(String application) {
        this.application = application == null ? null : application.trim();
    }

    public String getApplicationType() {
        return applicationType;
    }

    public SnapFindingResult withApplicationType(String applicationType) {
        this.setApplicationType(applicationType);
        return this;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType == null ? null : applicationType.trim();
    }

    public String getCustomer() {
        return customer;
    }

    public SnapFindingResult withCustomer(String customer) {
        this.setCustomer(customer);
        return this;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getOverallScore() {
        return overallScore;
    }

    public SnapFindingResult withOverallScore(String overallScore) {
        this.setOverallScore(overallScore);
        return this;
    }

    public void setOverallScore(String overallScore) {
        this.overallScore = overallScore == null ? null : overallScore.trim();
    }

    public BigDecimal getCalcOverallScore() {
        return calcOverallScore;
    }

    public SnapFindingResult withCalcOverallScore(BigDecimal calcOverallScore) {
        this.setCalcOverallScore(calcOverallScore);
        return this;
    }

    public void setCalcOverallScore(BigDecimal calcOverallScore) {
        this.calcOverallScore = calcOverallScore;
    }

    public String getManualOverrideScore() {
        return manualOverrideScore;
    }

    public SnapFindingResult withManualOverrideScore(String manualOverrideScore) {
        this.setManualOverrideScore(manualOverrideScore);
        return this;
    }

    public void setManualOverrideScore(String manualOverrideScore) {
        this.manualOverrideScore = manualOverrideScore == null ? null : manualOverrideScore.trim();
    }

    public String getManualOverrideReason() {
        return manualOverrideReason;
    }

    public SnapFindingResult withManualOverrideReason(String manualOverrideReason) {
        this.setManualOverrideReason(manualOverrideReason);
        return this;
    }

    public void setManualOverrideReason(String manualOverrideReason) {
        this.manualOverrideReason = manualOverrideReason == null ? null : manualOverrideReason.trim();
    }

    public String getConclusion() {
        return conclusion;
    }

    public SnapFindingResult withConclusion(String conclusion) {
        this.setConclusion(conclusion);
        return this;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion == null ? null : conclusion.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public SnapFindingResult withCreatedDate(Date createdDate) {
        this.setCreatedDate(createdDate);
        return this;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public SnapFindingResult withModifiedDate(Date modifiedDate) {
        this.setModifiedDate(modifiedDate);
        return this;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public SnapFindingResult withCreatedBy(String createdBy) {
        this.setCreatedBy(createdBy);
        return this;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public SnapFindingResult withModifiedBy(String modifiedBy) {
        this.setModifiedBy(modifiedBy);
        return this;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy == null ? null : modifiedBy.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SnapFindingResult other = (SnapFindingResult) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getApplication() == null ? other.getApplication() == null : this.getApplication().equals(other.getApplication()))
            && (this.getApplicationType() == null ? other.getApplicationType() == null : this.getApplicationType().equals(other.getApplicationType()))
            && (this.getCustomer() == null ? other.getCustomer() == null : this.getCustomer().equals(other.getCustomer()))
            && (this.getOverallScore() == null ? other.getOverallScore() == null : this.getOverallScore().equals(other.getOverallScore()))
            && (this.getCalcOverallScore() == null ? other.getCalcOverallScore() == null : this.getCalcOverallScore().equals(other.getCalcOverallScore()))
            && (this.getManualOverrideScore() == null ? other.getManualOverrideScore() == null : this.getManualOverrideScore().equals(other.getManualOverrideScore()))
            && (this.getManualOverrideReason() == null ? other.getManualOverrideReason() == null : this.getManualOverrideReason().equals(other.getManualOverrideReason()))
            && (this.getConclusion() == null ? other.getConclusion() == null : this.getConclusion().equals(other.getConclusion()))
            && (this.getCreatedDate() == null ? other.getCreatedDate() == null : this.getCreatedDate().equals(other.getCreatedDate()))
            && (this.getModifiedDate() == null ? other.getModifiedDate() == null : this.getModifiedDate().equals(other.getModifiedDate()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getModifiedBy() == null ? other.getModifiedBy() == null : this.getModifiedBy().equals(other.getModifiedBy()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getApplication() == null) ? 0 : getApplication().hashCode());
        result = prime * result + ((getApplicationType() == null) ? 0 : getApplicationType().hashCode());
        result = prime * result + ((getCustomer() == null) ? 0 : getCustomer().hashCode());
        result = prime * result + ((getOverallScore() == null) ? 0 : getOverallScore().hashCode());
        result = prime * result + ((getCalcOverallScore() == null) ? 0 : getCalcOverallScore().hashCode());
        result = prime * result + ((getManualOverrideScore() == null) ? 0 : getManualOverrideScore().hashCode());
        result = prime * result + ((getManualOverrideReason() == null) ? 0 : getManualOverrideReason().hashCode());
        result = prime * result + ((getConclusion() == null) ? 0 : getConclusion().hashCode());
        result = prime * result + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        result = prime * result + ((getModifiedDate() == null) ? 0 : getModifiedDate().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getModifiedBy() == null) ? 0 : getModifiedBy().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", user=").append(user);
        sb.append(", application=").append(application);
        sb.append(", applicationType=").append(applicationType);
        sb.append(", customer=").append(customer);
        sb.append(", overallScore=").append(overallScore);
        sb.append(", calcOverallScore=").append(calcOverallScore);
        sb.append(", manualOverrideScore=").append(manualOverrideScore);
        sb.append(", manualOverrideReason=").append(manualOverrideReason);
        sb.append(", conclusion=").append(conclusion);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", modifiedBy=").append(modifiedBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}