package javacore.orientacaoobjetos.pilares.interfacesequipamentos.producao;

import javacore.orientacaoobjetos.pilares.interfacesequipamentos.equipamentos.copiadora.Copiadora;
import javacore.orientacaoobjetos.pilares.interfacesequipamentos.equipamentos.digitalizadora.Digitalizadora;
import javacore.orientacaoobjetos.pilares.interfacesequipamentos.equipamentos.impressora.Deskjet;
import javacore.orientacaoobjetos.pilares.interfacesequipamentos.equipamentos.impressora.Impressora;
import javacore.orientacaoobjetos.pilares.interfacesequipamentos.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora imp = em;
        Copiadora cop = em;
        Digitalizadora dig = em;

        //Erro: uma deskjet não é uma copiadora (é apenas uma impressora)
        //Deskjet deskjet = new Deskjet();
        //cop = deskjet;

        imp.imprimir();
        cop.copiar();
        dig.digitalizar();

    }
}
