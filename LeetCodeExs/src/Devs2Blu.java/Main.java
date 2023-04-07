import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String str = "aa b c a";
        int[] control = new int[2];
        str = str.replaceAll("[,|.|'|!|?|*]*", "");
        String[] strAr = str.split(" ");
        ArrayList<char[]> charList = new ArrayList<>();
        char[] charAr;// Salvará cada palavra do strAr (Array de strings onde cada elemento é uma
                      // palavra.)
        for (int i = 0; i < strAr.length; i++) {
            charAr = strAr[i].toCharArray();
            charList.add(charAr);
        }

        int highestRepeatedLetterCountAll = 0; // COntem a maior quantidade de letras de todas as palavras
        int highestRepeatedLetterCountLocal = 0; // Contem a maior quantidade de letras da palavra selecionado
        int repeatedOc = 0;// Conta ocorrencias de letra repetida da letra selecionada

        for (int i = 0; i < charList.size(); i++) {
            highestRepeatedLetterCountLocal = 0;
            char[] c = charList.get(i); // c aponta para o array de caracteres da palavra

            for (int j = 0; j < charList.get(i).length; j++) { // charList.get(i).length pega o comprimento da palavra
                                                               // selecionado no for acima.
                repeatedOc = 0; // Conta a repetição de cada letra. Se ela for maior que
                                // highestRepeatedLetterCount, que é a maior quantidade de letras repetidas da
                                // palavra, substitui.

                for (int k = 0; k < charList.get(i).length; k++) {
                    if (c[j] == c[k]) {
                        repeatedOc++;
                    }
                    if (repeatedOc > highestRepeatedLetterCountLocal) {
                        highestRepeatedLetterCountLocal = repeatedOc;
                    }
                }
            }
            if (highestRepeatedLetterCountLocal > highestRepeatedLetterCountAll) {
                control[0] = i;
                control[1] = highestRepeatedLetterCountLocal;
                highestRepeatedLetterCountAll = highestRepeatedLetterCountLocal;
            }

        }
        if (control[1] == 1) {
            System.out.println("-1");
        } else {
            System.out.println(strAr[control[0]]);
        }
    }
}
