public class principal {
    public static void main(String[] args) {
        aluno helo = new aluno();
        helo.primeiroBim = 70;
        helo.segundoBim = 60;
        helo.terceiroBim = 80;
        helo.quartoBim = 70;

        System.out.println(verificadoraNotas.mediaAluno(helo));
        System.out.println(verificadoraNotas.passouDeAno(helo));
    }
}
