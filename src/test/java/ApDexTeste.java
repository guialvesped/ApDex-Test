import org.example.ApDex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ApDexTeste {
    // Guilherme Alves Pedroso
    // RM: 555357

    private ApDex apDex;
    private float amostras;

    @BeforeEach
    void setUp() {
        // arrange
        apDex = new ApDex();
        amostras = 555357;
    }

    @Test
    void validarApDexExcelente(){
        // act
        float score = apDex.calcularApDex(555357, 0, amostras);
        // assert
        Assertions.assertEquals(1.0, score, 0.0001);
    }

    @Test
    void validarApDexBom() {
        // arrange
        float satisfatorio = 0.90f * 555357;
        float toleravel = 0;
        // act
        float score = apDex.calcularApDex(satisfatorio, toleravel, amostras);
        // assert
        Assertions.assertEquals(0.90, score, 0.0001);
    }

    @Test
    void validarApDexRazoavel() {
        // arrange
        float satisfatorio = 0.50f * 555357;
        float toleravel = 0.50f * 555357;
        // act
        float score = apDex.calcularApDex(satisfatorio, toleravel, amostras);
        // assert
        Assertions.assertEquals(0.75, score, 0.0001);
    }

    @Test
    void validarApDexRuim() {
        // arrange
        float satisfatorio = 0.40f * 555357;
        float toleravel = 0.30f * 555357;
        // act
        float score = apDex.calcularApDex(satisfatorio, toleravel, amostras);
        // assert
        Assertions.assertEquals(0.55, score, 0.0001);
    }

    @Test
    void validarApDexInaceitavel() {
        // arrange
        float satisfatorio = 0.10f * 555357;
        float toleravel = 0.20f * 555357;
        // act
        float score = apDex.calcularApDex(satisfatorio, toleravel, amostras);
        // assert
        Assertions.assertEquals(0.20, score, 0.0001);
    }

}
