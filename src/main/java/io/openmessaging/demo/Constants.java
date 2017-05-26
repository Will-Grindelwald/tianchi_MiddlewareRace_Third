package io.openmessaging.demo;

public class Constants {
	public static final int BUFFER_SIZE = 20 * 1024 * 1024;

	public static final int LOG_FILE_SIZE = 100 * 1024 * 1024;

	public static final int INDEX_SIZE = 14; // 6 + 4 + 4
	public static final int INDEX_WRITE_BUFFER_SIZE = INDEX_SIZE * 1024 * 1024;
	
	public static final int BYTE_SIZE = 3 * BUFFER_SIZE;
	public static final int HALFBYTESIZE = BYTE_SIZE / 2;

}
