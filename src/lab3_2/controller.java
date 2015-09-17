package lab3_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Menu;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Glow;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import lab3_2.model.PageData;

import java.awt.*;
import java.awt.Label;
import java.net.URL;
import java.util.AbstractMap;
import java.util.Map;
import java.util.ResourceBundle;

public class controller implements Initializable {
    @FXML
    Menu pictureEffect;
    @FXML
    ImageView pic = new ImageView();
    @FXML
    javafx.scene.control.Label name = new javafx.scene.control.Label();
    @FXML
    javafx.scene.control.Label binName = new javafx.scene.control.Label();
    @FXML
    javafx.scene.control.Label description = new javafx.scene.control.Label();
    private int currentIndex = -1;

    final Map.Entry<String, Effect>[] effects = new Map.Entry[] {
            new AbstractMap.SimpleEntry<>("Sepia Tone", new SepiaTone()),
            new AbstractMap.SimpleEntry<>("Glow", new Glow()),
            new AbstractMap.SimpleEntry<>("Shadow", new DropShadow())
    };

    final PageData[] pages = new PageData[] {
            new PageData("Apple",
                    "The apple is the pomaceous fruit of the apple tree, species Malus "
                            + "domestica in the rose family (Rosaceae). It is one of the most "
                            + "widely cultivated tree fruits, and the most widely known of "
                            + "the many members of genus Malus that are used by humans. "
                            + "The tree originated in Western Asia, where its wild ancestor, "
                            + "the Alma, is still found today.",
                    "Malus domestica"),
            new PageData("Hawthorn",
                    "The hawthorn is a large genus of shrubs and trees in the rose family,"
                            + "Rosaceae, native to temperate regions of the Northern Hemisphere "
                            + "in Europe, Asia and North America. The name hawthorn was "
                            + "originally applied to the species native to northern Europe, "
                            + "especially the Common Hawthorn C. monogyna, and the unmodified "
                            + "name is often so used in Britain and Ireland.",
                    "Crataegus monogyna"),
            new PageData("Ivy",
                    "The ivy is a flowering plant in the grape family (Vitaceae) native to "
                            + " eastern Asia in Japan, Korea, and northern and eastern China. "
                            + "It is a deciduous woody vine growing to 30 m tall or more given "
                            + "suitable support,  attaching itself by means of numerous small "
                            + "branched tendrils tipped with sticky disks.",
                    "Parthenocissus tricuspidata"),
            new PageData("Quince",
                    "The quince is the sole member of the genus Cydonia and is native to "
                            + "warm-temperate southwest Asia in the Caucasus region. The "
                            + "immature fruit is green with dense grey-white pubescence, most "
                            + "of which rubs off before maturity in late autumn when the fruit "
                            + "changes color to yellow with hard, strongly perfumed flesh.",
                    "Cydonia oblonga")
    };


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        final ToggleGroup groupEffect = new ToggleGroup();
        for(Map.Entry<String,Effect> effect : effects){
            RadioMenuItem itemEffect = new RadioMenuItem(effect.getKey());
            itemEffect.setUserData(effect.getValue());
            itemEffect.setToggleGroup(groupEffect);
            pictureEffect.getItems().add(itemEffect);
        }

    }

    public void shuffle() {
        int i = currentIndex;
        while (i == currentIndex) {
            i = (int) (Math.random() * pages.length);
        }
        pic.setImage(pages[i].image);
        name.setText(pages[i].name);
        binName.setText("(" + pages[i].binNames + ")");
        description.setText(pages[i].description);
        currentIndex = i;
    }
}
