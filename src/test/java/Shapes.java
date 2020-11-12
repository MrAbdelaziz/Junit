import java.io.StringWriter;

public class Shapes {
	private StringWriter out;
	
	public Shapes(StringWriter out) {
		this.out = out;
	}

	public void area(String type, String string2) {
			int a,b;
		switch (type) {
			case "SQUARE":
				out.append((Integer.parseInt(string2)*Integer.parseInt(string2))+"\n");
				break;
			case "RECTANGLE":
				 a = Integer.parseInt(string2.split(",")[0]);
				 b = Integer.parseInt(string2.split(",")[1]);
				out.append((a*b)+"\n");
				break;
			case "TRIANGLE":
				 a = Integer.parseInt(string2.split(",")[0]);
				 if(string2.split(",").length>1) {
				 b = Integer.parseInt(string2.split(",")[1]);
				 out.append(((a*b)/2)+"\n");
				 }else {
					 out.append((a*10)+"\n"); 
				 }
				break;
			}
	}
	
	
	

}
