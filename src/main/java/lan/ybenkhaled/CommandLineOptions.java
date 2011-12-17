package lan.ybenkhaled;

import java.util.List;

import org.kohsuke.args4j.Option;

public class CommandLineOptions {

	@Option(name = "-n", usage = "Name of the program", metaVar = "String", aliases = "--name", required = true)
	private String name;

	@Option(name = "-s", usage = "Override the default character separator", metaVar = "String", aliases = "--separator")
	private String separator = "\n";

	@Option(name = "-d", usage = "Display or not the configuration", aliases = "--display")
	private boolean display;

	@Option(name = "-i", usage = "Number of integers", metaVar = "int", aliases = "--integer", multiValued = true)
	private List<Integer> integers;

	@Option(name = "-c", usage = "Definition of a complex type", aliases = "--complex", handler = ComplexHandler.class)
	private Complex complex;

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

	@Override
	public String toString() {
		return "CommandLineOptions [name=" + name + " " + separator + " integers=" + integers + " " + separator + " complex=" + complex + "]";
	}

}
