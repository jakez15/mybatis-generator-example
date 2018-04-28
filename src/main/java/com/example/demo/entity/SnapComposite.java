package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

public class SnapComposite implements Serializable {
    private Long snapFindingResultId;
    private SnapFindingResult snapFindingResult;
    private List<SnapFinding> snapFindingList;

    public List<SnapFinding> getSnapFindingList() {
        return snapFindingList;
    }

    public void setSnapFindingList(List<SnapFinding> snapFindingList) {
        this.snapFindingList = snapFindingList;
    }

    public SnapFindingResult getSnapFindingResult() {
        return snapFindingResult;
    }

    public void setSnapFindingResult(SnapFindingResult snapFindingResult) {
        this.snapFindingResult = snapFindingResult;
    }

    public Long getSnapFindingResultId() {
        return snapFindingResultId;
    }

    public void setSnapFindingResultId(Long snapFindingResultId) {
        this.snapFindingResultId = snapFindingResultId;
    }
}
