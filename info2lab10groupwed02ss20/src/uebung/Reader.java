package uebung;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Reader {
    public Reader(){

    }

    /*public String lesen(Path path){
        String fileLine = "";
        String s = null;
        try(BufferedReader reader = Files.newBufferedReader(path)){
            while((s = reader.readLine())!=null) {
                fileLine = fileLine+s+"\n";
                s = null;
            }
        }
        catch(IOException x){
            System.out.println("IO Error: "+x);
        }
        return fileLine;
    }

    public void schreiben(File file,String content, int i, Integer in){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(content+i+in);
        }catch (IOException e){
            System.err.println(e);
        }
    }*/
    public static int zeilenZaehlen(Path path){
        int counter = 0;

        try(BufferedReader reader = Files.newBufferedReader(path)){
            while((reader.readLine())!=null) {
                counter++;
            }
        }
        catch(IOException x){
            System.out.println("IO Error: "+x);
        }

        return counter;
    }

    public static void edgesZuweisen(Path path){
        String[] splittedLine;
        String[] splittedEdge;

        for(int i = 1; i < splittedLine.lenght; ++i){
            splittedEdge = splittedLine[i].split(",");
            e = new Edge(splittedEdge[0], splittedEdge[1]); // assuming your Edgehas a constructor that takes the destination station and the cost
            n.addEdge(e);
        }
    }
}

