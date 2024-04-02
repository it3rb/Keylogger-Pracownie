package App;

import App.keyLoggerLogic.ActiveAppMainLogic;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

public class Main implements NativeKeyListener  {
    public static void main(String[] args) {
        AppBody.aplicationBody();
    }

}