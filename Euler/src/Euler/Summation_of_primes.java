package Euler;

import java.util.ArrayList;

//Algorytm Sita Erastotenesa
public class Summation_of_primes {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i = 2;
		list.add(i);				
		//Tworzy listê kolejnych liczb z przedzia³u [2;2000000]
		while(list.get(list.size()-1) < 2000000) {
			i++;
			list.add(i);
		}
		
		i = -1;
		
		//Wykonaj pêtle po wszystkich elementach listy (która siê zmniejsza)
		while(i < list.size() && i<Math.sqrt(2000000)) {
			i++;
			for(int j=i+1; j<list.size();j++) {
				if(list.get(j)%list.get(i)==0) {
					list.remove(j);
				}
			}
		}
		
		//Wyœwietl liczby pierwsze
		i = -1;
		while(i<list.size()) {
			i++;
			System.out.println(list.get(i));
		}
		
		
	}

}
