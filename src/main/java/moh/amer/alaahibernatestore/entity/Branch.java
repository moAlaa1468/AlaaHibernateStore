package moh.amer.alaahibernatestore.entity;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name = "branches")
public class Branch {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "zone_id", nullable = false)
    private Zone zone;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "building", nullable = false, length = 45)
    private String building;

    @Column(name = "street_name", nullable = false, length = 100)
    private String streetName;

    @Column(name = "working_start", nullable = false)
    private LocalTime workingStart;

    @Column(name = "working_end", nullable = false)
    private LocalTime workingEnd;

    @Column(name = "teleophone")
    private Integer teleophone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public LocalTime getWorkingStart() {
        return workingStart;
    }

    public void setWorkingStart(LocalTime workingStart) {
        this.workingStart = workingStart;
    }

    public LocalTime getWorkingEnd() {
        return workingEnd;
    }

    public void setWorkingEnd(LocalTime workingEnd) {
        this.workingEnd = workingEnd;
    }

    public Integer getTeleophone() {
        return teleophone;
    }

    public void setTeleophone(Integer teleophone) {
        this.teleophone = teleophone;
    }

}