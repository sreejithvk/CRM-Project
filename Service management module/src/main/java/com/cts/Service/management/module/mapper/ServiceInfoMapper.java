package com.cts.Service.management.module.mapper;

import com.cts.Service.management.module.domain.ServiceInfo;
import com.cts.Service.management.module.dto.ServiceInfoDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ServiceInfoMapper {
    public ServiceInfoDto mapToDto(ServiceInfo serviceInfo) {
        ServiceInfoDto serviceInfoDto = new ServiceInfoDto();
        BeanUtils.copyProperties(serviceInfo, serviceInfoDto);
        return serviceInfoDto;
    }

    public ServiceInfo mapToDomain(ServiceInfoDto infoDto) {
        ServiceInfo serviceInfo = new ServiceInfo();
        BeanUtils.copyProperties(infoDto, serviceInfo);
        return serviceInfo;
    }
    public ServiceInfo modifyDomainObject(ServiceInfoDto infoDto,ServiceInfo serviceInfo) {
        serviceInfo.setServiceName(infoDto.getServiceName());
        serviceInfo.setServiceType(infoDto.getServiceType());
        serviceInfo.setEstimatedDuration(infoDto.getEstimatedDuration());
        serviceInfo.setTeamMembersInvolved(infoDto.getTeamMembersInvolved());
        return serviceInfo;
    }
}


