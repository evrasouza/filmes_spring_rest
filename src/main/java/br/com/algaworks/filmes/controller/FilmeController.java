package br.com.algaworks.filmes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.algaworks.filmes.model.Filme;
import br.com.algaworks.filmes.service.FilmeService;


//Ideia dela e obter filmes [Um Catalogo de Filmes - Devolvendo sempre o mesmo filme] - Codigo Fixo


@RestController
@RequestMapping("/filmes")
public class FilmeController {

	// Para poder fazer a logica de negociorepresentar a nossa camada de servico criado um Componente FilmeService
	@Autowired
	private FilmeService filmeService;
	
	// Injetando no controlador para obter os dados do filme [No mundo real ele obtem de um repositorio, ou base de dados]
	@GetMapping("/{codigo}")
	public ResponseEntity<Filme> obterFilme(@PathVariable Long codigo) {

		if (codigo < 0) {
			return ResponseEntity.badRequest().build();
		}
		
		// a ideia e que o controlador funcione independete de onde venha o filme
		Filme filme = this.filmeService.obterFilme(codigo);
		
		if (filme == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(filme);
	}
}


