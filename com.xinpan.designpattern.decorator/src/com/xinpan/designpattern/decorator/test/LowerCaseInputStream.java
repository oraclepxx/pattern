package com.xinpan.designpattern.decorator.test;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream in) {
		super(in);
	}

	public int read() throws IOException {
		int ch = super.read();
		if (ch == -1) {
			return ch;
		}
		return Character.toLowerCase((char) ch);
	}

	public int read(byte[] b, int offset, int len) throws IOException {
		int res = super.read(b, offset, len);
		for (int i = res; i < res + offset; i++) {
			b[i] = (byte) Character.toLowerCase((char) b[i]);
		}
		return res;
	}

}
