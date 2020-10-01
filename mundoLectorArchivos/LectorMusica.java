package mundoLectorArchivos;

import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/*
 * Clase que lee las canciones
 */
public class LectorMusica implements AudioClip {
    
    Clip sound;
    AudioInputStream aS;
    String songName;
    
    /*metodo para leer musica
     * excepciones  try- catch
     */
    
    public LectorMusica(){
        
        try{
            sound = AudioSystem.getClip();
        }
        catch(LineUnavailableException e1){
            System.out.print("Error 1");
        }
    }
    
   /*metodo para iniciar la cancion y ubicacion de cancion
    * try- catch exception 
    */
    public void inicializarClip(String ubicacion){
        try{
            aS= AudioSystem.getAudioInputStream(new File(ubicacion));
            sound.open(aS);
            sound.setFramePosition(0);
        }
        catch(LineUnavailableException e1){
            System.out.print("Error 1");
        }
        catch(UnsupportedAudioFileException e2){
             System.out.print("Archivo  no soportado");
        }
        catch(IOException e3){
            System.out.print("No se encontro el archivo");
        }
    }
    
    
       
    @Override
    /*
     * (non-Javadoc)
     * @see java.applet.AudioClip#play()
     */
    public void play() {
        sound.start();
    }

    @Override
    /*
     * (non-Javadoc)
     * @see java.applet.AudioClip#loop()
     */
    public void loop() {
        sound.loop(10);
    }

    @Override
    /*
     * (non-Javadoc)
     * @see java.applet.AudioClip#stop()
     */
    public void stop() {
        sound.stop();
        sound.close();
    }
     
}