package com.cloudtang.audio;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class PCMTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			byte[] data = FileUtils.readFileToByteArray(new File(
					"/Users/cloud/work/source/test.pcm"));
			byte[] wave_data = PCMHelper.PCM2Wave(data, 1, 44100, 16);
			FileUtils.writeByteArrayToFile(new File("/Users/cloud/work/source/test.wav"), wave_data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
