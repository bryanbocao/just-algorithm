package googleCodeJam2016.qualificaionRound2016.problemA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class A {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		String dataFileName = new String("A-large-practice");
		String currentPackagePath = getCurrentPackagePath();
		BufferedReader br = new BufferedReader(new FileReader(new File(currentPackagePath + dataFileName + ".in")));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(currentPackagePath + dataFileName + ".txt")));
		
		int t = Integer.parseInt(br.readLine());
		System.out.println("Test cases number: " + t);
		for (int ti = 1; ti <= t; ti++) {
			String inputLine = br.readLine();
			int input = Integer.valueOf(inputLine);
			StringBuilder output = new StringBuilder("Case #" + ti + ": ");
			
			//start - main algorithm
			if (input == 0) 
				output.append("INSOMNIA");
			else {
				Set<Character> set = new HashSet<Character>();
				int i = 0;
				while (set.size() < 10) {
					Integer digits = (i == 0) ? input : input * i;
					char[] ds = digits.toString().toCharArray();
					for (int dsi = 0; dsi < ds.length; dsi++) {
						if (!set.contains(ds[dsi])) set.add(ds[dsi]);
					}
					i++;
				}
				i--;
				if (i > 0) output.append(input * i);
				else output.append(input);
			}
			//end - main algorithm
			
			bw.write(output.toString());
			bw.newLine();
		}
		
		System.out.println("Done");
		
		br.close();
		bw.close();
	}
	
	private static String getCurrentPackagePath() {
		Path currentAbsolutePath = Paths.get(".").toAbsolutePath().normalize();
		File file = new File(A.class.getPackage().getName());
		StringBuilder packageSB = new StringBuilder();
		packageSB.append(currentAbsolutePath + "/src/");
		for (String dir : file.getName().split("\\.")) packageSB.append(dir + "/");
		return packageSB.toString();
	}
}
//CodingDuration: 19m51s96 Small&LargeInput Correct
