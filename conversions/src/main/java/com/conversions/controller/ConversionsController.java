package com.conversions.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conversions.service.AreaService;
import com.conversions.service.LengthService;
import com.conversions.service.MassService;
import com.conversions.service.TemperatureService;
import com.conversions.service.VolumeService;



@RestController
@RequestMapping("/api/v1/conversions")
public class ConversionsController {  
	
	private final AreaService areaService;
	private final LengthService lengthService;
	private final MassService massService;
	private final TemperatureService temperatureService;
	private final VolumeService volumeService;
	
	@Autowired
	public ConversionsController(AreaService areaService, LengthService lengthService, MassService massService, TemperatureService temperatureService, VolumeService volumeService) {
		this.areaService = areaService;
		this.lengthService = lengthService;
		this.massService = massService;
		this.temperatureService = temperatureService;
		this.volumeService = volumeService;
	} 
	
	@GetMapping("/squarekilometerstosquaremiles/{squarekilometers}")
	public ResponseEntity<Double> getSquareMiles(@PathVariable("squarekilometers") Double squarekilometers) {
		return new ResponseEntity<>(areaService.squarekilometerstosquaremiles(squarekilometers), HttpStatus.OK);
	}
	
	@GetMapping("/squaremilestosquarekilometers/{squaremiles}")
	public ResponseEntity<Double> getSquareKilometers(@PathVariable("squaremiles") Double squaremiles) {
		return new ResponseEntity<>(areaService.squaremilestosquarekilometers(squaremiles), HttpStatus.OK);
	}
	
	@GetMapping("/milestokilometers/{miles}")
	public ResponseEntity<Double> getKilometers(@PathVariable("miles") Double miles) {
		return new ResponseEntity<>(lengthService.milestokilometers(miles), HttpStatus.OK);
	}
	
	@GetMapping("/kilometerstomiles/{kilometers}")
	public ResponseEntity<Double> getMiles(@PathVariable("kilometers") Double kilometers) {
		return new ResponseEntity<>(lengthService.kilometerstomiles(kilometers), HttpStatus.OK);
	}
	
	@GetMapping("/kilogramstopounds/{kilograms}")
	public ResponseEntity<Double> getKilograms(@PathVariable("kilograms") Double kilograms) {
		return new ResponseEntity<>(massService.kilogramstopounds(kilograms), HttpStatus.OK);
	}
	
	@GetMapping("/poundstokilograms/{pounds}")
	public ResponseEntity<Double> getPounds(@PathVariable("pounds") Double pounds) {
		return new ResponseEntity<>(massService.poundstokilograms(pounds), HttpStatus.OK);
	}
	
	@GetMapping("/kelvintocelsius/{kelvin}")
	public ResponseEntity<Double> getCelsius(@PathVariable("kelvin") Double kelvin) {
		return new ResponseEntity<>(temperatureService.kelvintocelsius(kelvin), HttpStatus.OK);
	}
	
	@GetMapping("/celsiustokelvin/{celsius}")
	public ResponseEntity<Double> getKelvin(@PathVariable("celsius") Double celsius) {
		return new ResponseEntity<>(temperatureService.celsiustokelvin(celsius), HttpStatus.OK);
	}
	
	@GetMapping("/milliliterstoliters/{milliliters}")
	public ResponseEntity<Double> getMilliliter(@PathVariable("milliliters") Double milliliters) {
		return new ResponseEntity<>(volumeService.milliliterstoliters(milliliters), HttpStatus.OK);
	}
	
	@GetMapping("/literstomilliliters/{liters}")
	public ResponseEntity<Double> getLiter(@PathVariable("liters") Double liters) {
		return new ResponseEntity<>(volumeService.literstomilliliters(liters), HttpStatus.OK);
	}
}
