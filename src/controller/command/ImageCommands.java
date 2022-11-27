package controller.command;

/**
 * The image commands interface.
 */
public interface ImageCommands {
  /**
   * the commands in which they get operations called on the pixels.
   *
   */
  void processCommand() throws IllegalArgumentException;

}
