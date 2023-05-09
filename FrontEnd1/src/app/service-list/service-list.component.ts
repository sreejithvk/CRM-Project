import { Component, OnInit } from '@angular/core';
import{ Services } from '../services'
import { ServiceService } from '../service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-service-list',
  templateUrl: './service-list.component.html',
  styleUrls: ['./service-list.component.css']
})
export class ServiceListComponent implements OnInit {

  services: Services[] = [];

  constructor(private serviceService: ServiceService, 
    private router: Router){ }

  ngOnInit(): void {
    this.getService();
  }
  private getService(){
    this.serviceService.getServiceList().subscribe(data => {
      this.services = data;
    });
  }
    // this.services = [{
    //   "serviceId": 101,
    //   "serviceName": "Login service",
    //   "estimatedDuration":2,
    //   "teamMembersInvolved":2,
    //   "serviceType":"New"
    // },
    // {
    //   "serviceId": 102,
    //   "serviceName": "Password service",
    //   "estimatedDuration":4,
    //   "teamMembersInvolved":2,
    //   "serviceType":"Existing"
    // } ];
  
    updateService(serviceId:number){
      this.router.navigate(['update-service',serviceId]);

    }
    deleteeService(serviceId: number){
      this.serviceService.deleteeService(serviceId).subscribe(data =>{
        console.log(data);
        this.router.navigate(['services',serviceId]);
        this.getService();
      })
    }
    

}
