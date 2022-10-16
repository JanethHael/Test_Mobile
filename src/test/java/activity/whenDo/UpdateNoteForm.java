package activity.whenDo;

import AppiumControl.Button;
import AppiumControl.Label;
import AppiumControl.TextBox;
import org.openqa.selenium.By;

public class UpdateNoteForm {
    public TextBox titleTxtBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox noteTxtBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button saveButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
}
