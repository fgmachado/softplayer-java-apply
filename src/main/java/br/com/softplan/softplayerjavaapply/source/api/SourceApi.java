package br.com.softplan.softplayerjavaapply.source.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

@RequestMapping("api/source")
@Tag(name = "Source", description = "Repositório de código")
public interface SourceApi {

    @GetMapping({"/v1", "/v2"})
    @Operation(summary = "Url do repositório Github")
    @ApiResponse(responseCode = "200", description = "Url", content = {
            @Content(mediaType = TEXT_PLAIN_VALUE, schema = @Schema(implementation = String.class))
    })
    String source();

}
