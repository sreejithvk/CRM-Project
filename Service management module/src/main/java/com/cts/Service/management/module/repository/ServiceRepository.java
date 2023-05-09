package com.cts.Service.management.module.repository;

import com.cts.Service.management.module.domain.ServiceInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<ServiceInfo, Integer> {
    ServiceInfo findByServiceId(final int serviceId);
   // ServiceInfo.findByServiceName(final String serviceName);//
}
