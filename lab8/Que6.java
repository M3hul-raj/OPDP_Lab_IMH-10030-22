package Assignment8;

abstract class Phone{
    abstract void call();
    abstract void sms();
}

interface Camera{
    void click();
    void record();
}
interface MusicPlayer{
    void play();
    void pause();
    void stop();
}

class Smartphone implements Camera,MusicPlayer{
    void call(){
        System.out.println("In the call method");
    }
    void sms(){
        System.out.println("In the sms method");
    }

    @Override
    public void click() {
        System.out.println("In the click method");
    }

    @Override
    public void record() {
        System.out.println("In the record method");
    }

    @Override
    public void play() {
        System.out.println("In the play method");
    }

    @Override
    public void pause() {
        System.out.println("In the pause method");
    }

    @Override
    public void stop() {
        System.out.println("In the stop method");
    }
    
}

public class Que6 {
    public static void main(String[] args){
        Smartphone s1 = new Smartphone();
        s1.call();
        s1.sms();
        Camera c1 = new Smartphone();
        c1.click();
        c1.record();
        MusicPlayer m1 = new Smartphone();
        m1.pause();
        m1.play();
        m1.stop();
    }
}
