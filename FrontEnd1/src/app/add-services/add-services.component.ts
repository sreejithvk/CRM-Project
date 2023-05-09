import { Component, OnInit } from '@angular/core';
import { Services } from '../services';
import { ServiceService } from '../service.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-services',
  templateUrl: './add-services.component.html',
  styleUrls: ['./add-services.component.css']
})
export class AddServicesComponent implements OnInit {

  service: Services = new Services();
  constructor(private serviceService: ServiceService,
    private router: Router){ }


  ngOnInit(): void {
    
  }

  saveService(){
    this.serviceService.createService(this.service).subscribe(data =>{
      console.log(data);
      this.goToServiceList();
    },
    error => console.log(error));
  }

  goToServiceList(){
    this.router.navigate(['/services']);

  }

  onSubmit(form: NgForm){
    console.log(this.service);
    if (form.valid){
      this.saveService();
      alert('Form submitted successfully!');
    }else{
    alert('Please enter all required fields.');
    }
  }

  
}
