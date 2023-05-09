package com.cts.Service.management.module.domain;
import jakarta.persistence.*;
import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;

@Entity
@Table(name = "service_info")
@Data
public class ServiceInfo {
    @Id
    @Column(name = "service_Id")
    @GeneratedValue
    private int serviceId;


    @Column(name = "Service_Name")
    private String serviceName;

    @Column(name = "estimated_Duration")
    private int estimatedDuration;

    @Column(name = "team_Members_Involved")
    private int teamMembersInvolved;

    @Column(name = "Service_Type")
    private String serviceType;



}
