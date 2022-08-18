package com.rec.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rec.entity.Record;

@Service
public class RecordServiceImpl implements IRecordService {

	// Dummy List of Records

	List<Record> list = List.of(new Record(1L, "tatamotors@gmail.com", "Tata Motors", 1311L),
			new Record(1L, "mahindra@gmail.com", "Mahindra", 1311L),
			new Record(1L, "cts@gmail.com", "Cognizant", 1312L), new Record(1L, "tcs@gmail.com", "TCS", 1312L),
			new Record(1L, "Accenture@gmail.com", "Accenture", 1313L), new Record(1L, "it@gmail.com", "It", 1314L),
			new Record(1L, "jbl@gmail.com", "JBL", 1315L), new Record(1L, "infosys@gmail.com", "Infosys", 1316L),
			new Record(1L, "ibm@gmail.com", "IBM", 1317L), new Record(1L, "mercedes@gmail.com", "Tata Motors", 1318L),
			new Record(1L, "suzui@gmail.com", "SUZUKI", 1319L));

	@Override
	public List<Record> getRecordOfEmployee(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(record -> record.geteId().equals(id)).collect(Collectors.toList());
	}

}
