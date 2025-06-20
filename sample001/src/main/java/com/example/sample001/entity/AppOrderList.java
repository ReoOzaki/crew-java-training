package com.example.sample001.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "app_orderList")
public class AppOrderList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "primary_id")
    private Long id;

    @Column(name = "parts_id")
    private String partsId;

    @Column(name = "parts_count")
    private Integer partsCount;

    @Column(name = "parts_day")
    private LocalDate partsDay;

    @Column(name = "parts_comment")
    private String partsComment;

    // --- getter / setter ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPartsId() { return partsId; }
    public void setPartsId(String partsId) { this.partsId = partsId; }

    public Integer getPartsCount() { return partsCount; }
    public void setPartsCount(Integer partsCount) { this.partsCount = partsCount; }

    public LocalDate getPartsDay() { return partsDay; }
    public void setPartsDay(LocalDate partsDay) { this.partsDay = partsDay; }

    public String getPartsComment() { return partsComment; }
    public void setPartsComment(String partsComment) { this.partsComment = partsComment; }
}
