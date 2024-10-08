package resurse;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class BeanRecource {
    private Resource resource;

    public BeanRecource(Resource resource) throws IOException {
        this.resource=resource;


        System.out.println(resource);
    }
    public String output() throws IOException {
        FileReader fileReader= new FileReader(this.resource.getFile());
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        bufferedReader.lines().forEach(x-> System.out.println(x));
        return  bufferedReader.readLine();
    }
}
