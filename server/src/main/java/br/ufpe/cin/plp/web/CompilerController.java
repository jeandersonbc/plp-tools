package br.ufpe.cin.plp.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jeandersonbc on 31/05/16.
 */
@RestController
public class CompilerController {

    @RequestMapping("run")
    public String run() {
        return "Endpoint test";
    }

}
