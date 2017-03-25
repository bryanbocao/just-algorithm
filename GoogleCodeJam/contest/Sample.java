package googleCodeJam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		//BufferedReader br = new BufferedReader(new FileReader(new File("/Users/Bryan/Documents/workspace/top-1-algorithms/bin/googleCodeJam/qualificaionRound2016/problemA/A-small-practice.in")));
		String dataFileName = new String("A-small-practice.in");
		BufferedReader br = new BufferedReader(new FileReader(getDataFile(dataFileName)));
		int t = br.read();
		System.out.println("line 18");
		for (int i = 1; i <= t; i++) {
			String inputLine = br.readLine();
			int input = Integer.valueOf(inputLine);
			System.out.println(input);
		}
		
		br.close();
	}
	
	private static File getDataFile(String dataFileName) {
		Path currentAbsolutePath = Paths.get(".").toAbsolutePath().normalize();
		File file = new File(Sample.class.getPackage().getName());
		StringBuilder packageSB = new StringBuilder();
		packageSB.append(currentAbsolutePath + "/src/");
		for (String dir : file.getName().split("\\.")) packageSB.append(dir + "/");
		packageSB.append(dataFileName);
		return new File(packageSB.toString());
	}
}