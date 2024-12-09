package br.com.alura.leilao.service;

import br.com.alura.leilao.dao.LeilaoDao;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;

class FinalizarLeilaoServiceTest {

    private FinalizarLeilaoService service;

    @Mock
    private LeilaoDao leilaoDao;

    @BeforeEach
    public void beforeEach() {
        MockitoAnnotations.initMocks(this);
        this.service = new FinalizarLeilaoService(leilaoDao);
    }

    @Test
    void deveriaFinalizarUmLeilao() {
        service = new FinalizarLeilaoService(leilaoDao);
    }

}