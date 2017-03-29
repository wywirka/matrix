package com.epam.linear_system_solver.view.menu;

import com.epam.linear_system_solver.utils.ConsoleEquationReader;

public class ConsoleInputCommand implements Command {

	public ConsoleInputCommand() {}

	public void execute() {
		new ConsoleEquationReader().readEquation();
	}

}
