package case1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDataSource implements DataSource {

	public String read(String filePath) {
		try {
			String filePath1="C:\\Intel\\eclipse\\DecoratorCase1\\file.txt";
			BufferedReader reader= new BufferedReader(new FileReader(filePath1));
			StringBuilder content=new StringBuilder();
			String line;
			while((line=reader.readLine()) != null) {
				content.append(line);
				content.append("\n");
			}
			return content.toString();
		}
		catch (IOException e){
			 e.printStackTrace();
		}
		return filePath;
	}

	public void write(String filePath, String content) {
		try  (BufferedWriter writer=new BufferedWriter(new FileWriter(filePath))){
			writer.write(content);
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}

}
