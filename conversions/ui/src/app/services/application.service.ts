import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  	providedIn: 'root'
})
export class ApplicationService {
	constructor(private http: HttpClient) { }

	getSquareMiles(squarekilometers) {
	    return this.http.get("/api/v1/conversions/squarekilometerstosquaremiles/"+squarekilometers);
	}
	
	getSquareKilometers(squaremiles) {
	    return this.http.get("/api/v1/conversions/squaremilestosquarekilometers/"+squaremiles);
	}
	
	getMiles(kilometers) {
	    return this.http.get("/api/v1/conversions/kilometerstomiles/"+kilometers);
	}
	
	getKilometers(miles) {
	    return this.http.get("/api/v1/conversions/milestokilometers/"+miles);
	}
	
	getKilograms(pounds) {
	    return this.http.get("/api/v1/conversions/poundstokilograms/"+pounds);
	}
	
	getPounds(kilograms) {
	    return this.http.get("/api/v1/conversions/kilogramstopounds/"+kilograms);
	}
	
	getCelsius(kelvin) {
	    return this.http.get("/api/v1/conversions/kelvintocelsius/"+kelvin);
	}
	
	getKelvin(celsius) {
	    return this.http.get("/api/v1/conversions/celsiustokelvin/"+celsius);
	}
	
	getLiters(milliliters) {
	    return this.http.get("/api/v1/conversions/milliliterstoliters/"+milliliters);
	}
	
	getMilliliters(liters) {
	    return this.http.get("/api/v1/conversions/literstomilliliters/"+liters);
	}
	
}
