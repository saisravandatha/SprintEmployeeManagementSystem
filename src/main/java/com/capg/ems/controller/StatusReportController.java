package com.capg.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.ems.entities.StatusReport;
import com.capg.ems.service.StatusReportServiceimpl;

@RestController
@RequestMapping(value = "StatusReport")
@CrossOrigin("http://localhost:4200")
public class StatusReportController {
	@Autowired
	private StatusReportServiceimpl service;

	// Adding StatusReport into status_report table
	@PostMapping(path = "/add")
	public ResponseEntity<Boolean> addStatusReport(@RequestBody StatusReport statusreport) {
		service.addStatusReport(statusreport);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;
	}

	//To get all the Statusreports from status_report table
	@GetMapping(path = "/getAll")
	public ResponseEntity<List<StatusReport>> getAllStatusReports() {
		List<StatusReport> list = service.getAllStatusReports();
		return new ResponseEntity<List<StatusReport>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	//getting count of records from the table
	@GetMapping("/count")
	public long counts() {
		return service.counts();
	}

	//updating status report in the status_reporttable 
	@PutMapping("/updateStatus")
	public String updateStatusReport(@RequestBody StatusReport statusreport) {
		service.updateStatusReport(statusreport);
		return "Status updated successfully";
	}

}
