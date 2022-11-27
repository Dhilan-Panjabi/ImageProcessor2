package controller;


import java.io.InputStreamReader;

import controller.command.Greyscale;
import controller.command.ImageStateImpl;
import controller.command.Lighting;
import controller.command2.ImageControlIO;
import model.ImageModel;
import view.ImageView;

/**
 * The controller implementation which takes in the commands from the user and runs them within the
 * program or quit the program.
 */
public class ImageControllerImpl extends AbstractController {

  /**
   * The controllers default constructor which takes in the model, view and input reader.
   *
   * @param model the model
   * @param view  the given image view
   */
  public ImageControllerImpl(ImageModel model, ImageView view) {
    super(model, view, new InputStreamReader(System.in));
  }


  /**
   * Constructor which takes in the input, model and view and adds the comands for the ppm files.
   *
   * @param model model
   * @param view  view
   * @param input given input
   */
  public ImageControllerImpl(ImageModel model, ImageView view, Readable input) {
    super(model, view, input);
    this.inputCommands.put("load", (s) -> {
      return new ImageControlIO("load", this.checkString(s),
              this.checkString(s), this.model);
    });
    this.inputCommands.put("save", (s) -> {
      return new ImageControlIO("save", this.checkString(s),
              this.checkString(s), this.model);
    });
    this.inputCommands.put("brighten", (s) -> {
      return new Lighting(this.checkInt(s), this.checkString(s), this.checkString(s), this.model,
              "brighten");
    });
    this.inputCommands.put("darken", (s) -> {
      return new Lighting(this.checkInt(s), this.checkString(s), this.checkString(s), this.model,
              "darken");
    });
    this.inputCommands.put("horizontal-flip", (s) -> {
      return new ImageStateImpl(this.checkString(s), this.checkString(s), this.model,
              "horizontal-flip");
    });
    this.inputCommands.put("vertical-flip", (s) -> {
      return new ImageStateImpl(this.checkString(s), this.checkString(s), this.model,
              "vertical-flip");
    });
    this.inputCommands.put("red-component", (s) -> {
      return new Greyscale(this.checkString(s), this.checkString(s), this.model,
              "red-component");
    });
    this.inputCommands.put("blue-component", (s) -> {
      return new Greyscale(this.checkString(s), this.checkString(s), this.model,
              "blue-component");
    });
    this.inputCommands.put("green-component", (s) -> {
      return new Greyscale(this.checkString(s), this.checkString(s), this.model,
              "green-component");
    });
    this.inputCommands.put("value-component", (s) -> {
      return new Greyscale(this.checkString(s), this.checkString(s), this.model,
              "value-component");
    });
    this.inputCommands.put("intensity-component", (s) -> {
      return new Greyscale(this.checkString(s), this.checkString(s), this.model,
              "intensity-component");
    });
    this.inputCommands.put("luma-component", (s) -> {
      return new Greyscale(this.checkString(s), this.checkString(s), this.model,
              "luma-component");
    });
  }
}

