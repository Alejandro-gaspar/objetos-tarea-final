package uaslp.objetos.escuela;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class Exercise6 {

     /*
    INSTRUCCIONES EJERCICIO 6:

    PARA ESTE EJERCICIO DEBERÁS:
    -> Crear Elementos necesarios para que el programa compile
    -> Lograr un 100% de coverage de la clase AlgoritmoX

    En este ejercicio los tests que crees deberán estar en esta clase, es el UNICO
    ejercicio en el que se te permite modificar el Unit Test, PERO está prohibido
    modificar el test existente "validarInterfacesCreadas"

     */

    @Test
    public void validarInterfacesCreadas() {
        assertThat(Dependencia1.class).isInterface();
        assertThat(Dependencia2.class).isInterface();
        assertThat(Dependencia3.class).isInterface();

        Dependencia1 dependencia1 = mock(Dependencia1.class);
        Dependencia2 dependencia2 = mock(Dependencia2.class);
        Dependencia3 dependencia3 = mock(Dependencia3.class);
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1, dependencia2, dependencia3);

        algoritmoX.algoritmoACubrir(1, 1, "A");
        algoritmoX.algoritmoACubrir(1, 2, "B");
        algoritmoX.algoritmoACubrir(2, 1, "C");
        verify(dependencia1).save("A");
        verify(dependencia2).print(1, "B");
        verify(dependencia3).send(2, 1);
    }
}