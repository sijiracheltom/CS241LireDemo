package edu.ucla.java.changefilename;

import java.io.File;

public class ChangeName {

	public static void main(String args[]) {

		File f[] = new File("F:\\UCLA\\Spring2012\\CS241B\\TermProject\\ImageDatabase\\UW\\leaflesstrees\\leaflesstrees").listFiles(); //files

		int len = f.length;

		for (int i=0;i<len; i++)

		{
			String name = f[i].getName();

			System.out.println(name);

			int j=name.indexOf('.');
			
			if(j < 0) continue;

			System.out.println(j);

			String newname = name.substring(0,j) + "_leaflesstrees" + name.substring(j,name.length()); 
			//String newname = "Yellowstone_" + name;

			System.out.println(newname);

			File newFileName = new File(f[i].getParentFile(), newname);

			System.out.println("newFileName="+newFileName);

			f[i].renameTo(newFileName);   

		}
	}

}
