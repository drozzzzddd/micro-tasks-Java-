import java.sql.DataTruncation;

public class Demo{
    public static void main(String[] args){
        DataDecorator data = new XMLReader(new YAL(new Folder(new TXT())));
        data.write("decorateData");
        System.out.println();
        data.read();
    }
}

