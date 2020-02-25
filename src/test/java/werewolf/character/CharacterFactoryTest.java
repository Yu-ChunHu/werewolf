package werewolf.character;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CharacterFactoryTest {

  @Test
  void testMakeAWitch() {
    Character character = CharacterFactory.makeCharacter("Witch");
    assertEquals(Witch.class, character.getClass());
  }

  @Test
  @DisplayName("Given invalid name should throw wrong argument error")
  void givenInvalidNameThrowError() {
    assertThrows(IllegalArgumentException.class, () -> CharacterFactory.makeCharacter("God"));
  }

}