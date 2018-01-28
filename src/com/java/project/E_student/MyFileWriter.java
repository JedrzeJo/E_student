package com.java.project.E_student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MyFileWriter {
    private Map<String, BufferedWriter> stringBufferedWriterMap= new HashMap<>();
    private BufferedWriter bw;


    public void saveToFile(Savable s){
        File output = new File(s.getFileName());
        try {
            bw = new BufferedWriter(new FileWriter(output, true));
            List<String> dataToSave=s.getDataToSave();
            for (String data: dataToSave) {
                bw.write(data);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something's wrong with file "+s.getFileName());
        }
    }

    public void close(){
        if(bw!=null){
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
