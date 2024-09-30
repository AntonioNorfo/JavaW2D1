public class Main {
    public static void main(String[] args) {

        ArrayManager arrayManager = new ArrayManager(5);
        InputHandler inputHandler = new InputHandler();

        // Stampa lo stato iniziale dell'array

        arrayManager.printArray();

        int userInput;

        do {

            userInput = inputHandler.askForValue();
            if (userInput == 0) {
                break;
            }

            int position = inputHandler.askForPosition(arrayManager.getArrayLength());

            arrayManager.updateArray(position, userInput);

            arrayManager.printArray();

        } while (userInput != 0);

        System.out.println("Programma terminato.");
    }
}
