package com.cd.apls.adapter.visa.in.web;


import com.cd.apls.application.port.in.IdnvUseCase;
import com.cd.apls.application.port.in.TokenLcmUseCase;
import com.cd.apls.application.port.in.TokenizationUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisaWebRestAdapter {

    private TokenizationUseCase tokenizationUseCase;
    private IdnvUseCase idnvUseCase;
    private TokenLcmUseCase tokenLcmUseCase;

    public VisaWebRestAdapter(TokenizationUseCase tokenizationUseCase, IdnvUseCase idnvUseCase, TokenLcmUseCase tokenLcmUseCase) {
        this.tokenizationUseCase = tokenizationUseCase;
        this.idnvUseCase = idnvUseCase;
        this.tokenLcmUseCase = tokenLcmUseCase;
    }

    @PostMapping("/token/create")
    public void tokenization() {
        tokenizationUseCase.provisingToken();
    }

    @PostMapping("/token/suspend")
    public void suspend() {
        tokenLcmUseCase.suspend();
    }

    @PostMapping("/getCvm")
    public void cvm() {
        idnvUseCase.getCvm();
    }


}
