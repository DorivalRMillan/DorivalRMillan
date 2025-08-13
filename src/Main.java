//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        String ola = "olá ";
        String mundo = "Mundo de numero ";
        String olaMundo = ola + mundo;

        int um = 1, dois = 2, sumNumbers = um + dois;
        double decimal = 3.14f + sumNumbers;
        boolean programa = true;

        int totalPorcento = 100;
        int metadePorcento = 50;
        String certeza = "Quais as chances de você estar correto ? ";
        float finalPorcento = (float) metadePorcento / totalPorcento * 100f;

        String txt = "aeiuaeahneuhbaibneuae";
        String txt2 = "Por favor, onde se localiza a palavra ";


        System.out.println(ola.concat(mundo) + decimal );
        System.out.println("Você é um progrma ? " + programa);
        System.out.println(certeza + finalPorcento + "%");
        System.out.println("O numero de Caracteres dessa String é de " + txt.length());
        System.out.println("A palavra se Localiza na posição " + txt2.indexOf("localiza"));
    }
}