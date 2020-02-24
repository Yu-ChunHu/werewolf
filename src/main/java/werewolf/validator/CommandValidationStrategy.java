package werewolf.validator;

@FunctionalInterface
public interface CommandValidationStrategy {
  boolean validate(String command);
}
