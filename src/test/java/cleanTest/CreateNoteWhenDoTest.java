package cleanTest;

import activity.whenDo.CreateNoteform;
import activity.whenDo.DeleteNoteForm;
import activity.whenDo.MainScreen;
import activity.whenDo.UpdateNoteForm;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class CreateNoteWhenDoTest {

    MainScreen mainScreen = new MainScreen();
    CreateNoteform createNoteform = new CreateNoteform();

    @Test
    public void verifyCreateNewNote(){
        String title="Name Janeth";
        String note = "description tools";
        mainScreen.addNoteButton.click();
        createNoteform.titleTxtBox.setText(title);
        createNoteform.noteTxtBox.setText(note);
        createNoteform.saveButton.click();

        //check
        Assertions.assertTrue(mainScreen.isNoteDisplayed(title),
              "ERROR, the note was not created");

    }

    @AfterEach
    public void closeApp(){
        Session.getInstance().closeApp();
    }
}
