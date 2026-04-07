package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;

public interface NinjaRepository extends JpaRepository<MissaoModel, Long> {
}
