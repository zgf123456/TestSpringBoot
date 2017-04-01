package com.zgf.springboot.demo;

import com.zgf.springboot.demo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zgf on 17/4/1.
 */
@Controller
@RequestMapping("/person")
public class PersonController {

    @RequestMapping("/{pid}")
    @ResponseBody
    public Person person(@PathVariable("pid") String pid) {
        Person person = new Person();
        person.setId(pid);
        person.setName("JACK");
        person.setAge(20);
        return person;
    }

}