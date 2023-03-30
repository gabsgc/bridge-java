import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QATest {
    @Test
    void deveRetornarSalarioComBonusParaJunior() {
        Experiencia experiencia = new Junior();
        QA qa = new QA(3000.0f);
        qa.setExperiencia(experiencia);
        assertEquals(3300.0f, qa.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioComBonusParaPleno() {
        Experiencia experiencia = new Pleno();
        QA qa = new QA(4000.0f);
        qa.setExperiencia(experiencia);
        assertEquals(4600.0f, qa.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioComBonusParaSenior() {
        Experiencia experiencia = new Senior();
        QA qa = new QA(9000.0f);
        qa.setExperiencia(experiencia);
        assertEquals(10800.0f, qa.calcularSalario(), 0.01f);
    }
}