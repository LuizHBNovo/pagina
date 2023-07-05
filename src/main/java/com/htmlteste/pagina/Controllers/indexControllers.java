package com.htmlteste.pagina.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.htmlteste.pagina.database.RepositorioContato;
import com.htmlteste.pagina.entidade.contato;

@Controller
public class indexControllers {

    @Autowired
    private RepositorioContato r;

    @RequestMapping(value = "/contato", method=RequestMethod.GET )
    public String index(){
        return "teste/index";
    }
    @RequestMapping(value = "/contato", method=RequestMethod.POST )
    public String index(contato Contato){
        r.save(Contato);
        return "redirect:/contato";
    }

    public List<contato>Listar(){
        return r.findAll();
    }
   /*  @PostMapping("/Salvar")
    public void salvar1(@RequestBody contato Contato){
        r.save(Contato);
    }*/
    public void alterar(contato Contato){
        if(Contato.getId()>0)
        r.save(Contato);
    }
    public void excluir(contato Contato){
        r.delete(Contato);
    }
}
