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

    // Get -- Mandar uma requisição para mostrar as missoes por id
    @GetMapping("/listar/{id}")
    public MissaoModel listarMissoesPorId(@PathVariable Long id){
        return missaoService.listarMissoesPorId(id);
    }

    // Post -- Mandar uma requisição para criar as missoes
    @PostMapping("/criar")
    public MissaoModel criarMissao(@RequestBody MissaoModel missao) {
        return missaoService.criarMissao(missao);
    }

    // Put -- Mandar uma requisição para alterar as missoes
    @PutMapping("/alterar/{id}")
    public MissaoModel alterarMissaoPorId(@PathVariable Long id, @RequestBody MissaoModel missaoAtualizada) {
        return missaoService.alterarMissaoPorId(id, missaoAtualizada);
    }

    // Delete -- Mandar uma requisição para deletar as missoes
    @DeleteMapping("/deletar/{id}")
    public void deletarMissaoPorId(@PathVariable Long id) {
        missaoService.deletarMissaoPorId(id);

    }

}
