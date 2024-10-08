package spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class spelMain {
    public static void main(String[] args) {
        ExpressionParser expressionParser=new SpelExpressionParser();
        Expression expression=expressionParser.parseExpression("'Ola' .bytes.length");//внутри скобо моно использовать методыды тоже
        int qul=(int) expression.getValue();
        System.out.println(qul);
    }
}
