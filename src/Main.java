import UILibrary.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GUIFactory guiFactory = new WindowsFactory();

        Button button = guiFactory.createButton();
        button.create();

        Checkbox checkbox = new MacCheckbox();
        checkbox.create();
    }
}