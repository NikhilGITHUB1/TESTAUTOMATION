package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProcessUtils {
	
	public static void execute(String path, String waitForExpectedMessage) {
        execute(path, waitForExpectedMessage, false);
    }
 
    public static void execute(String path, boolean waitForCompletion) {
        execute(path, null, waitForCompletion);
    }
 
    private static void execute(String path, String waitForExpectedMessage, boolean waitForCompletion) {
 
        try {
            Runtime rt = Runtime.getRuntime();
            Process proc = rt.exec(path);
 
            if (waitForCompletion) {
                proc.waitFor();
            }
 
            StringBuffer output = new StringBuffer();
            BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line = "";
            while ((line = reader.readLine())!= null
                    && (waitForExpectedMessage != null && !line.contains(waitForExpectedMessage))) {
                output.append(line + "\n");
                System.out.println(line);
            }
 
            output.append(line + "\n");
 
            // To Debug
            if (line != null) {
                System.out.println("### " + output);
            }
 
        } catch (Throwable t) {
            t.printStackTrace();
        }
 
    }
 
 


}
