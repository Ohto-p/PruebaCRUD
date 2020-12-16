package com.indra.curso.services;

import java.util.Date;
import java.util.List;

import com.indra.curso.entity.Jobhistory;

public interface JobhistoryServices {
	//C
	public String creatJobHistory(Jobhistory jobhistoryNew);
	//R
	public List<Jobhistory> findallJobHistory();
	public List<Jobhistory> findByIdJobHisotry( Integer employeeid );
	//U
	public String updatejobHistory(Jobhistory jobhistoryUpdate);
	//D
	public String deletejobHistory(Date startdate, Integer employeeid);
}
