package myControllers.CRM;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    @RequestMapping(value="/customers")
    public String listOfCustomers() {
        return null;
    }
}
