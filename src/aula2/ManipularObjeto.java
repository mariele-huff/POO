/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2;

import Modelos.Carro;
import Modelos.Modelo;

/**
 *
 * @author mari
 */
public class ManipularObjeto {

    public static void main(String[] args) {

        Modelo modelo = new Modelo("Chevrolet", "Opala");

        Carro carros[] = new Carro[3];

        Carro objCarro = new Carro("111111", "Amarelo", "Fiat", "147", 2000, 2002, 7.5);

        Carro objCarro1 = new Carro("111111", "Amarelo", "Fiat", "147", 2000, 2002, 8);

        Carro objCarro2 = new Carro("111111", "Amarelo", "Fiat", "147", 2000, 2002, 8);
        //objCarro.setMarca("Fiat");
        //objCarro.setModelo("147");
        //objCarro.setCor("Amarelo");
        //objCarro.setAnoFabricacao(2000);
        carros[0] = objCarro;
        carros[1] = objCarro1;
        carros[2] = objCarro2;

        //TEMA: Criar mais um carro e dizer qual dos três é o mais novo
        String objRetorno = obterCarroMaisNovo(carros);

        System.out.println(objRetorno);
    }

    public static String obterCarroMaisNovo(Carro[] carros1) {
        int carromaisnovo = carros1[0].getAnoFabricacao();
        int cont = 0;
        for (int i = 0; i < carros1.length; i++) {

            if (carros1[i].getAnoFabricacao()>carromaisnovo) {
              carromaisnovo = carros1[i].getAnoFabricacao();
                return ("O carro mais novo é " + carros1[i]);
            } else if (carros1[i].getAnoFabricacao() == carromaisnovo) {
                cont++;
            }
            if (cont == carros1.length) {
                return ("Todos os carros são do mesmo ano");

            }

        }
        return null;

    }

}
