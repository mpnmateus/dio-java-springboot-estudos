package javacore.orientacaoobjetos.pilares.autodromo.abstracaoEpolimorfismo;

public abstract class Veiculo {
    private String chassi;

    public abstract void ligar();

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
}
