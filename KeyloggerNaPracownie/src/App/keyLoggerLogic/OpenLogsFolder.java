package App.keyLoggerLogic;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class OpenLogsFolder
{
    private void openFolder()
    {
        try {
            Desktop.getDesktop().open(new File("../"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void startOpenFolder()
    {
        openFolder();
    }
}
