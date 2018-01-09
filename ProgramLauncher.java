import java.util.Arrays;
import java.util.Scanner;

/**
 * Main entry to program.
 */
public class ProgramLauncher {

	public static void main(String argv[]) {
		System.out.println(":: PROGRAM START");
		String filepath = "db.properties";
		if (!filepath.isEmpty()) {
			BankingSystem.init(filepath);
			BankingSystem.testConnection();
			BankingSystem.createTables();
			BatchInputProcessor.run(filepath);
		}
	}
}

