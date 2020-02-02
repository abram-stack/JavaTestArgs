import java.util.Arrays;
import java.util.List;

public class MainArgsDemo {

	public static void main(String[] args) {
		
		new MainArgsDemo(args);

	}
	
	private MainArgsDemo(String[] param) {
		List<String> paramList = Arrays.asList(param);
		
		if(paramList.size() > 0 ){
			final Person person1= loadPerson(paramList);
			if(paramList.contains("-s")){
				calculateSp(person1, paramList);
			}else if (paramList.contains("-b")){
				calculateBc(person1,paramList);
			}else if(paramList.contains("-a")){
				calculatePr(person1);
			}
			
		}
	}

	private void calculatePr(Person person1) {
		System.out.println("this is "+person1+" calculates properties");
		
	}

	private void calculateBc(Person person1, List<String> paramList) {
		String nodeA = paramList.get(2);
		System.out.println("this is "+person1+"using :"+paramList.get(1)+"calculate Betweeness of:"+nodeA);
		
	}

	private void calculateSp(Person person1, List<String> paramList) {
		String start = paramList.get(2);
		String end = paramList.get(3);
		System.out.println("this is "+person1+"using : "+paramList.get(1)+" start : "+start+" end : "+end);
	}

	private Person loadPerson(List<String> paramList) {
		final String filePath = paramList.get(0); //take the index 0 array which user input to the system 
		final Reader reader = new Reader();
		return reader.loadGraph(filePath);
	}
	
	
	
	
}
