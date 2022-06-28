import java.util.*;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        // Create a list of handshakes depending on number
        List<Signal> result = new ArrayList<>();

        // Convert number to binary
        int binary = Integer.parseInt(Integer.toBinaryString(number));

        // Loop through each digit and check if it is a 1 or 0
        int count = 0;
        while (binary > 0) {
            count++;
            int digit = binary % 10;

            if (digit == 1) {
                switch (count) {
                    case 1:
                        result.add(Signal.WINK);
                        break;
                    case 2:
                        result.add(Signal.DOUBLE_BLINK);
                        break;
                    case 3:
                        result.add(Signal.CLOSE_YOUR_EYES);
                        break;
                    case 4:
                        result.add(Signal.JUMP);
                        break;
                    case 5:
                        Collections.reverse(result);
                        break;
                }
            }

            binary /= 10;
        }


        return result;
    }
}
