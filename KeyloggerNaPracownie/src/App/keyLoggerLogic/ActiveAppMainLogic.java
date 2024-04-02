package App.keyLoggerLogic;

public class ActiveAppMainLogic extends HideAppMainLogic
{
    private void getMainLogic()
    {
        mainLogicStart();
    }
    public void startMainLogic()
    {
        getMainLogic();
    }
    public void startOpenFolderLogic()
    {
        OpenLogsFolder open = new OpenLogsFolder();
        open.startOpenFolder();
    }
}
