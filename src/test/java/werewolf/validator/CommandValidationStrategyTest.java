package werewolf.validator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CommandValidationStrategyTest {

  @Test
  void validateWolfKillCommand() {
    String wolfCommand = "Kill 9";
    CommandValidator wolfValidator = new CommandValidator(c -> c.contains("Kill"));
    assertTrue(wolfValidator.validate(wolfCommand));

    CommandValidator witchValidator = new CommandValidator(c -> c.contains("Poison"));
    assertFalse(witchValidator.validate(wolfCommand));
  }
}
