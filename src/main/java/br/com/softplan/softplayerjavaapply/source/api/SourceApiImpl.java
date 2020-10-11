package br.com.softplan.softplayerjavaapply.source.api;

import br.com.softplan.softplayerjavaapply.core.config.SourceProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SourceApiImpl implements SourceApi {

    private final SourceProperties properties;

    @Override
    public String source() {
        return properties.getGithub();
    }

}
