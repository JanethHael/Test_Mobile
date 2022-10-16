package activity.whenDo;

import AppiumControl.Button;
import AppiumControl.TextBox;
import org.openqa.selenium.By;

public class DeleteNoteForm {
    String title="catolica diplomado";
    public TextBox lblText = new TextBox(By.xpath("//android.widget.TextView[@text='"+title+"']"));
    public Button deleteButton = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));

    public Button confirmButton = new Button(By.id("android:id/button1"));
}
