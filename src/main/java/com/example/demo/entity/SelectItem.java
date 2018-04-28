package com.example.demo.entity;

import java.io.Serializable;

public class SelectItem implements Serializable {
    private Long id;

    private String label;

    private String value;

    private Long snapFindingId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public SelectItem withId(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public SelectItem withLabel(String label) {
        this.setLabel(label);
        return this;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public String getValue() {
        return value;
    }

    public SelectItem withValue(String value) {
        this.setValue(value);
        return this;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Long getSnapFindingId() {
        return snapFindingId;
    }

    public SelectItem withSnapFindingId(Long snapFindingId) {
        this.setSnapFindingId(snapFindingId);
        return this;
    }

    public void setSnapFindingId(Long snapFindingId) {
        this.snapFindingId = snapFindingId;
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
        SelectItem other = (SelectItem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLabel() == null ? other.getLabel() == null : this.getLabel().equals(other.getLabel()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getSnapFindingId() == null ? other.getSnapFindingId() == null : this.getSnapFindingId().equals(other.getSnapFindingId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLabel() == null) ? 0 : getLabel().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getSnapFindingId() == null) ? 0 : getSnapFindingId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", label=").append(label);
        sb.append(", value=").append(value);
        sb.append(", snapFindingId=").append(snapFindingId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}