import java.io.File;

public class Reader {
	
	private Person person;
	
	public Reader(){
		
	}
	
	public Person loadGraph(String filePath){
		
		
		String fileDir = loadRoot(filePath);
		System.out.println("file source directory:  "+fileDir);	
		person = new Person(filePath.toString());
		return person;
	}
	
	public String loadRoot(String filePath){
		String rootDir = "./src/de/frauas/fb2/javaoop/group4/nmaproject/xmlFile/";
		String fileName = filePath.concat(".xml");
		String fileDir = rootDir.concat(fileName);
		return fileDir;
	}
	public String loadAbsolutePath(){
		return null;
	}
}
