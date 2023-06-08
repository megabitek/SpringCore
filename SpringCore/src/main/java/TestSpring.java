import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main (String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
          ClassicalMusic classical1 = context.getBean("musicBeanClassical", ClassicalMusic.class);
          ClassicalMusic classical2 = context.getBean("musicBeanClassical", ClassicalMusic.class);
          System.out.println(classical1.getSong());
// MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
// MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
// boolean comp = musicPlayer1==musicPlayer2;
// System.out.println(comp);
// musicPlayer1.playMusic();
// musicPlayer1.setVolume(60);
//    System.out.println(musicPlayer1.getName());
// System.out.println(musicPlayer1.getVolume());
// System.out.println(musicPlayer2.getVolume());
//
        context.close();
    }
}
