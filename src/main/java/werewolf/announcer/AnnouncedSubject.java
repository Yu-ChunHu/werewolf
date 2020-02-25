package werewolf.announcer;

import werewolf.effect.EffectObserver;

public interface AnnouncedSubject {
  void registerObserver(EffectObserver o);
  void notifyObservers(String announcement);
}
