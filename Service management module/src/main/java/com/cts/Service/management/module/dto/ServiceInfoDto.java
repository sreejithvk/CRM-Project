package com.cts.Service.management.module.dto;

import lombok.Data;

@Data
public class ServiceInfoDto {

    private int serviceId;


    private String serviceName;

    private int estimatedDuration;


    private int teamMembersInvolved;


    private String serviceType;


}