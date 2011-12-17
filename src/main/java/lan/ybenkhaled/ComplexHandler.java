package lan.ybenkhaled;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.OptionDef;
import org.kohsuke.args4j.spi.OptionHandler;
import org.kohsuke.args4j.spi.Parameters;
import org.kohsuke.args4j.spi.Setter;

public class ComplexHandler extends OptionHandler<Complex> {

	public ComplexHandler(CmdLineParser cmdLineParser, OptionDef optionDef, Setter<Complex> setter) {
		super(cmdLineParser, optionDef, setter);
	}

	public int parseArguments(Parameters parameters) throws CmdLineException {

		String numbersStr = parameters.getParameter(0);
		String[] numbers = numbersStr.split(",");
		setter.addValue(new Complex(1, 2));
		try {
			setter.addValue(new Complex(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1])));
			return 1;
		} catch (NumberFormatException e) {
			return 0;
		}

	}

	public String getDefaultMetaVariable() {
		return "\"int r, int i\"";
	}
}