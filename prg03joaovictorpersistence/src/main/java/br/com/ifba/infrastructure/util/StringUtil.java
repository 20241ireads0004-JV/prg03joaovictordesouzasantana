/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.infrastructure.util;

/**
 *
 * @author user
 */
public class StringUtil {
    //verificamos se a String é nula ou vazia ("").
     //não usamos trim(), então "   " NÃO é considerado vazio.
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.isEmpty();
    }
    
    /**
     * Verifica se a String é nula, vazia ou contém apenas espaços em branco.
     * Usa trim(), então "   " É considerado vazio.
     */
    public static boolean isNullOrBlank(String value) {
        return value == null || value.trim().isEmpty();
    }
}
