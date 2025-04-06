import java.util.Scanner;
class AudioPlayer {
    void play() {
        System.out.println("Playing audio at normal quality");
    }
}
class MP3Player extends AudioPlayer {
    void play() {
        System.out.println("Playing MP3 with enhanced compression");
    }
}
public class MusicApp {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter player type (1=Audio, 2=MP3): ");
        int choice = obj.nextInt();
        AudioPlayer player = (choice == 2) ? new MP3Player() : new AudioPlayer();
        player.play();
    }
}