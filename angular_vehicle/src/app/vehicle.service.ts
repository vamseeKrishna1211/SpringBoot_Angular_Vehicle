import { Injectable } from '@angular/core';
import { Http, Response, Headers } from '@angular/http';
import { Observable } from 'rxjs';
import { Vehicle } from './vehicle';
@Injectable()
export class VehicleService {
  private baseUrl: string = 'http://localhost:8080/api/vehicles';

  constructor(private http: Http) {
  }


  getAll(): Observable<Vehicle[]> {
     let vehicle$:any = this.http
      .get(`${this.baseUrl}/listall`, {headers: this.getHeaders()}).
      toPromise().then(res => res.json());
    return vehicle$;
  }

  save(vehicle: Vehicle[]): Observable<Response> {
    console.log('Saving person ' + JSON.stringify(vehicle));
    return this.http.post(`${this.baseUrl}/partial`, JSON.stringify(vehicle), {headers: this.getHeaders()});
  }

  saveAll(vehicles: Vehicle[]): Observable<Response> {
    console.log('Submitted person ' + JSON.stringify(vehicles));
    return this.http.post(`${this.baseUrl}/saveall`, JSON.stringify(vehicles), {headers: this.getHeaders()});
  }

  private getHeaders() {
    let headers = new Headers();
    headers.append('Accept', 'application/json');
    headers.append('Content-Type', 'application/json');
    headers.append('Access-Control-Allow-Origin','*')
    return headers;
  }
}

function mapVehicles(response: Response): Vehicle[] {
  return response.json().map(toVehicle);
}

function mapPerson(response: Response): Vehicle {
  return toVehicle(response.json());
}

function toVehicle(r: any): Vehicle {
  return r;
}
