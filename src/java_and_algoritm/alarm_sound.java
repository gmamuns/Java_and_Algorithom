package java_and_algoritm;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class alarm_sound {

    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        File yourFile;
            
            AudioInputStream stream = null;
          
            AudioFormat format;
           
            DataLine.Info info;
            
            Clip clip;
        
        File file = new File("/home/mamuns/alarm.mp3");
        File fil = new File("alarm..mp3");
        System.out.println(file);
        try {
                 

           
            try {
                 stream = AudioSystem.getAudioInputStream(fil);
                
            } catch (Exception e) {
                 System.out.println("Line 33");
            }
           
            format = stream.getFormat();
            info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
            clip.start();
        } catch (Exception e) {
            System.out.println("Problem Occured");
        }
    }
}
