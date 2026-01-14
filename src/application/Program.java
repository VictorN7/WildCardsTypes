package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> intsList = Arrays.asList(1,4,5);
		readList(intsList); // Funciona
		
		//readListObj(intsList); // Não compila e informa para fazer o upcasting
		
		List<String> strList = Arrays.asList("Joao","Maria", "Pedro");
		readList(strList); // Funciona
		
		
		// Não é possivel adicionar dados a uma coleção do tipo curinga(WildaCards)
		// O compilador não sabe qual é o tipo especifico da lista instanciada
		
		List<?> list = new ArrayList<Integer>();
		list.add(1); // Não compila
		
	}
	
	// Podemos fazer métodos que recebem um genérico de qualquer tipo(?)
	public static void readList(List<?> list ) { 
	
		list.add(123); // Erro de compilação tambem, pois o compilador não sabe o valor adicionado é compativel com a lista
		
		for (Object obj: list) {
			System.out.println(obj);
		}
		// Só não conseguimos adicionar elementos, pois o compilador não permite para manter a segurança de tipos
		// Ex: Como o compilador saberia qual tipo está sendo passado no parametro? O código quebraria
	}
	
		// Podemos fazer com receba qualquer tipo object. Nesse caso, se passar um Integer/Double, o compilador não permite
		// Teria que realizar o Upcasting do List do tipo Integer para Object no main.
	public static void readListObj(List<Object> list ) { 
		
		for (Object obj: list) {
			System.out.println(obj);
		}
		// Só não conseguimos adicionar elementos, pois o compilador não permite para manter a segurança de tipos
	} 
	
	
	
}