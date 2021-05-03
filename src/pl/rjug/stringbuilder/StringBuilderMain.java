package pl.rjug.stringbuilder;

public class StringBuilderMain {

    public static void main(String[] args) throws InterruptedException {
        for (int j = 0; j < 10; j++) {
            Thread.sleep(5000);
            versionWithConcatenation();
        }

        StringBuilder stringBuilder = new StringBuilder("hello ");
        String nullString = null;
        stringBuilder.append(nullString);
        System.out.println(stringBuilder.toString());
    }

    private static void versionWithStringBuffer() {
        StringBuffer veryLongWord = new StringBuffer("Hello");
        long startTime = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            veryLongWord.append("it").append(" ").append("is")
                    .append(" ").append("a").append(" ").append("very")
                    .append(" ").append("long").append(" ").append("string").append(".");
        }
        String word = veryLongWord.toString();
        long endTime = System.nanoTime();
        System.out.println(word + (endTime - startTime));
    }

    private static void versionWithConcatenation() {
        String veryLongWord = "Hello";
        long startTime = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            veryLongWord += "it" + " " + "is" + " " +
                    "a" + " " + "very" + " " + "long" + " " +
                    "string" + ".";
        }
        long endTime = System.nanoTime();
        System.out.println(veryLongWord + (endTime - startTime));
    }

    private static void versionWithStringBuilder() {
        StringBuilder veryLongWord = new StringBuilder("Hello");
        long startTime = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            veryLongWord.append("it").append(" ").append("is")
                    .append(" ").append("a").append(" ").append("very")
                    .append(" ").append("long").append(" ").append("string").append(".");
        }
        String word = veryLongWord.toString();
        long endTime = System.nanoTime();
        System.out.println(word + (endTime - startTime));
    }
}
