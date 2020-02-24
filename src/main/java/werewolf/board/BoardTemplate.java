package werewolf.board;

import java.util.List;
import java.util.function.Supplier;

public class BoardTemplate {
  public void processGame(Supplier<List<String>> generateCharacters) {
    issueCharacters(generateCharacters.get());
    startRounds();
    evaluateResult();
    announceResult();
  }

  private void issueCharacters(List<String> characters) {
    System.out.println("Characters: " + characters);
  }

  private void startRounds() {
    System.out.println("Start rounds");
  }

  private void evaluateResult() {
    System.out.println("Evaluate result");
  }

  private void announceResult() {
    System.out.println("Announce result");
  }

}
