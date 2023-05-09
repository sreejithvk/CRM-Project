import { Component,OnInit  } from '@angular/core';
import { Services } from '../services';
import { ServiceService } from '../service.service';
import { ActivatedRoute, Router} from '@angular/router';


@Component({
  selector: 'app-update-service',
  templateUrl: './update-service.component.html',
  styleUrls: ['./update-service.component.css']
})
export class UpdateServiceComponent implements OnInit {

  serviceId: number=0;
  updateMessage: string="";

  service: Services = new Services();
  constructor(private serviceService: ServiceService,
    private route: ActivatedRoute,
    private router: Router){ }

    ngOnInit(): void {
     this.serviceId = this.route.snapshot.params['serviceId'];

     
     
    }

    goToServiceList(){
      this.router.navigate(['/services']);
      
  
    }
    onSubmit(){
      console.log(this.service);
      this.serviceService.updateService(this.serviceId,this.service).subscribe(data =>{
        alert("Service updated successfully!");
        this.goToServiceList();

      },error => console.log(error));
      
    }
}
