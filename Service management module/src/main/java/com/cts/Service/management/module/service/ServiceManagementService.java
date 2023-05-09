package com.cts.Service.management.module.service;

import com.cts.Service.management.module.domain.ServiceInfo;
import com.cts.Service.management.module.dto.ServiceInfoDto;
import com.cts.Service.management.module.mapper.ServiceInfoMapper;
import com.cts.Service.management.module.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceManagementService {
    @Autowired
    private ServiceRepository serviceRepository;

    @Autowired
    private ServiceInfoMapper infoMapper;

    public ServiceInfoDto createService(ServiceInfoDto serviceInfoDto) {
        ServiceInfo serviceInfo = infoMapper.mapToDomain(serviceInfoDto);

        ServiceInfo savedObject = serviceRepository.saveAndFlush(serviceInfo);

        return infoMapper.mapToDto(savedObject);
    }

    public List<ServiceInfoDto> viewAllServices() {
        List<ServiceInfo> serviceInfoList = serviceRepository.findAll();
        List<ServiceInfoDto> serviceInfoDtos = new ArrayList<>();

        for (ServiceInfo serviceInfo : serviceInfoList) {
            ServiceInfoDto dto = infoMapper.mapToDto(serviceInfo);
            serviceInfoDtos.add(dto);
        }
        return serviceInfoDtos;
    }





    public ServiceInfoDto modifyServiceByServiceId(int serviceId, final ServiceInfoDto serviceInfoDto) {
        ServiceInfo serviceInfo = serviceRepository.findByServiceId(serviceId);
        if(serviceInfo!=null) {
            ServiceInfo modifiedobject = infoMapper.modifyDomainObject(serviceInfoDto, serviceInfo);

            return infoMapper.mapToDto(serviceRepository.saveAndFlush(modifiedobject));
        }else
            return null;
    }

    public void  deleteServiceByServiceId(int serviceId) {
        System.out.println(serviceId);
        ServiceInfo serviceInfo = serviceRepository.findByServiceId(serviceId);
        System.out.println(serviceInfo.toString());
        serviceRepository.delete(serviceInfo);


    }
   /* public void bookServiceByServiceId(int serviceId,final ServiceInfoDto serviceInfoDto) {
        ServiceInfo serviceInfo = serviceRepository.findByServiceId(serviceId);

        return infoMapper.mapToDto(serviceRepository.saveAndFlush(bookedobject));
    }*/

}
