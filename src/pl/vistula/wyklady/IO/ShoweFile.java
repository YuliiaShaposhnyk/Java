package pl.vistula.wyklady.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShoweFile {
    public static void main(String[] args) {
        FileInputStream first;
        int bajt;

        try{
            first = new FileInputStream("C://Java//p.txt");
        }catch (FileNotFoundException e){
            System.out.println("Nie znaleziono pliku o takiej nazwie");
            return;
        }

        try {
            do {
                bajt = first.read();
                if (bajt != -1)System.out.println((char) bajt);
            }while (bajt !=-1);
        }catch (IOException e){
            System.out.println("Blad odczytu pliku");
        }

        try{
           first.close();
        }catch (IOException e){
            System.out.println("Blad podczas zamykania pliku");
        }

    }
}
