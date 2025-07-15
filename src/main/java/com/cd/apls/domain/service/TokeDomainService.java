package com.cd.apls.domain.service;


import com.cd.apls.application.port.out.PanRepositoryPort;
import com.cd.apls.application.port.out.TokenRepositoryPort;
import com.cd.apls.domain.model.Pan;
import com.cd.apls.domain.model.Token;
import org.springframework.stereotype.Service;


@Service
public class TokeDomainService {

    private PanRepositoryPort panRepositoryPort;
    private TokenRepositoryPort tokenRepositoryPort;

    public void findToken(Long id) {}
    public void provisioning(Token t, Pan p) {}
    public void activate(Token t) {}
    public void suspend(Token t) {}
    public void deactivate(Token t) {}
    public void renew(Token t, Pan p) {}


}
