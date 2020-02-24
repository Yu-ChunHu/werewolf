package werewolf.board;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BoardTemplateTest {

  @Test
  @DisplayName("Generate a standard board game")
  void testStandardBoard() {
    List<String> characters = List.of(
        "Villager", "Villager", "Villager", "Villager",
        "Seer", "Witch", "Hunter", "Idiot",
        "Werewolf", "Werewolf", "Werewolf", "Werewolf"
    );
    new BoardTemplate().processGame(() -> characters);
  }

}
