class RotationalCipher {

    private int shiftKey;
    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    RotationalCipher(int shiftKey) {
        if (shiftKey > 25)
            this.shiftKey = shiftKey - 26;

        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        String result = ""; // the result string

        // Reference to lowercase alphabet
        String alphaLC = alphabet.toLowerCase();

        // loop through the data string, checking each char
        for (int i = 0; i < data.length(); i++) {
            // Store the letter
            char c = data.charAt(i); // as char
            String letter = Character.toString(c); // as string

            // get the index of the letter + shiftKey
            int index = alphaLC.indexOf(letter.toLowerCase()) + shiftKey;

            // Check if the index is greater than 26
            if (index >= 26)
                index -= 26;

            // Check if the letter if UC or LC and is in alphabet/alphaLC
            if (Character.isUpperCase(c) && alphabet.contains(letter)) {
                result += alphabet.charAt(index);
            } else if (!Character.isUpperCase(c) && alphaLC.contains(letter)) {
                result += alphaLC.charAt(index);
            } else { // letter is space " "
                result += letter;
            }
        }

        return result;
    }

}
