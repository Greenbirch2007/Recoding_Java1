
import java.io.File;


public class CreateDir{
	public static void main(String args[]) {
		String dirname = "/home/g/Recoding_Java1/TJ";
		File d  = new File(dirname);
		d.mkdirs();
	}
}
