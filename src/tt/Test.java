package tt;


import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		String[] atp = {"Rafael Nadal", "Novak Djokovic",  
			       "Stanislas Wawrinka",  
			       "David Ferrer","Roger Federer",  
			       "Andy Murray","Tomas Berdych",  
			       "Juan Martin Del Potro"};  
			List<String> players =  Arrays.asList(atp);  
			
			
			// ��ǰ��ѭ����ʽ  
			for (String player : players) {  
			     System.out.print(player + "; ");  
			}  
			  
			
		  

			// ʹ�� lambda ���ʽ�Լ���������(functional operation)  
			players.forEach((player) -> System.out.println(player + "0; "));  
			   
			// �� Java 8 ��ʹ��˫ð�Ų�����(double colon operator)  
			players.forEach(System.out::println);  
	}
}
