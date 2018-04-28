package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class SnapFindingMetadata implements Serializable {
    private Long id;

    private String type;

    private String grouping;

    private String characteristic;

    private String description;

    private String difficult;

    private String difficultValue;

    private String intermediate;

    private String intermediateValue;

    private String easy;

    private String easyValue;

    private Date createdDate;

    private Date modifiedDate;

    private String createdBy;

    private String modifiedBy;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public SnapFindingMetadata withId(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public SnapFindingMetadata withType(String type) {
        this.setType(type);
        return this;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getGrouping() {
        return grouping;
    }

    public SnapFindingMetadata withGrouping(String grouping) {
        this.setGrouping(grouping);
        return this;
    }

    public void setGrouping(String grouping) {
        this.grouping = grouping == null ? null : grouping.trim();
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public SnapFindingMetadata withCharacteristic(String characteristic) {
        this.setCharacteristic(characteristic);
        return this;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic == null ? null : characteristic.trim();
    }

    public String getDescription() {
        return description;
    }

    public SnapFindingMetadata withDescription(String description) {
        this.setDescription(description);
        return this;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDifficult() {
        return difficult;
    }

    public SnapFindingMetadata withDifficult(String difficult) {
        this.setDifficult(difficult);
        return this;
    }

    public void setDifficult(String difficult) {
        this.difficult = difficult == null ? null : difficult.trim();
    }

    public String getDifficultValue() {
        return difficultValue;
    }

    public SnapFindingMetadata withDifficultValue(String difficultValue) {
        this.setDifficultValue(difficultValue);
        return this;
    }

    public void setDifficultValue(String difficultValue) {
        this.difficultValue = difficultValue == null ? null : difficultValue.trim();
    }

    public String getIntermediate() {
        return intermediate;
    }

    public SnapFindingMetadata withIntermediate(String intermediate) {
        this.setIntermediate(intermediate);
        return this;
    }

    public void setIntermediate(String intermediate) {
        this.intermediate = intermediate == null ? null : intermediate.trim();
    }

    public String getIntermediateValue() {
        return intermediateValue;
    }

    public SnapFindingMetadata withIntermediateValue(String intermediateValue) {
        this.setIntermediateValue(intermediateValue);
        return this;
    }

    public void setIntermediateValue(String intermediateValue) {
        this.intermediateValue = intermediateValue == null ? null : intermediateValue.trim();
    }

    public String getEasy() {
        return easy;
    }

    public SnapFindingMetadata withEasy(String easy) {
        this.setEasy(easy);
        return this;
    }

    public void setEasy(String easy) {
        this.easy = easy == null ? null : easy.trim();
    }

    public String getEasyValue() {
        return easyValue;
    }

    public SnapFindingMetadata withEasyValue(String easyValue) {
        this.setEasyValue(easyValue);
        return this;
    }

    public void setEasyValue(String easyValue) {
        this.easyValue = easyValue == null ? null : easyValue.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public SnapFindingMetadata withCreatedDate(Date createdDate) {
        this.setCreatedDate(createdDate);
        return this;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public SnapFindingMetadata withModifiedDate(Date modifiedDate) {
        this.setModifiedDate(modifiedDate);
        return this;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public SnapFindingMetadata withCreatedBy(String createdBy) {
        this.setCreatedBy(createdBy);
        return this;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public SnapFindingMetadata withModifiedBy(String modifiedBy) {
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
        SnapFindingMetadata other = (SnapFindingMetadata) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getGrouping() == null ? other.getGrouping() == null : this.getGrouping().equals(other.getGrouping()))
            && (this.getCharacteristic() == null ? other.getCharacteristic() == null : this.getCharacteristic().equals(other.getCharacteristic()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getDifficult() == null ? other.getDifficult() == null : this.getDifficult().equals(other.getDifficult()))
            && (this.getDifficultValue() == null ? other.getDifficultValue() == null : this.getDifficultValue().equals(other.getDifficultValue()))
            && (this.getIntermediate() == null ? other.getIntermediate() == null : this.getIntermediate().equals(other.getIntermediate()))
            && (this.getIntermediateValue() == null ? other.getIntermediateValue() == null : this.getIntermediateValue().equals(other.getIntermediateValue()))
            && (this.getEasy() == null ? other.getEasy() == null : this.getEasy().equals(other.getEasy()))
            && (this.getEasyValue() == null ? other.getEasyValue() == null : this.getEasyValue().equals(other.getEasyValue()))
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
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getGrouping() == null) ? 0 : getGrouping().hashCode());
        result = prime * result + ((getCharacteristic() == null) ? 0 : getCharacteristic().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getDifficult() == null) ? 0 : getDifficult().hashCode());
        result = prime * result + ((getDifficultValue() == null) ? 0 : getDifficultValue().hashCode());
        result = prime * result + ((getIntermediate() == null) ? 0 : getIntermediate().hashCode());
        result = prime * result + ((getIntermediateValue() == null) ? 0 : getIntermediateValue().hashCode());
        result = prime * result + ((getEasy() == null) ? 0 : getEasy().hashCode());
        result = prime * result + ((getEasyValue() == null) ? 0 : getEasyValue().hashCode());
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
        sb.append(", type=").append(type);
        sb.append(", grouping=").append(grouping);
        sb.append(", characteristic=").append(characteristic);
        sb.append(", description=").append(description);
        sb.append(", difficult=").append(difficult);
        sb.append(", difficultValue=").append(difficultValue);
        sb.append(", intermediate=").append(intermediate);
        sb.append(", intermediateValue=").append(intermediateValue);
        sb.append(", easy=").append(easy);
        sb.append(", easyValue=").append(easyValue);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", modifiedBy=").append(modifiedBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}