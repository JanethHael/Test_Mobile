package cleanTest;

import activity.whenDo.CreateNoteform;
import activity.whenDo.MainScreen;
import activity.whenDo.UpdateNoteForm;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class UpdateNoteWhenDoTest {
    MainScreen mainScreen = new MainScreen();
    UpdateNoteForm updateNoteForm = new UpdateNoteForm();
    CreateNoteform createNoteform = new CreateNoteform();

    @Test
    public void updateNote() {
        String title="Name Janeth";
        String note = "description tools";

        //update variables
        String titleUpd="Nombre Janeth";
        String noteUpd = "descripcion de las herramientas tecnologicas";

        mainScreen.addNoteButton.click();
        createNoteform.titleTxtBox.setText(title);
        createNoteform.noteTxtBox.setText(note);
        createNoteform.saveButton.click();
        //update
        mainScreen.textNote(title).click();
        updateNoteForm.titleTxtBox.setText(titleUpd);
        updateNoteForm.noteTxtBox.setText(noteUpd);
        updateNoteForm.saveButton.click();

        //check
        Assertions.assertTrue(mainScreen.isNoteDisplayed(titleUpd),
                "ERROR, the note was not created");

    }

    @AfterEach
    public void closeApp(){
        Session.getInstance().closeApp();
    }
}
