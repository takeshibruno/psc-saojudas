public class testeAtribuicao {
    public static void main(String[] args) {
        Professor p = new Professor("Bruno", 22);
        Disciplina d = new Disciplina("PSC", false);
        Atribuicao atribuicao = new Atribuicao(p, d);

        atribuicao.getDados();
    }
}
