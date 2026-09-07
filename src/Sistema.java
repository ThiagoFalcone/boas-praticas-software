/**
 * Sistema de avaliação de alunos.
 *
 * Calcula a média de um aluno a partir de duas notas e informa
 * se ele foi aprovado ou reprovado.
 */
public class Sistema {

    private static final double MEDIA_MINIMA_APROVACAO = 6.0;

    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double notaProva1 = 8;
        double notaProva2 = 7;

        double media = calcularMedia(notaProva1, notaProva2);
        String situacaoAluno = verificarSituacao(media);

        exibirResultado(nomeAluno, media, situacaoAluno);
    }

    /**
     * Calcula a média aritmética simples entre duas notas.
     */
    private static double calcularMedia(double notaProva1, double notaProva2) {
        return (notaProva1 + notaProva2) / 2;
    }

    /**
     * Define a situação do aluno com base na média mínima de aprovação.
     */
    private static String verificarSituacao(double media) {
        if (media >= MEDIA_MINIMA_APROVACAO) {
            return "Aprovado";
        }
        return "Reprovado";
    }

    /**
     * Apresenta o resultado final do aluno no console.
     */
    private static void exibirResultado(String nomeAluno, double media, String situacaoAluno) {
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Media: " + media);
        System.out.println("Situacao: " + situacaoAluno);
    }
}
