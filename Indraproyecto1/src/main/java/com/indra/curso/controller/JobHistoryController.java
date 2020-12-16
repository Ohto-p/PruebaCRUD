package com.indra.curso.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.indra.curso.entity.Jobhistory;

public interface JobHistoryController {
	//C
		public String creatJobHistory(Jobhistory jobhistoryNew);
		//R
		public List<Jobhistory> findallJobHistory();
		public Optional<Jobhistory> findByIdJobHisotry(Date startdate, Integer employeeid );
		//U
		public String updatejobHistory(Jobhistory jobhistoryUpdate);
		//D
		public String deletejobHistory(Date startdate, Integer employeeid);
}
