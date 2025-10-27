/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author user
 */
public class HierarquiaDeFormas {
    public static void main(String[] args) {
       
        //cria o vetor do tipo Forma com 6 posicoes
        Forma[] formas = new Forma[6];

        //preenche o vetor
        formas[0] = new Esfera(7);
        formas[1] = new Pirâmide(2, 7);
        formas[2] = new Cubo(9);
        formas[3] = new Quadrado(9);
        formas[4] = new Circulo(7);
        formas[5] = new Triangulo(2, 7);

        //percorre o vetor com um for each
        for (Forma f : formas) {
            
            //mostra o conteudo do metodo toString
            System.out.println(f.toString());

            //mostra somente a area se a forma for 2D
            if (f instanceof Forma2D) {
                System.out.printf("Area: %.2f\n", f.obterArea());
            }
            //mostra area e volume se a forma for 3D
            else if (f instanceof Forma3D) {
                System.out.printf("Area: %.2f\n", f.obterArea());
                System.out.printf("Volume: %.2f\n", f.obterVolume());
            }

            System.out.println("\n\n");
        }
    }
}
