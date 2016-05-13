package com.xavien.readFile;

import java.io.File;
import java.io.FileInputStream;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class ReadFile implements Job {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub

		File file = new File("D:\\interviewService\\fileTest.txt");
		FileInputStream fin = null;

		try {
			fin = new FileInputStream(file);
			byte fileContent[] = new byte[(int) file.length()];
			fin.read(fileContent);
			String s = new String(fileContent);
			System.out.println("File content: " + s);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
