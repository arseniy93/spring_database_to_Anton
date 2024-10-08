package propertyeditor;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePropertyEditor extends PropertyEditorSupport {

    private final SimpleDateFormat dateFormat;

    public DatePropertyEditor(String dateFormatPattern) {
        this.dateFormat = new SimpleDateFormat(dateFormatPattern);
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        try {
            Date date = dateFormat.parse(text);
            setValue(date);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date format", e);
        }
    }

    @Override
    public String getAsText() {
        Date date = (Date) getValue();
        return (date != null) ? dateFormat.format(date) : "";
    }
}
