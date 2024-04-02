# Keylogger-Pracownie

# Version
Early version of Java keylogger.
# Documentation

## Used libraries

* Java Swing
* jnativehook-2.2.2

## Package
* **App** - Main package of the project.
* **keyLoggerLogic**  - Package with main logic of the program placed in **App** package.
  
## Classes
* **Main**  - Main class of the program

* **AppBody** - The class containing the GUI and GUI logic placed in **App** package.
  ### AppBody methods
  * **aplicationBody** - Parameterless method, main method in **AppBody** class.
  * **actionPerformed** - Parameter: ActionEvent e, ActionListener method.
* **ActivAppMainLogic** - A class used to run the program's hidden logic. Inherited from the **HideAppMainLogic** class
  ### ActiveAppMainLogic methods 
  * **getMainLogic** - Parameterless private method made to get **mainLogicStart** method.
  * **startMainLogic** Parameterless public method designed to invoke program logic in other classes.
  * **startOpenFolderLogic** Parameterless public method designed to invoke program logic in other classes.
* **HideAppMainLogic** - The class containing main program logic. With implement NativeKeyListener
  ### HideAppMainLogic methods
  * **mainLogicStart** - Parameterless method used to start listening.
  * **nativeKeyPressed** - Parameter: NativeKeyEvent, method used to capture keystrokes.
  The method captures the pressed key and save it in the getCatchedLetter variable then invoke the **saveLogs** method
  * **saveLogs**  - Parameter: String getCatchedLetter method used to save letters in to logs txt file. To save letters in to file I used java BufferedWriter class and java LocalDate calss.
    *saveLogs postscriptum:* logs will be saved in folder where the program is.

