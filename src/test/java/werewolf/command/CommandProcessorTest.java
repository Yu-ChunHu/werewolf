package werewolf.command;

import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CommandProcessorTest {

  @Test
  @DisplayName("Werewolves kill 9, witch save 9")
  void testKill9Save9() {
    UnaryOperator<String> wolfCommand =
        text -> text.replace("9", "Kill 9");
    UnaryOperator<String> witchCommand =
        text -> text.replace("9", "Save 9");
    Function<String, String> pipeline = wolfCommand.andThen(witchCommand);
    String result = pipeline.apply("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12");
    System.out.println(result);
  }

}