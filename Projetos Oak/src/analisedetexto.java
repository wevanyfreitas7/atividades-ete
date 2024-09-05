import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class analisedetexto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o texto (pressione Enter duas vezes para terminar):");
        StringBuilder texto = new StringBuilder();
        String linha;
        
        // Ler o texto até duas linhas em branco
        while (!(linha = scanner.nextLine()).isEmpty()) {
            texto.append(linha).append("\n");
        }

        String textoCompleto = texto.toString().trim();

        // Contar parágrafos
        String[] paragrafos = textoCompleto.split("\\n\\s*\\n");
        int numParagrafos = paragrafos.length;

        // Contar frases
        String[] frases = textoCompleto.split("[.!?]");
        int numFrases = frases.length;

        // Contar palavras e caracteres e encontrar a palavra mais repetida
        int numPalavras = 0;
        int numCaracteres = 0;
        Map<String, Integer> frequenciaPalavras = new HashMap<>();

        for (String paragrafo : paragrafos) {
            String[] palavras = paragrafo.split("\\s+");
            numPalavras += palavras.length;
            numCaracteres += paragrafo.replaceAll("\\s+", "").length();

            for (String palavra : palavras) {
                palavra = palavra.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
                if (!palavra.isEmpty()) {
                    frequenciaPalavras.put(palavra, frequenciaPalavras.getOrDefault(palavra, 0) + 1);
                }
            }
        }

        // Encontrar a palavra mais repetida
        String palavraMaisRepetida = null;
        int maxRepeticoes = 0;

        for (Map.Entry<String, Integer> entry : frequenciaPalavras.entrySet()) {
            if (entry.getValue() > maxRepeticoes) {
                maxRepeticoes = entry.getValue();
                palavraMaisRepetida = entry.getKey();
            }
        }

        // Exibir resultados
        System.out.println("Número de parágrafos: " + numParagrafos);
        System.out.println("Número de frases: " + numFrases);
        System.out.println("Número de palavras: " + numPalavras);
        System.out.println("Número de caracteres: " + numCaracteres);
        System.out.println("Palavra mais repetida: " + (palavraMaisRepetida != null ? palavraMaisRepetida : "Nenhuma palavra encontrada"));

        scanner.close();
    }
}