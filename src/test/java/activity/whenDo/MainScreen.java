package activity.whenDo;

import AppiumControl.Button;
import AppiumControl.Label;
import AppiumControl.TextBox;
import org.openqa.selenium.By;

public class MainScreen {

    public Button addNoteButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    public MainScreen(){

    }

    public boolean isNoteDisplayed(String title){
        TextBox note = new TextBox(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        return note.isControlDisplayed();
    }

    public Label textNote(String title){
        Label text= new Label(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        return  text;
    }



}
