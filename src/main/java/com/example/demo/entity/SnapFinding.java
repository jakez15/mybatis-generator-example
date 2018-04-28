package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class SnapFinding implements Serializable {
    private Long id;

    private String grouping;

    private String characteristic;

    private String description;

    private String finding;

    private String score;

    private String difficult;

    private String intermediate;

    private String easy;

    private String additionalComments;

    private Long snapFindingResultId;

    private Date createdDate;

    private Date modifiedDate;

    private String createdBy;

    private String modifiedBy;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public SnapFinding withId(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGrouping() {
        return grouping;
    }

    public SnapFinding withGrouping(String grouping) {
        this.setGrouping(grouping);
        return this;
    }

    public void setGrouping(String grouping) {
        this.grouping = grouping == null ? null : grouping.trim();
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public SnapFinding withCharacteristic(String characteristic) {
        this.setCharacteristic(characteristic);
        return this;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic == null ? null : characteristic.trim();
    }

    public String getDescription() {
        return description;
    }

    public SnapFinding withDescription(String description) {
        this.setDescription(description);
        return this;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getFinding() {
        return finding;
    }

    public SnapFinding withFinding(String finding) {
        this.setFinding(finding);
        return this;
    }

    public void setFinding(String finding) {
        this.finding = finding == null ? null : finding.trim();
    }

    public String getScore() {
        return score;
    }

    public SnapFinding withScore(String score) {
        this.setScore(score);
        return this;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    public String getDifficult() {
        return difficult;
    }

    public SnapFinding withDifficult(String difficult) {
        this.setDifficult(difficult);
        return this;
    }

    public void setDifficult(String difficult) {
        this.difficult = difficult == null ? null : difficult.trim();
    }

    public String getIntermediate() {
        return intermediate;
    }

    public SnapFinding withIntermediate(String intermediate) {
        this.setIntermediate(intermediate);
        return this;
    }

    public void setIntermediate(String intermediate) {
        this.intermediate = intermediate == null ? null : intermediate.trim();
    }

    public String getEasy() {
        return easy;
    }

    public SnapFinding withEasy(String easy) {
        this.setEasy(easy);
        return this;
    }

    public void setEasy(String easy) {
        this.easy = easy == null ? null : easy.trim();
    }

    public String getAdditionalComments() {
        return additionalComments;
    }

    public SnapFinding withAdditionalComments(String additionalComments) {
        this.setAdditionalComments(additionalComments);
        return this;
    }

    public void setAdditionalComments(String additionalComments) {
        this.additionalComments = additionalComments == null ? null : additionalComments.trim();
    }

    public Long getSnapFindingResultId() {
        return snapFindingResultId;
    }

    public SnapFinding withSnapFindingResultId(Long snapFindingResultId) {
        this.setSnapFindingResultId(snapFindingResultId);
        return this;
    }

    public void setSnapFindingResultId(Long snapFindingResultId) {
        this.snapFindingResultId = snapFindingResultId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public SnapFinding withCreatedDate(Date createdDate) {
        this.setCreatedDate(createdDate);
        return this;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public SnapFinding withModifiedDate(Date modifiedDate) {
        this.setModifiedDate(modifiedDate);
        return this;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public SnapFinding withCreatedBy(String createdBy) {
        this.setCreatedBy(createdBy);
        return this;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public SnapFinding withModifiedBy(String modifiedBy) {
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
        SnapFinding other = (SnapFinding) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGrouping() == null ? other.getGrouping() == null : this.getGrouping().equals(other.getGrouping()))
            && (this.getCharacteristic() == null ? other.getCharacteristic() == null : this.getCharacteristic().equals(other.getCharacteristic()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getFinding() == null ? other.getFinding() == null : this.getFinding().equals(other.getFinding()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getDifficult() == null ? other.getDifficult() == null : this.getDifficult().equals(other.getDifficult()))
            && (this.getIntermediate() == null ? other.getIntermediate() == null : this.getIntermediate().equals(other.getIntermediate()))
            && (this.getEasy() == null ? other.getEasy() == null : this.getEasy().equals(other.getEasy()))
            && (this.getAdditionalComments() == null ? other.getAdditionalComments() == null : this.getAdditionalComments().equals(other.getAdditionalComments()))
            && (this.getSnapFindingResultId() == null ? other.getSnapFindingResultId() == null : this.getSnapFindingResultId().equals(other.getSnapFindingResultId()))
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
        result = prime * result + ((getGrouping() == null) ? 0 : getGrouping().hashCode());
        result = prime * result + ((getCharacteristic() == null) ? 0 : getCharacteristic().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getFinding() == null) ? 0 : getFinding().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getDifficult() == null) ? 0 : getDifficult().hashCode());
        result = prime * result + ((getIntermediate() == null) ? 0 : getIntermediate().hashCode());
        result = prime * result + ((getEasy() == null) ? 0 : getEasy().hashCode());
        result = prime * result + ((getAdditionalComments() == null) ? 0 : getAdditionalComments().hashCode());
        result = prime * result + ((getSnapFindingResultId() == null) ? 0 : getSnapFindingResultId().hashCode());
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
        sb.append(", grouping=").append(grouping);
        sb.append(", characteristic=").append(characteristic);
        sb.append(", description=").append(description);
        sb.append(", finding=").append(finding);
        sb.append(", score=").append(score);
        sb.append(", difficult=").append(difficult);
        sb.append(", intermediate=").append(intermediate);
        sb.append(", easy=").append(easy);
        sb.append(", additionalComments=").append(additionalComments);
        sb.append(", snapFindingResultId=").append(snapFindingResultId);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", modifiedBy=").append(modifiedBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}