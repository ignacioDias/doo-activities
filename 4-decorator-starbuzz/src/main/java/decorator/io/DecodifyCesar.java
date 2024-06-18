package decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DecodifyCesar extends FilterInputStream {
    public DecodifyCesar(InputStream in) {
        super(in);
    }
    public int read(int code) throws IOException {
        int c = in.read();
        return (c == -1 ? c : changeLetter(code, (char)c));
    }

    private static Character changeLetter(int code, char letter) {
        return (char) (letter - code);
    }
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);
        for (int i = offset; i < offset+result; i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}
