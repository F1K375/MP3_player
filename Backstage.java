import greenfoot.*;
import java.util.List;
/**
 * Write a description of class Backstage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Backstage extends World
{
    GreenfootSound Courage = new GreenfootSound("Courage - Haruka Tomatsu.mp3");
    GreenfootSound Future = new GreenfootSound ("Back- On Where is the future.mp3");
    GreenfootSound We_are = new GreenfootSound ("Back-On - We are.mp3");
    GreenfootSound Story = new GreenfootSound ("Kana Nishino-Story.mp3");
    GreenfootSound Silhouette = new GreenfootSound ("Silhouette - Kana Boon.mp3");
    GreenfootImage pause = new GreenfootImage ("pause.png");
    GreenfootImage play = new GreenfootImage ("play.png");
    GreenfootImage play_or_pause = play;
    public int playlist = 1; private PlayList List;
    private VolDown down; private VolUp up;
    private Stop stop; private Next next;
    private Previous previous; private PlayPause play_pause;
    private Song_Courage courage; private Song_Future future;
    private Song_We_are we_are;  private Song_Story story;
    private Song_Silhouette silhouette;
    private Title judul;
    private Box BOX;
    private Track TRACK;
    boolean cek = true;
    private enum Pilihan{Layout,Play}; private Pilihan pilih;
    int Volume = 50;
    public Backstage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1, false);
        Greenfoot.setSpeed(35);
        prepare();
    }
    
    private void Box0(){
        int[] BOX0 = {
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
        };CreateBox(BOX0);
    }
    
    private void Box1(){
        int[] BOX1 = {
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,2,1,1,1,1,1,2,1,1,1,1,1,0,
                0,1,2,1,2,1,1,1,2,1,2,1,1,1,1,1,0,
                0,1,2,1,2,1,1,1,2,1,2,1,1,1,1,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,1,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,1,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,1,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
        };CreateBox(BOX1);
    }
    
    private void Box2(){
        int[] BOX2 = {
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,0,
                0,1,1,1,2,1,1,1,1,1,1,1,1,1,2,1,0,
                0,1,1,1,2,1,1,1,1,1,1,1,1,1,2,1,0,
                0,1,2,1,2,1,1,1,1,1,1,1,1,1,2,1,0,
                0,1,2,1,2,1,1,1,1,1,1,1,1,1,2,1,0,
                0,1,2,1,2,1,1,1,1,1,1,1,1,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,1,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,1,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,1,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
        };CreateBox(BOX2);
    }
    
    private void Box3(){
        int[] BOX3 = {
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,2,1,1,1,2,1,1,1,2,1,1,1,0,
                0,1,1,1,2,1,1,1,2,1,1,1,2,1,1,1,0,
                0,1,1,1,2,1,2,1,2,1,2,1,2,1,1,1,0,
                0,1,1,1,2,1,2,1,2,1,2,1,2,1,1,1,0,
                0,1,1,1,2,1,2,1,2,1,2,1,2,1,1,1,0,
                0,1,1,1,2,1,2,1,2,1,2,1,2,1,1,1,0,
                0,1,1,1,2,1,2,1,2,1,2,1,2,1,1,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
        };CreateBox(BOX3);
    }
    
    private void Box4(){
        int[] BOX4 = {
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,2,1,1,1,1,1,1,1,1,1,2,1,1,1,0,
                0,1,2,1,1,1,1,1,1,1,1,1,2,1,1,1,0,
                0,1,2,1,1,1,1,1,1,1,1,1,2,1,1,1,0,
                0,1,2,1,1,1,1,1,1,1,1,1,2,1,2,1,0,
                0,1,2,1,1,1,1,1,1,1,1,1,2,1,2,1,0,
                0,1,2,1,2,1,1,1,2,1,1,1,2,1,2,1,0,
                0,1,2,1,2,1,1,1,2,1,1,1,2,1,2,1,0,
                0,1,2,1,2,1,1,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
        };CreateBox(BOX4);
    }
    
    private void Box5(){
        int[] BOX5 = {
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1,0,
                0,1,2,1,1,1,1,1,1,1,2,1,1,1,1,1,0,
                0,1,2,1,1,1,1,1,1,1,2,1,1,1,1,1,0,
                0,1,2,1,1,1,2,1,1,1,2,1,1,1,1,1,0,
                0,1,2,1,1,1,2,1,1,1,2,1,2,1,1,1,0,
                0,1,2,1,1,1,2,1,1,1,2,1,2,1,1,1,0,
                0,1,2,1,1,1,2,1,1,1,2,1,2,1,1,1,0,
                0,1,2,1,1,1,2,1,1,1,2,1,2,1,1,1,0,
                0,1,2,1,2,1,2,1,1,1,2,1,2,1,1,1,0,
                0,1,2,1,2,1,2,1,1,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,1,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
        };CreateBox(BOX5);
    }
    
    private void Box6(){
        int[] BOX6 = {
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,2,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,2,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,2,1,2,1,2,1,1,1,2,1,0,
                0,1,1,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,1,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
        };CreateBox(BOX6);
    }
    
    private void Box7(){
        int[] BOX7 = {
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,2,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,2,1,2,1,1,1,1,1,1,1,2,1,1,1,0,
                0,1,2,1,2,1,1,1,1,1,1,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,1,1,1,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
        };CreateBox(BOX7);
    }
    
    private void Box8(){
        int[] BOX8 = {
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
                0,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,0,
                0,1,1,1,1,1,1,1,1,1,2,1,1,1,2,1,0,
                0,1,2,1,1,1,1,1,1,1,2,1,2,1,2,1,0,
                0,1,2,1,1,1,2,1,1,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,1,1,2,1,2,1,2,1,0,
                0,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
        };CreateBox(BOX8);
    }
    
    public void CreateBox(int box[]){
        int a = 0;
        for(int y=30;y<22*20;y+=20){
            for(int x=40;x<19*20;x+=20){
                int b=box[a];
                if(b==0){
                    BOX = new Box();
                    addObject(BOX,x,y);}
                else if(b==1){
                    TRACK = new Track();
                    addObject(TRACK,x,y);}
                else if(b==2){}
                if(a<box.length-1)
                    a++;
            }
        }
    }
    
    private void prepare(){
        List = new PlayList(); addObject(List, 200, 300);
        courage = new Song_Courage(); addObject(courage, 195, 195);
        future = new Song_Future(); addObject(future, 195, 240);
        we_are = new Song_We_are(); addObject(we_are, 195, 285);
        story = new Song_Story(); addObject(story, 195, 330);
        silhouette = new Song_Silhouette(); addObject(silhouette, 195, 375);
        pilih = Pilihan.Layout;
    }
    
    public void Play(){
        removeObjects(getObjects(Actor.class));
        previous = new Previous(); addObject(previous, 60, 550);
        stop = new Stop(); addObject(stop, 140, 550);
        play_pause = new PlayPause(); addObject(play_pause, 215, 550);
        next = new Next(); addObject(next, 280, 550);
        up = new VolUp(); addObject(up, 340, 514);
        down = new VolDown(); addObject(down, 340, 576);
        pilih = Pilihan.Play;
    }
    
    public void act(){
       switch(pilih){
           case Layout : layout();
                         break;
           case Play : GoPlay();
                       break;
       }
    }
   
   private void layout(){
       if(Greenfoot.mouseClicked(courage)){
            Courage.play();
            playlist = 1;
            Play();
       }if(Greenfoot.mouseClicked(future)){
            Future.play();
            playlist = 2;
            Play();
       }if(Greenfoot.mouseClicked(we_are)){
            We_are.play();
            playlist = 3;
            Play();
       }if(Greenfoot.mouseClicked(story)){
            Story.play();
            playlist = 4;
            Play();
       }if(Greenfoot.mouseClicked(silhouette)){
            Silhouette.play();
            playlist = 5;
            Play();
       }
   }
   
   private void GoPlay(){
       title();
       Playing();
       NotPlaying();
       if(Greenfoot.mouseClicked(down)){
           Volume--;
           if(Volume<=0)
               Volume=0;
           Courage.setVolume(Volume);
           Future.setVolume(Volume);
           We_are.setVolume(Volume);
           Story.setVolume(Volume);
           Silhouette.setVolume(Volume);
       }
       if(Greenfoot.mouseClicked(up)){
           Volume++;
           if(Volume>=100)
               Volume=100;
           Courage.setVolume(Volume);
           Future.setVolume(Volume);
           We_are.setVolume(Volume);
           Story.setVolume(Volume);
           Silhouette.setVolume(Volume);
       }   
       Stop();
       Play_Pause();
       Next();
       Previous();
   }
   
   private void title(){
      if(cek){
          removeObject(judul);
          if(playlist==1)
                judul = new Title("1. Courage - Haruka Tomatsu");
          if(playlist==2)
                judul = new Title("2. Where is The Future - Back-On");
          if(playlist==3)
                judul = new Title("3. We are - Back-On");
          if(playlist==4)
                judul = new Title("4. Story - Kana Nishino");
          if(playlist==5)
                judul = new Title("5. Silhouette - Kana Boon");
          addObject(judul,195,470);
          cek = false;
        }
   }
   
   private void Playing(){
       int z = Greenfoot.getRandomNumber(35);
       List bx = getObjects(Box.class);
       List tr = getObjects(Track.class);
       for(int i=0;i<bx.size();i++){
            Box BX = (Box)bx.get(i);
            removeObject(BX);
       }
       for(int i=0;i<tr.size();i++){
            Track TR = (Track)tr.get(i);
            removeObject(TR);
       }
       if(Courage.isPlaying()||Future.isPlaying()||We_are.isPlaying()||Story.isPlaying()
            ||Silhouette.isPlaying()){
           play_pause.setImage(pause);
           play_or_pause = pause;
           if(z==1||z==2||z==4||z==6)
                Box1();
           else if(z==8||z==10||z==12||z==14)
                Box2();
           else if(z==16||z==18||z==20||z==3)
                Box3();
           else if(z==5||z==7||z==9||z==11)
                Box4();
           else if(z==13||z==15||z==17||z==19)
                Box5();
           else if(z==21||z==22||z==23||z==24)
                Box6();
           else if(z==25||z==26||z==27||z==28)
                Box7();
           else if(z==29||z==30||z==31||z==32)
                Box8();
           else 
                Box0();
       }
   }
   
   private void NotPlaying(){
       if(!Courage.isPlaying()&&!Future.isPlaying()&&!We_are.isPlaying()&&!Story.isPlaying()
            &&!Silhouette.isPlaying()){
           play_pause.setImage(play);
           play_or_pause = play;
           Box0();
       }
   }
   
   private void Stop(){
       if(Greenfoot.mouseClicked(stop)){
            if(playlist==1)
                Courage.stop();
            if(playlist==2)
                Future.stop();
            if(playlist==3)
                We_are.stop();
            if(playlist==4)
                Story.stop();
            if(playlist==5)
                Silhouette.stop();
        }
   }
   
   private void Play_Pause(){
       if(Greenfoot.mouseClicked(play_pause)){
            if(play_or_pause==play){
                if(playlist==1)
                    Courage.play();
                if(playlist==2)
                    Future.play();
                if(playlist==3)
                    We_are.play();
                if(playlist==4)
                    Story.play();
                if(playlist==5)
                    Silhouette.play();
            }else if(play_or_pause==pause){
                if(playlist==1)
                    Courage.pause();
                if(playlist==2)
                    Future.pause();
                if(playlist==3)
                    We_are.pause();
                if(playlist==4)
                    Story.pause();
                if(playlist==5)
                    Silhouette.pause();
            }
        }
   }
   
   private void Next(){
       if(Greenfoot.mouseClicked(next)){
            if(playlist==1){
                if(Courage.isPlaying())
                    Courage.stop();
                Future.play();
                playlist=2;
            }else if(playlist==2){
                if(Future.isPlaying())
                    Future.stop();
                We_are.play();
                playlist=3;
            }else if(playlist==3){
                if(We_are.isPlaying())
                    We_are.stop();
                Story.play();
                playlist=4;
            }else if(playlist==4){
                if(Story.isPlaying())
                    Story.stop();
                Silhouette.play();
                playlist=5;
            }else if(playlist==5){
                if(Silhouette.isPlaying())
                    Silhouette.stop();
                Courage.play();
                playlist=1;
            }cek = true;
        }
   }
   
   private void Previous(){
       if(Greenfoot.mouseClicked(previous)){
            if(playlist==1){
                if(Courage.isPlaying())
                    Courage.stop();
                Silhouette.play();
                playlist=5;
            }else if(playlist==2){
                if(Future.isPlaying())
                    Future.stop();
                Courage.play();
                playlist=1;
            }else if(playlist==3){
                if(We_are.isPlaying())
                    We_are.stop();
                Future.play();
                playlist=2;
            }else if(playlist==4){
                if(Story.isPlaying())
                    Story.stop();
                We_are.play();
                playlist=3;
            }else if(playlist==5){
                if(Silhouette.isPlaying())
                    Silhouette.stop();
                Story.play();
                playlist=4;
            }cek = true;
        }
   }
}
