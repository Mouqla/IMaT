
package imat;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import se.chalmers.cse.dat216.project.IMatDataHandler;

public class MainViewController implements Initializable {

    @FXML
    Label pathLabel;
    @FXML
    TextField searchBar;
    @FXML
    ImageView searchBarcloseImageView;
    @FXML
    ImageView searchBarSearchImageView;
    @FXML
    ImageView closeButtonImageView;



    IMatDataHandler iMatDataHandler = IMatDataHandler.getInstance();

    public void initialize(URL url, ResourceBundle rb) {

        String iMatDirectory = iMatDataHandler.imatDirectory();

        pathLabel.setText(iMatDirectory);
    }


    public void closeButtonMouseEntered(){
        String imagePath = "/Users/mohammeduqla/Desktop/IMat/resources/iMatApp/src/imat/resources/icon_close_hover.png";
        closeButtonImageView.setImage(new Image(getClass().getClassLoader().getResourceAsStream(imagePath)));
    }

    @FXML
    public void closeButtonMousePressed(){
        String imagePath = "/Users/mohammeduqla/Desktop/IMat/resources/iMatApp/src/imat/resources/icon_close_pressed.png";
        closeButtonImageView.setImage(new Image(getClass().getClassLoader().getResourceAsStream(imagePath)));
    }

    @FXML
    public void closeButtonMouseExited(){
        String imagePath = "/Users/mohammeduqla/Desktop/IMat/resources/iMatApp/src/imat/resources/icon_close.png";
        closeButtonImageView.setImage(new Image(getClass().getClassLoader().getResourceAsStream(imagePath)));
    }
}
