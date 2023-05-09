package com.cts.Service.management.module.api;

import com.cts.Service.management.module.dto.ServiceInfoDto;
import com.cts.Service.management.module.service.ServiceManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:60311")
@RequestMapping("/api/service")
public class ServiceManagementController {
    @Autowired
    private ServiceManagementService serviceManagementService;

    @PostMapping("/add")
    public ServiceInfoDto createService(@RequestBody final ServiceInfoDto serviceInfoDto) {

        return serviceManagementService.createService(serviceInfoDto);

    }

    @GetMapping("/view")
    public List<ServiceInfoDto> viewAllUsers() {

        return serviceManagementService.viewAllServices();
    }

    @PutMapping("/update/{serviceId}")
    public ServiceInfoDto updateService(@RequestBody final ServiceInfoDto serviceInfoDto, @PathVariable int serviceId) {
        return serviceManagementService.modifyServiceByServiceId(serviceId, serviceInfoDto);
    }

    @DeleteMapping("/delete/{serviceId}")
    public void deleteServiceByServiceId(@PathVariable(name = "serviceId") final int serviceId) {
        serviceManagementService.deleteServiceByServiceId(serviceId);
    }

  /*  @PostMapping("/book/{serviceId}")
    public  void bookServiceByServiceId(@PathVariable(name = "serviceId") final String serviceName) {
        return serviceManagementService.bookServiceByServiceId(serviceId, serviceInfoDto);
    }*/

}

