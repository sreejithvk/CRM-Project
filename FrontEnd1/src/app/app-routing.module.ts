import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ServiceListComponent } from './service-list/service-list.component';
import { AddServicesComponent } from './add-services/add-services.component';
import { UpdateServiceComponent } from './update-service/update-service.component';




const routes: Routes = [
  {path: 'services', component:ServiceListComponent},
  {path: 'create-services',component:AddServicesComponent},
  {path:'',redirectTo:'services',pathMatch:'full'},
  {path:'update-service/:serviceId',component:UpdateServiceComponent},
  
  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
