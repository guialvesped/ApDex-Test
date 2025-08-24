import org.example.ApDex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApDexTeste {
    // Guilherme Alves Pedroso
    // RM: 555357

    @Test
    void validarApDexExcelente(){
        // arrange
        ApDex apDex = new ApDex();
        // act
        float score = apDex.calcularApDex(555357, 0, 555357);
        // assert
        Assertions.assertEquals(1.0, score, 0.0001);
    }

    @Test
    void validarApDexBom() {
        // arrange
        ApDex apDex = new ApDex();
        float satisfatorio = 0.90f * 555357;
        float toleravel = 0;
        // act
        float score = apDex.calcularApDex(satisfatorio, toleravel, 555357);
        // assert
        Assertions.assertEquals(0.90, score, 0.0001);
    }

    @Test
    void validarApDexRazoavel() {
        // arrange
        ApDex apDex = new ApDex();
        float satisfatorio = 0.50f * 555357;
        float toleravel = 0.50f * 555357;
        // act
        float score = apDex.calcularApDex(satisfatorio, toleravel, 555357);
        // assert
        Assertions.assertEquals(0.75, score, 0.0001);
    }

    @Test
    void validarApDexRuim() {
        // arrange
        ApDex apDex = new ApDex();
        float satisfatorio = 0.40f * 555357;
        float toleravel = 0.30f * 555357;
        // act
        float score = apDex.calcularApDex(satisfatorio, toleravel, 555357);
        // assert
        Assertions.assertEquals(0.55, score, 0.0001);
    }

    @Test
    void validarApDexInaceitavel() {
        // arrange
        ApDex apDex = new ApDex();
        float satisfatorio = 0.10f * 555357;
        float toleravel = 0.20f * 555357;
        // act
        float score = apDex.calcularApDex(satisfatorio, toleravel, 555357);
        // assert
        Assertions.assertEquals(0.20, score, 0.0001);
    }

}
