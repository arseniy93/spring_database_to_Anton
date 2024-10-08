package convertor;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IntegerToString implements Converter<String,Integer> {
    @Override
    public Integer convert(String source) {
        return Integer.parseInt(source);
    }


}
