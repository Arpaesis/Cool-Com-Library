package com.armada.test;

import java.util.Scanner;

import com.armada.CommandManager;

public class Main
{

	private static final CommandManager<String, String> manager = new CommandManager<>();

	public static void main(String[] arguments)
	{

		manager.setPrefix("!");
		manager.register(new ResponsiveCommand());
		manager.register(new SpawnEntityCommand());
		manager.register(new ToggleDownfallCommand());
		manager.register(new AddRoleCommand());
		manager.register(new AverageCommand());
		manager.register(new TimeCommand());

		Scanner scanner = new Scanner(System.in);

		String in;
		do
		{
			in = scanner.nextLine();

			manager.execute(new String(), in);
		}
		while (!in.equalsIgnoreCase("END"));

		scanner.close();
	}
}
