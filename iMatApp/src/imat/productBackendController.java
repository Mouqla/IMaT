package imat;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import se.chalmers.cse.dat216.project.Product;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.io.IOException;

public class productBackendController extends AnchorPane {
    private MainViewController parentController;
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

    public itemsBackendController(Product product, MainViewController mainViewController){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("items.fxml"));
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
            this.productImageView.setImage(parentController.getSquareImage(product.getImageName()));
            this.productName.setText(product.setName());
            this.productAntal.setText(product.setUnit());
        }
    }

}
