import { Component } from '@angular/core';
import {VehicleService} from './vehicle.service';
import { Vehicle } from './vehicle';
import { Http } from '@angular/http';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  vehicles: Vehicle[] = [];
   errorMessage: string = '';
  response: any;
  saveAll:boolean=false;
  
 // constructor(private http: Http) { }
 constructor(private vehicleService: VehicleService) { }

   ngOnInit() :void {
   this.getAll();
  }
  getAll(){
    this.vehicleService.getAll().subscribe( v=> this.vehicles = v);
  }

  submitVehicle(){
    if(this.saveAll){
      this.vehicleService.save(this.vehicles).subscribe(p => this.response = p,
                                                        e => this.errorMessage = e._body);
    } else{
      this.vehicleService.saveAll(this.vehicles).subscribe(p => this.response = p,
                                                        e => this.errorMessage = e._body);
    }
    
  }

  model = new Vehicle('Ford','Focus' , 'F365', 'car');
 newVechile:Vehicle;
 
  submitted = false;

  onSubmit() { this.submitted = true; }

  newVehicle() {
    this.newVechile = new Vehicle(this.model.vehicleName,this.model.color,this.model.vehicleModel,this.model.vehicleType);
    console.log(this.newVechile);
    this.vehicles.push(this.newVechile);
 }
 changeChckBox(){
   this.saveAll = !this.saveAll;
  
 }
}

