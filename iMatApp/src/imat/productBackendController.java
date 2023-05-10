package imat;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.image.ImageView;
import se.chalmers.cse.dat216.project.IMatDataHandler;
import se.chalmers.cse.dat216.project.Product;

import java.awt.*;
import java.io.IOException;

public class productBackendController extends AnchorPane {
    private MainViewController parentController;
    private IMatDataHandler imatdatahandler;
    private Product product;
    @FXML
    private ImageView productImageView;
    @FXML
    private ImageView productAddImageView;
    @FXML
    private ImageView productMinusImageView;
    @FXML
    private Label productAntal;
    @FXML
    private Label productPrice;
    @FXML
    private Label productName;

    public productBackendController(Product product, MainViewController mainViewController){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("products.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try{
          fxmlLoader.load();
        }catch (IOException ioException){
            throw new RuntimeException();
        }
        this.product = product;
        this.parentController= mainViewController;

        try{
            this.productImageView.setImage(parentController.getSquareImage(imatdatahandler.getFXImage(this.product)));
            this.productAddImageView.getImage();
            this.productMinusImageView.getImage();
            this.productName.setText(product.getName());
            this.productAntal.setText(product.getUnit());
            this.productPrice.setText(Double.toString(product.getPrice()));

        }catch (IOException exception){
            throw new RuntimeException();
        }
    }

}
