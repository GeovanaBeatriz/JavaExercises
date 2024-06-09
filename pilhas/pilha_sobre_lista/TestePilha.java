
public class TestePilha {
    public static void main(String[] args) {
        System.out.println(Pilha.ehPalindromo("arara")); // true
        System.out.println(Pilha.ehPalindromo("reviver")); // true
        System.out.println(Pilha.ehPalindromo("palindromo")); // false
        System.out.println(Pilha.ehPalindromo("A man a plan a canal Panama".replaceAll("\\s+", "").toLowerCase())); // true
        System.out.println(Pilha.ehPalindromo("")); // true
        System.out.println(Pilha.ehPalindromo("a")); // true
    }

    
}
