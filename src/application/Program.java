package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Integer> intsList = Arrays.asList(1, 4, 5);
        readList(intsList); // Funciona

        List<String> strList = Arrays.asList("Joao", "Maria", "Pedro");
        readList(strList); // Funciona

        // ==========================================
        // Wildcard sem limite (?)
        // ==========================================

        // A lista pode referenciar qualquer tipo genérico,
        // mas o tipo real é desconhecido em tempo de compilação
        List<?> list = new ArrayList<Integer>();

        // Erro de compilação:
        // Não é permitido adicionar elementos (exceto null),
        // pois o compilador não sabe qual é o tipo real da lista
        // list.add(1);
    }

    // ==========================================
    // Método com wildcard sem limite (?)
    //
    // Aceita listas de qualquer tipo:
    // List<Integer>, List<String>, List<Shape>, etc.
    //
    // Ideal para cenários de LEITURA genérica
    // ==========================================
    public static void readList(List<?> list) {

        // Erro de compilação:
        // Não é permitido adicionar elementos, pois o tipo
        // genérico real da lista é desconhecido
        // list.add(123);

        // Leitura segura: todo elemento é tratado como Object
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    // ==========================================
    // Método SEM wildcard
    //
    // Aceita exclusivamente List<Object>
    // NÃO aceita List<Integer>, List<String>, etc.
    //
    // Generics em Java são invariantes
    // ==========================================
    public static void readListObj(List<Object> list) {

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
