import controller.ImageController;
import controller.ImageIOController;
import model.ImageIOModel;
import model.ImageIOModelImpl;
import view.ImageView;
import view.ImageViewImpl;

/**
 * runs the main method for IO controller.
 */
public class MainIO {
  /**
   * runs the main method which calls the controller for the IO method
   * to get the inputs given which runs the main method.
   *
   * @param args the list of given arguments
   */
  public static void main(String[] args) {
    ImageIOModel model = new ImageIOModelImpl();
    ImageView view = new ImageViewImpl(model);
    ImageController controller = new ImageIOController(model, view);
    controller.imageEditor();
  }
}
