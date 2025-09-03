public class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return new StringBuilder(clean).reverse().toString().equals(clean);
    }

    public void displayResult() {
        System.out.println("Text: " + text);
        System.out.println("Is Palindrome: " + isPalindrome());
    }

    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("Madam");
        PalindromeChecker p2 = new PalindromeChecker("Hello");

        p1.displayResult();
        System.out.println();
        p2.displayResult();
    }
}
