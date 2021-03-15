
import { Component, OnInit } from '@angular/core';
import { ApplicationService } from './services/application.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'UI';
  
  squaremiles = {};
  squarekilometers = {};
  miles = {};
  kilometers = {};
  kilograms = {};
  pounds = {};
  celsius = {};
  kelvin = {};
  liters = {};
  milliliters = {};

  constructor(private applicationService: ApplicationService) {
  }

  ngOnInit() {
    this.applicationService.getSquareMiles(1).subscribe((response: any) => {
      	this.squaremiles = response;
    })
    
    this.applicationService.getSquareKilometers(1).subscribe((response: any) => {
      	this.squarekilometers = response;
    })
    
    this.applicationService.getMiles(1).subscribe((response: any) => {
      	this.miles = response;
    })
    
    this.applicationService.getKilometers(1).subscribe((response: any) => {
      	this.kilometers = response;
    })
    
    this.applicationService.getPounds(1).subscribe((response: any) => {
      	this.pounds = response;
    })
    
    this.applicationService.getKilograms(1).subscribe((response: any) => {
      	this.kilograms = response;
    })
    
    this.applicationService.getKelvin(0).subscribe((response: any) => {
      	this.kelvin = response;
    })
    
    this.applicationService.getCelsius(0).subscribe((response: any) => {
      	this.celsius = response;
    })
    
    this.applicationService.getLiters(1).subscribe((response: any) => {
      	this.liters = response;
    })
    
    this.applicationService.getMilliliters(1).subscribe((response: any) => {
      	this.milliliters = response;
    })
  }
}
