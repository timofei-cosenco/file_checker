package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String args[]) {
        String space = (args[0]);
        File file = new File(space);
        File exit_file = new File(space + "\\exit.txt");
        String[] name_files = file.list();
        try(FileWriter writer = new FileWriter(exit_file,false)){
            for(int i =0; i< name_files.length; i++){
                writer.write(space + "\\" + name_files[i] + '\n');
            }
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
}