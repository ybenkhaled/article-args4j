package lan.ybenkhaled;

import java.util.List;

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.Option;

public class CommandLineOptions {

	@Option(name = "-n", usage = "Name of the application", metaVar = "String", aliases = "--name", required = true)
	private String name;

	@Option(name = "-s", usage = "Override the default separator", metaVar = "String", aliases = "--separator")
	private String separator = "\n";

	@Option(name = "-d", usage = "Display or not the configuration", aliases = "--display")
	private boolean display;

	@Option(name = "-i", usage = "Number of integers", metaVar = "int", aliases = "--integer", multiValued = true)
	private List<Integer> integers;

	@Option(name = "-c", usage = "Definition of a complex type", aliases = "--complex", handler = ComplexHandler.class)
	private Complex complex;

	@Argument(index = 0)
	private String argument1;

	@Argument(index = 1)
	private String argument2;

	@Argument(index = 2)
	private List<String> arguments;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeparator() {
		return separator;
	}

	public void setSeparator(String separator) {
		this.separator = separator;
	}

	public boolean isDisplay() {
		return display;
	}

	public void setDisplay(boolean display) {
		this.display = display;
	}

	public List<Integer> getIntegers() {
		return integers;
	}

	public void setIntegers(List<Integer> integers) {
		this.integers = integers;
	}

	public Complex getComplex() {
		return complex;
	}

	public void setComplex(Complex complex) {
		this.complex = complex;
	}

	public String getArgument1() {
		return argument1;
	}

	public void setArgument1(String argument1) {
		this.argument1 = argument1;
	}

	public String getArgument2() {
		return argument2;
	}

	public void setArgument2(String argument2) {
		this.argument2 = argument2;
	}

	public List<String> getArguments() {
		return arguments;
	}

	public void setArguments(List<String> arguments) {
		this.arguments = arguments;
	}

	@Override
	public String toString() {
		return "CommandLineOptions [name=" + name + " " + separator + " integers=" + integers + " " + separator + " complex=" + complex + " " + separator + " argument1="
				+ argument1 + " " + separator + " argument2=" + argument2 + " " + separator + " arguments=" + arguments + "]";
	}

}
