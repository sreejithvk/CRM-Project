import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Services } from './services';


@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  private baseURL = "http://localhost:8787/api/service";
  constructor(private httpClient:HttpClient) { }

  getServiceList(): Observable<Services[]>{
    return this.httpClient.get<Services[]>(`${this.baseURL}/view`);
  }

  createService(service: Services): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}/add`,service);
  }

  

  updateService(serviceId: number,service: Services): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/update/${serviceId}`,service);
  }

  deleteeService(serviceId: number): Observable<object>{
    return this.httpClient.delete(`${this.baseURL}/delete/${serviceId}`);
  }
  
  
}
