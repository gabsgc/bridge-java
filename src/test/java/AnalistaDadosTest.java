import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalistaDadosTest {
    @Test
    void deveRetornarSalarioComBonusParaJunior() {
        Experiencia experiencia = new Junior();
        AnalistaDados analistaDados = new AnalistaDados(3700.0f);
        analistaDados.setExperiencia(experiencia);
        assertEquals(4070.0f, analistaDados.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioComBonusParaPleno() {
        Experiencia experiencia = new Pleno();
        AnalistaDados analistaDados = new AnalistaDados(6200.0f);
        analistaDados.setExperiencia(experiencia);
        assertEquals(7130.0f, analistaDados.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioComBonusParaSenior() {
        Experiencia experiencia = new Senior();
        AnalistaDados analistaDados = new AnalistaDados(8500.0f);
        analistaDados.setExperiencia(experiencia);
        assertEquals(10200.0f, analistaDados.calcularSalario(), 0.01f);
    }
}