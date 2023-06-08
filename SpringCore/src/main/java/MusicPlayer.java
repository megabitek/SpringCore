import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private int volume;
    private String name;
    private List<Music> musicList = new ArrayList<Music>();

    public MusicPlayer() {
    }

    public MusicPlayer (List<Music> musicList){
        this.musicList=musicList;
    }

    public void setMusicList(ArrayList<Music> musicList) {
        this.musicList = musicList;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playMusic(){
        System.out.println("Playing: ");
        musicList.stream().forEach(music->System.out.println(music.getSong()));

    }
}
