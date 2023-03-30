import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesenvolvedorTest {
    @Test
    void deveRetornarSalarioComBonusParaJunior() {
        Experiencia experiencia = new Junior();
        Desenvolvedor desenvolvedor = new Desenvolvedor(3200.0f);
        desenvolvedor.setExperiencia(experiencia);
        assertEquals(3520.0f, desenvolvedor.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioComBonusParaPleno() {
        Experiencia experiencia = new Pleno();
        Desenvolvedor desenvolvedor = new Desenvolvedor(6900.0f);
        desenvolvedor.setExperiencia(experiencia);
        assertEquals(7935.0f, desenvolvedor.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioComBonusParaSenior() {
        Experiencia experiencia = new Senior();
        Desenvolvedor desenvolvedor = new Desenvolvedor(10000.0f);
        desenvolvedor.setExperiencia(experiencia);
        assertEquals(12000.0f, desenvolvedor.calcularSalario(), 0.01f);
    }
}