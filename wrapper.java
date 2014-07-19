import java.io.*;
public class wrapper {
  public static void main(String args[]) {
    ProcessBuilder pb = new ProcessBuilder("/home/kevin/Documents/workspace/BashTest.sh");
    Process p = null;
	try {
		p = pb.start();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
    String line = null;
    try {
		while ((line = reader.readLine()) != null)
		{
		   System.out.println(line);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
