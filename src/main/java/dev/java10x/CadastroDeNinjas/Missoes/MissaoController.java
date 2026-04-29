package dev.java10x.CadastroDeNinjas.Missoes;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("missoes")
public class MissaoController {

    private MissaoService missaoService;

    public MissaoController(MissaoService missaoService){this.missaoService = missaoService;}


    // Get -- Mandar uma requisição para mostrar as missoes
    @GetMapping("/listar")
    public List<MissaoModel> listarMissoes(){
        return missaoService.listarMissoes();
    }

    // Post -- Mandar uma requisição para criar as missoes
    @PostMapping("/criar")
    public String criarMissao() {
        return "Missao criada com sucesso";
    }
    // Put -- Mandar uma requisição para alterar as missoes

    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missao alterada com sucesso";
    }

    // Delete -- Mandar uma requisição para deletar as missoes

    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missao deletada com sucesso";

    }

}
