package com.cd.apls.application.port.in;

import com.cd.apls.domain.model.Token;

public interface TokenLcmUseCase {

    Token suspend();
    Token deactivate();
    Token renew();


}
