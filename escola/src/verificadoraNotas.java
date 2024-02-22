public class verificadoraNotas {
    public static int mediaAluno(aluno a) {
        int total = 0;
        total += a.primeiroBim;
        total += a.segundoBim;
        total += a.terceiroBim;
        total += a.quartoBim;

        return total / 4;
    }

    public static boolean passouDeAno(aluno a) {
        int media = mediaAluno(a);
        if(media >= 60)
            return true;
        return false;
    }
}
