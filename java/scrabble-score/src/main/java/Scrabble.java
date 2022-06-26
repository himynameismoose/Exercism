class Scrabble {

    // Keep track of the score
    // initialize at 0;
    private int score = 0;

    Scrabble(String word) {
        word = word.toUpperCase();

        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' :
                    score += 1;
                    break;
                case 'D', 'G' :
                    score += 2;
                    break;
                case 'B', 'C', 'M', 'P' :
                    score += 3;
                    break;
                case 'F', 'H', 'V', 'W', 'Y' :
                    score += 4;
                    break;
                case 'K' :
                    score += 5;
                    break;
                case 'J', 'X' :
                    score += 8;
                    break;
                case 'Q', 'Z' :
                    score += 10;
                    break;
            }
        }
    }

    int getScore() {
        return score;
    }
}
