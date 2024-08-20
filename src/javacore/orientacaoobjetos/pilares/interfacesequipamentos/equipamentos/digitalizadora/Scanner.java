package javacore.orientacaoobjetos.pilares.interfacesequipamentos.equipamentos.digitalizadora;

public class Scanner implements Digitalizadora{

    @Override
    public void digitalizar(){
        System.out.println("Digitalizando com Scanner");
    }
}
