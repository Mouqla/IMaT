
package imat;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
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


    IMatDataHandler iMatDataHandler = IMatDataHandler.getInstance();

    public void initialize(URL url, ResourceBundle rb) {

        String iMatDirectory = iMatDataHandler.imatDirectory();

        pathLabel.setText(iMatDirectory);
    }

}