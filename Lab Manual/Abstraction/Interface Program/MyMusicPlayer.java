import java.util.Scanner;

interface MusicPlayer {
    void play();
    void pause();
    void next();
}

class BasicPlayer implements MusicPlayer {
    public void play() { System.out.println("Playing music..."); }
    public void pause() { System.out.println("Paused."); }
    public void next() { System.out.println("Next track."); }
}

public class MyMusicPlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MusicPlayer player = new BasicPlayer();
        
        System.out.println("1-Play, 2-Pause, 3-Next: ");
        int choice = sc.nextInt();
        
        switch(choice) {
            case 1: player.play(); break;
            case 2: player.pause(); break;
            case 3: player.next(); break;
            default: System.out.println("Invalid choice!");
        }
        sc.close();
    }
}