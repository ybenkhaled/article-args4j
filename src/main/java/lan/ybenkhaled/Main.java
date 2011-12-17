package lan.ybenkhaled;

import static org.kohsuke.args4j.ExampleMode.ALL;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

public class Main {

	public static void main(String[] args) {

		CommandLineOptions cliOpts = new CommandLineOptions();
		CmdLineParser parser = new CmdLineParser(cliOpts);

		try {
			parser.parseArgument(args);

		} catch (CmdLineException e) {
			System.err.println(e.getMessage() + "\n");
			parser.printUsage(System.err);
			System.err.println("\n\tExample: Main " + parser.printExample(ALL));
			System.exit(0);
		}

		if (cliOpts.isDisplay())
			System.out.println(cliOpts);
	}

}
