package pl.nightlife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Przemek on 22.08.2017.
 */

@Controller
@RequestMapping("/")
public class HomeController
{
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getAdminMainPage()
    {
        return "home/mainPage";
    }
}
