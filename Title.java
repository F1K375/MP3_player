import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class Tittle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends Actor
{
    /**
     * Act - do whatever the Tittle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Title(String judul){
        //int random = Greenfoot.getRandomNumber(40);
        //if(random == 1)
            //setImage(new GreenfootImage(judul, 25, Color.BLUE, Color.YELLOW));
        //else if(random == 5)
            setImage(new GreenfootImage(judul, 25, Color.WHITE, Color.BLACK));
        //else if(random == 15)
            //setImage(new GreenfootImage(judul, 25, Color.RED, Color.WHITE));
        //else if(random == 25)
            //setImage(new GreenfootImage(judul, 25, Color.BLACK, Color.BLACK));
        //else if(random == 13)
        //    setImage(new GreenfootImage(judul, 25, Color.YELLOW, Color.BLUE));
        //else if(random == 10)
        //    setImage(new GreenfootImage(judul, 25, Color.GREEN, Color.BLACK));
        //else if(random == 20)
        //    setImage(new GreenfootImage(judul, 25, Color.ORANGE, Color.GREEN));
        //else
        //    setImage(new GreenfootImage(judul, 25, Color.WHITE, Color.BLACK));
    }
    
    public void act(){
        Backstage bg = (Backstage)getWorld();
        if(bg.Courage.isPlaying()||bg.Future.isPlaying()||bg.We_are.isPlaying()
        ||bg.Story.isPlaying()||bg.Silhouette.isPlaying()){
        setLocation(getX()-10,getY());
        if(getX()==-75)
            setLocation(495, getY());}
        else
            setLocation(getX(),getY());
            
    }
}
