
package imat;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import se.chalmers.cse.dat216.project.IMatDataHandler;

public class MainViewController implements Initializable {



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


    }


    public void closeButtonMouseEntered(){
        String imagePath = "./resources/icon_close_hover.png";
        closeButtonImageView.setImage(new Image(getClass().getClassLoader().getResourceAsStream(imagePath)));
    }

    @FXML
    public void closeButtonMousePressed(){
        String imagePath = "./resources/icon_close_pressed.png";
        closeButtonImageView.setImage(new Image(getClass().getClassLoader().getResourceAsStream(imagePath)));
    }

    @FXML
    public void closeButtonMouseExited(){
        String imagePath = "./resources/icon_close.png";
        closeButtonImageView.setImage(new Image(getClass().getClassLoader().getResourceAsStream(imagePath)));
    }
    public Image getSquareImage(Image image){

        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;

        if(image.getWidth() > image.getHeight()){
            width = (int) image.getHeight();
            height = (int) image.getHeight();
            x = (int)(image.getWidth() - width)/2;
            y = 0;
        }

        else if(image.getHeight() > image.getWidth()){
            width = (int) image.getWidth();
            height = (int) image.getWidth();
            x = 0;
            y = (int) (image.getHeight() - height)/2;
        }

        else{
            //Width equals Height, return original image
            return image;
        }
        return new WritableImage(image.getPixelReader(), x, y, width, height);
    }
}
