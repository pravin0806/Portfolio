package com.fileprocessing;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.Part;

public class FileIoImp implements FileIo {
private String result;
	@SuppressWarnings("finally")
	@Override
	public String deleteProject(String filename) {

		try 
		{
			String path ="C:\\Users\\Admin\\Desktop\\advjava\\portfolio\\WebContent\\mydata\\project\\"+ filename;
			boolean delete = new File(path).delete();
			if(delete==true)
			{
				result="deleted";
			}
			else
			{
				result="failed";
			}
		} catch (Exception e) {
			System.out.println("FileIOImp->deleteProject "+e);
			result="failed";
		}
		finally
		{
			return result;
		}
	}
	@Override
	public String uploadResume(String filename, Part part) {
		
		try
		{
		byte[] b = part.getInputStream().readAllBytes();
		String path="C:\\Users\\Admin\\Desktop\\advjava\\portfolio\\WebContent\\mydata\\resume//"+filename;
		FileOutputStream fos = new FileOutputStream(path);
		fos.write(b);
		result="uploaded";
		}
		catch(Exception e)
		{
			System.out.println("FileIOImp->uploadProject "+e);
			result="exp";
		}
		finally {
			return result;
		}
	}

}
