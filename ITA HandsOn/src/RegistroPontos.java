public class RegistroPontos {

    private calculadoraBonus bonus;

    public RegistroPontos(calculadoraBonus cb) {
        bonus = cb;
    }

    public void fazerUmComentario(usuario u) {
        u.pontos += 3 * bonus.bonus(u);
    }

    public void criarUmTopico(usuario u) {
        u.pontos += 5 * bonus.bonus(u);
    }

    public void darUmLike(usuario u) {
        u.pontos += 1 * bonus.bonus(u);
    }


}
