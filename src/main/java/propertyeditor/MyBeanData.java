package propertyeditor;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;
@Setter
@Getter
public class MyBeanData {
    private Date date;

    public MyBeanData(Date date) {
        this.date = date;
    }
}
