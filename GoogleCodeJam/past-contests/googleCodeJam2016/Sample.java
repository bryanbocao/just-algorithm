package googleCodeJam2016;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		String dataFileName = new String("A-small-practice");
		String currentPackagePath = getCurrentPackagePath();
		BufferedReader br = new BufferedReader(new FileReader(new File(currentPackagePath + dataFileName + ".in")));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(currentPackagePath + dataFileName + ".txt")));
		
		int t = br.read();
		
		for (int ti = 1; ti <= t; ti++) {
			String inputLine = br.readLine();
			int input = Integer.valueOf(inputLine);
			StringBuilder output = new StringBuilder("Case #" + ti + ": ");
			
			//start - main algorithm
			
			
			//end - main algorithm
			
			bw.write(output.toString());
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	private static String getCurrentPackagePath() {
		Path currentAbsolutePath = Paths.get(".").toAbsolutePath().normalize();
		File file = new File(Sample.class.getPackage().getName());
		StringBuilder packageSB = new StringBuilder();
		packageSB.append(currentAbsolutePath + "/src/");
		for (String dir : file.getName().split("\\.")) packageSB.append(dir + "/");
		return packageSB.toString();
	}
}