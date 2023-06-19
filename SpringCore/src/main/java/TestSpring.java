import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.lena.bobr.*;

public class TestSpring {
    public static void main (String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       //  Music rockMusic = context.getBean("rockMusic", RockMusic.class);
      //   Music classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
      //   Music popMusic = context.getBean("popMusic", PopMusic.class);
         // ru.lena.bobr.ClassicalMusic classical2 = context.getBean("musicBeanClassical", ru.lena.bobr.ClassicalMusic.class);
         // System.out.println(classical1.getSong());
//MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
Computer computer = context.getBean("computer", Computer.class);
System.out.println(computer);
// ru.lena.bobr.MusicPlayer musicPlayer2 = context.getBean("musicPlayer", ru.lena.bobr.MusicPlayer.class);
// boolean comp = musicPlayer1==musicPlayer2;
// System.out.println(comp);
// musicPlayer.playMusic();
// musicPlayer1.setVolume(60);
//    System.out.println(musicPlayer1.getName());
// System.out.println(musicPlayer1.getVolume());
// System.out.println(musicPlayer2.getVolume());
//
        context.close();
    }
}
