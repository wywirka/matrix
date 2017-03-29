package com.epam.linear_system_solver.utils;

import java.io.File;
import java.io.IOException;

import com.epam.linear_system_solver.model.Equation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONEquationReader implements EquationReader {
	public EquationReader eqReader;

	public JSONEquationReader(EquationReader eqReader) {
		this.eqReader = eqReader;
	}

	public Equation readEquation() {
		ObjectMapper mapper = new ObjectMapper();
    	Equation eq = null;
		try {
			eq = mapper.readValue(new File("eq.json"), Equation.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return eq;
	}
	
	
}