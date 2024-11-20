/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineEvent;

/**
 *
 * @author david
 */
public class Musica {

    private Clip clip;
    private boolean isPlaying = false;

    public boolean isIsPlaying() {
        return this.isPlaying;
    }

    public void setIsPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public Musica(String filePath) {
        try {
            // Cargar el archivo de sonido
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.addLineListener(event -> {
                if (event.getType() == LineEvent.Type.STOP) {
                    if (isPlaying) {
                        clip.setFramePosition(0); // Reiniciar la posición del clip
                        clip.start(); // Volver a reproducir      
                    }
                }
            });

            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void play() {
        clip.start();
        clip.loop(0);// Iniciar la reproducción del sonido
        isPlaying = true;
    }

    public void stop() {
        clip.stop();
        //clip.setFramePosition(0);
        isPlaying = false;
    }

    public float getClipLevel() {
        if (clip != null) {
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            return (float) Math.pow(10.0, gainControl.getValue() / 20.0);
        }
        return 0.0f;
    }

    public void mute(boolean mute) {
        if (clip != null) {
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            if (mute) {
                gainControl.setValue(gainControl.getMinimum()); // Silenciar (volumen mínimo)
            } else {
                gainControl.setValue(0.0f); // Volver al volumen normal
            }
        }
    }

    public void setVolume(float volume) {
        if (clip != null) {
            // Ajustar el volumen (0.0f - 1.0f)
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(20f * (float) Math.log10(volume));
        }
    }
}
