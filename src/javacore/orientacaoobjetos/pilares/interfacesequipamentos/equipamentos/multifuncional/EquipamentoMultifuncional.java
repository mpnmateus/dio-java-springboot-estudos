package javacore.orientacaoobjetos.pilares.interfacesequipamentos.equipamentos.multifuncional;

import javacore.orientacaoobjetos.pilares.interfacesequipamentos.equipamentos.copiadora.Copiadora;
import javacore.orientacaoobjetos.pilares.interfacesequipamentos.equipamentos.digitalizadora.Digitalizadora;
import javacore.orientacaoobjetos.pilares.interfacesequipamentos.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {
    @Override
    public void copiar(){
        System.out.println("Copiando com Equipamento Multifuncional..");
    }

    @Override
    public void imprimir(){
        System.out.println("Imprimindo com Equipamento Multifuncional..");
    }

    @Override
    public void digitalizar (){
        System.out.println("Digitalizando com Equipamento Multifuncional..");
    }
}
