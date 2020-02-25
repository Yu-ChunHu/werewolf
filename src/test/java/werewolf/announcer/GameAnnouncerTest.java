package werewolf.announcer;

import org.junit.jupiter.api.Test;

class GameAnnouncerTest {

  @Test
  void announceWerewolvesWin() {
    GameAnnouncer announcer = new GameAnnouncer();
    announcer.registerObserver(announcement -> System.out.println("Display: " + announcement));
    announcer.registerObserver(announcement -> System.out.println("Music: " + announcement));
    announcer.notifyObservers("狼人勝利!");
  }
}
