package dev.java10x.CadastroDeNinjas.Missoes;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissaoService {

    private MissaoRepository missaoRepository;

    public MissaoService(MissaoRepository missaoRepository) {this.missaoRepository = missaoRepository; }

    // Listar todas as missoes
    public List<MissaoModel> listarMissoes() {return missaoRepository.findAll();}

    // Listas todas as missoes por ID
    public MissaoModel listarMissoesPorId(Long id){
        Optional<MissaoModel> missaoPorId = missaoRepository.findById(id);
                return missaoPorId.orElse(null);
    }

    // Criar uma nova missao
    public MissaoModel criarMissao(MissaoModel missao){
        return missaoRepository.save(missao);
    }

    // Deletar uma missao
    public void deletarMissaoPorId(Long id){
        missaoRepository.deleteById(id);
    }



}
