import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ServiceListComponent } from './service-list/service-list.component';
import { AddServicesComponent } from './add-services/add-services.component';
import { UpdateServiceComponent } from './update-service/update-service.component';





@NgModule({
  declarations: [
    AppComponent,
    ServiceListComponent,
    AddServicesComponent,
    UpdateServiceComponent,
  
    
    

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
