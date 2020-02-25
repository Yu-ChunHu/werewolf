package werewolf.character;

import java.util.Map;
import java.util.function.Supplier;

public class CharacterFactory {
  private static final Map<String, Supplier<Character>> CHARACTER_MAPPER =
      Map.of(
          "Villager", Villager::new,
          "Seer", Seer::new,
          "Witch", Witch::new,
          "Hunter", Hunter::new,
          "Idiot", Idiot::new,
          "Werewolf", Werewolf::new
      );

  public static Character makeCharacter(String name) {
    if (CHARACTER_MAPPER.containsKey(name))
      return CHARACTER_MAPPER.get(name).get();
    throw new IllegalArgumentException("No such character: " + name);
  }
}
