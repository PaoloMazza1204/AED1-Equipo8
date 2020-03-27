package TA3;

import java.io.*;

public class ContadorLineas {
    public String[] obtenerLineas(String path) {
        try {
            int cont = 0;
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                cont += 1;
            }
            String[] lines = new String[cont];
            for (int i = 0; line != null; i++) {
                lines[i] = line;
                line = br.readLine();
            }
            fr.close();
            br.close();
            return lines;
        }
        catch(FileNotFoundException e) {
            System.out.println("Could not find the file " + path);
            e.printStackTrace();
        }
        catch(IOException e) {
            System.out.println("Error at opening the file " + path);
            e.printStackTrace();
        }
        String[] r = {""};
        return r;
    }    
}