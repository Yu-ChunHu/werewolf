package werewolf.announcer;

import java.util.ArrayList;
import java.util.List;
import werewolf.effect.EffectObserver;

public class GameAnnouncer implements AnnouncedSubject {
  private static final List<EffectObserver> observers = new ArrayList<>();

  @Override
  public void registerObserver(EffectObserver o) {
    observers.add(o);
  }

  @Override
  public void notifyObservers(String announcement) {
    observers.forEach(o -> o.update(announcement));
  }
}
