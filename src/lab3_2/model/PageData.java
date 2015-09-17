package lab3_2.model;

import javafx.scene.image.Image;

/**
 * Created by Student Lab on 17/9/2558.
 */
public class PageData {
    public String name;
    public String description;
    public String binNames;
    public Image image;
    public PageData(String name, String description, String binNames) {
        this.name = name;
        this.description = description;
        this.binNames = binNames;
        image = new Image("lab3_2/"+name + ".jpg");
    }
}
