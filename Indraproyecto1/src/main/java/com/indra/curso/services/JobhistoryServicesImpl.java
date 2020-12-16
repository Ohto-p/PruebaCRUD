package com.indra.curso.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.curso.entity.Jobhistory;
import com.indra.curso.repository.JobHistoryRepository;

@Service
public class JobhistoryServicesImpl implements JobhistoryServices {

	@Autowired
	JobHistoryRepository jobhistoryRepository;
	
	@Override
	public String creatJobHistory(Jobhistory jobhistoryNew) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Jobhistory> findallJobHistory() {
		return jobhistoryRepository.findAll();
	}

	@Override
	public List<Jobhistory> findByIdJobHisotry(Integer employeeid) {
		return null;		
	}

	@Override
	public String updatejobHistory(Jobhistory jobhistoryUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletejobHistory(Date startdate, Integer employeeid) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
