package br.com.softplan.softplayerjavaapply.pessoa.api;

import br.com.softplan.softplayerjavaapply.pessoa.entity.Pessoa;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/pessoas")
@Tag(name = "Pessoas", description = "APIs do cadastro de pessoas")
public interface PessoaApi {

    @GetMapping({"/v1", "/v2"})
    @Operation(summary = "Listagem de pessoas")
    @ApiResponse(responseCode = "200", description = "Listagem de pessoas", content = {
            @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = Pessoa.class))
    })
    List<Pessoa> consultarTodas();

    @PostMapping({"/v1", "/v2"})
    Pessoa cadastrar(@RequestBody Pessoa pessoa);

    @PutMapping({"/v1", "/v2"})
    Pessoa atualizar(@RequestBody Pessoa pessoa);

    @DeleteMapping({"/v1/{id}", "/v2/{id}"})
    Pessoa deletar(@PathVariable("id") Long id);

}
