
import { Component, OnInit, Input } from '@angular/core';
import { ApplicationService } from './services/application.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'UI';
  
  squaremiles = "";
  squarekilometers = "";
  miles = "";
  kilometers = "";
  kilograms = "";
  pounds = "";
  celsius = "";
  kelvin = "";
  liters = "";
  milliliters = "";
  
  squarekilometers_msg:string;
  squaremiles_msg:string;
  miles_msg:string;
  kilometers_msg:string;
  kilograms_msg:string;
  pounds_msg:string;
  celsius_msg:string;
  kelvin_msg:string;
  liters_msg:string;
  milliliters_msg:string;

  constructor(private applicationService: ApplicationService) {
  }

  ngOnInit() {
    
  }

  clickEventSquareKilometers(){
    	this.applicationService.getSquareMiles(this.squarekilometers_msg).subscribe((response: any) => {
          	this.squaremiles = response;
        })
  }
  
  clickEventSquareMiles(){
	  this.applicationService.getSquareKilometers(this.squaremiles_msg).subscribe((response: any) => {
	    	this.squarekilometers = response;
	  })
  }
  
  clickEventKilometers(){
	  this.applicationService.getMiles(this.kilometers_msg).subscribe((response: any) => {
	    	this.miles = response;
	  })
  }
  
  clickEventMiles(){
	  this.applicationService.getKilometers(this.miles_msg).subscribe((response: any) => {
	    	this.kilometers = response;
	  })
  }
  
  clickEventKilograms(){
	  this.applicationService.getPounds(this.kilograms_msg).subscribe((response: any) => {
	    	this.pounds = response;
	  })
  }
  
  clickEventPounds(){
	  this.applicationService.getKilograms(this.pounds_msg).subscribe((response: any) => {
	    	this.kilograms = response;
	  })
  }
  
  clickEventCelsius(){
	  this.applicationService.getKelvin(this.celsius_msg).subscribe((response: any) => {
	    	this.kelvin = response;
	  })
  }
  
  clickEventKelvin(){
	  this.applicationService.getCelsius(this.kelvin_msg).subscribe((response: any) => {
	    	this.celsius = response;
	  })
  }
  
  clickEventMilliliters(){
	  this.applicationService.getLiters(this.milliliters_msg).subscribe((response: any) => {
	    	this.liters = response;
	  })
  }
  
  clickEventLiters(){
	  this.applicationService.getMilliliters(this.liters_msg).subscribe((response: any) => {
	    	this.milliliters = response;
	  })
  }
}
