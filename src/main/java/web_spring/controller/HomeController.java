package web_spring.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
@Slf4j
@RequiredArgsConstructor
public class HomeController {

    @RequestMapping(method= RequestMethod.GET, value="/")
    public String home(Locale locale){
        log.info("This is locale{}",locale);
        return "home";
    }
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        log.info("Welcome home! The client locale is {}.", locale);
        //adding some time lag to check interceptor execution
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate );
        log.info("Before returning view page");
        return "home";
    }

    @RequestMapping(method= RequestMethod.GET, value="/set-cookie-fr")
    public void setCookieFr(HttpServletResponse res){
        res.addCookie(new Cookie("myApplicationCookie","fr"));
    }
    @RequestMapping(method= RequestMethod.GET, value="/set-cookie-en")
    public void setCookieEn(HttpServletResponse res){
        res.addCookie(new Cookie("myApplicationCookie","en"));
    }
}
