class Solution {
    public String getHappyString(int length, int k) {
        int totalCombinations = 3 << (length - 1);

        if (k > totalCombinations) return "";
        k--; // convert to 0-based index

        StringBuilder result = new StringBuilder();

        // Determine first character
        int blockSize = totalCombinations / 3;
        result.append(getCharacterByIndex(k / blockSize, '-'));

        k %= blockSize;
        length--;

        // Determine remaining characters
        while (length-- > 0) {
            blockSize /= 2;
            char previousChar = result.charAt(result.length() - 1);
            result.append(getCharacterByIndex(k / blockSize, previousChar));
            k %= blockSize;
        }

        return result.toString();
    }

    public char getCharacterByIndex(int index, char previousChar) {
        for (char currentChar = 'a'; currentChar <= 'c'; currentChar++) {
            if (currentChar == previousChar) continue;
            if (index == 0) return currentChar;
            index--;
        }
        return previousChar;
    }
}