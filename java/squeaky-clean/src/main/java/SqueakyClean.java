class SqueakyClean {
    static String clean(String identifier) {

        identifier = identifier.replaceAll("[α-ω]", "");

        if (identifier.contains("-")) {
            int index = identifier.indexOf("-");
            identifier = identifier.replace("-", "");
            identifier = identifier.substring(0, index) +
                    identifier.substring(index, index + 1).toUpperCase() +
                    identifier.substring(index + 1);
        }

        StringBuilder result = new StringBuilder();

        for (char c : identifier.toCharArray()) {
            if (Character.isLetter(c))
                result.append(c);

            if (Character.isWhitespace(c))
                result.append('_');

            if (Character.isISOControl(c))
                result.append("CTRL");
        }

        identifier = result.toString();

        return identifier;
    }
}