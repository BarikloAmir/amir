package ceit.aut.ac.ir.utils;

import ceit.aut.ac.ir.model.Note;

import javax.tools.JavaFileManager;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileUtils {

    private static final String NOTES_PATH = "./notes/";

    //It's a static initializer. It's executed when the class is loaded.
    //It's similar to constructor
    static {
        boolean isSuccessful = new File(NOTES_PATH).mkdirs();
        System.out.println("Creating " + NOTES_PATH + " directory is successful: " + isSuccessful);
    }

    public static File[] getFilesInDirectory() {
        return new File(NOTES_PATH).listFiles();
    }


    public static String fileReader(File file) throws IOException {
        //TODO: Phase1: read content from file
        String input = "";
        FileInputStream fileInputStream = new FileInputStream(file);
        while (fileInputStream.available() > 0) {
            input += (char)fileInputStream.read();
        }
        fileInputStream.close();
        return input;
    }

    public static void fileWriter(String content) throws IOException {
        //TODO: write content on file
        try{

            String fileName = getProperFileName(content);

            String path = NOTES_PATH+fileName;
            System.out.println(path);
            FileWriter file = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(file);

            bw.write(content);
            bw.close();

            }
        catch (FileNotFoundException ex){
            Logger.getLogger(JavaFileManager.class.getName()).log(Level.SEVERE,null,ex);
        }
        catch (IOException ex){
            Logger.getLogger(JavaFileManager.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

    //TODO: Phase1: define method here for reading file with InputStream
    public static String readerBuffer(File file) throws FileNotFoundException {
        FileReader fr;
        String r="";
        try {
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()){
                r += br.readLine()+"\n";
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return r;
    }
    //TODO: Phase1: define method here for writing file with OutputStream

    public static void fileWriterStream(String content){
        try{

            String fileName = getProperFileName(content);

            String path = NOTES_PATH+fileName;
            System.out.println(path);
            FileWriter file = new FileWriter(path);
           // BufferedWriter bw = new BufferedWriter(file);
            file.write(content);
            file.close();
        }
        catch (FileNotFoundException ex){
            Logger.getLogger(JavaFileManager.class.getName()).log(Level.SEVERE,null,ex);
        }
        catch (IOException ex){
            Logger.getLogger(JavaFileManager.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    //TODO: Phase2: proper methods for handling serialization
    public static Note getNote (String content){
        String[] arrayInput =content.split("\n",3);
        System.out.println(arrayInput[0]);
        Note note =new Note(arrayInput[0],arrayInput[1],arrayInput[2]);
        return note;
    }

    public static void writeObject(String content){
        Note note = getNote(content);
        String path = NOTES_PATH+note.getTitle()+".ser";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(note);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String ObjectReader(File file)  {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Note note = (Note) objectInputStream.readObject();
            return note.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return "field";


    }

    private static String getProperFileName(String content) {
        int loc = content.indexOf("\n");
        if (loc != -1) {
            return content.substring(0, loc)+ "_new file.txt";
        }
        if (!content.isEmpty()) {
            return content+ "_new file.txt";
        }
        return System.currentTimeMillis() + "_new file.txt";
    }
}
