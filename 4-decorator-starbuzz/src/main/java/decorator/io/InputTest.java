package decorator.io;

import java.io.*;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;
		InputStream in = null;
		try {
			in = new CodifyCesar(
					new BufferedInputStream(
						new FileInputStream("test.txt")));

			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) { in.close(); }
		}
	}
}
