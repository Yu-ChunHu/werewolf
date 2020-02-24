package werewolf.validator;

public class CommandValidator {
  private final CommandValidationStrategy strategy;

  public CommandValidator(CommandValidationStrategy strategy) {
    this.strategy = strategy;
  }

  public boolean validate(String command) {
    return this.strategy.validate(command);
  }
}
