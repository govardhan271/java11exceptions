package com.dailycode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourceExample {
	
	public static void tryWithResource() {// throws IOException{
        try(FileInputStream in = new FileInputStream("C:\\Users\\LOMADRED\\OneDrive - Capgemini\\Desktop\\dailylearn\\KafkaCommands.txt");
                FileOutputStream out = new FileOutputStream("out.txt"))//Java will first close resource 2 and then resource 1
            {
                out.write(in.readAllBytes());
            }catch(IOException e) {
            	System.out.println(e.getMessage());
            }finally {
				//no need to close the resource
			}
	}

}
