package javabasico.Gdebbuging;

public class Candidato {
    public static void main(String[] args) {
        boolean experiencia = false;
        boolean interesse = false;
        String candidatoCerto = "Mateus";
        if(candidatoCerto.equals("Mateus")) {
            experiencia = !experiencia;
            interesse = !interesse;
        }
            if (experiencia && interesse)
                ligarCandidato(candidatoCerto);
    }
    static void ligarCandidato (String nome){
        System.out.println("Ligar para o melhor candidato: " + nome + " :)");
    }
}

