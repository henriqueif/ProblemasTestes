import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class BuscaBinariaTeste {

  @Test
  public void casoDeTesteComeco(){

    int[] array = {3, 6, 9, 12, 15, 18};
    int chave = 3; 

    BuscaBinaria e = new BuscaBinaria();

    assertEquals(0, e.buscaBinaria(array, chave));
  }

  

  @Test
  public void casoDeTesteMeio(){

    int[] array = {0, 1, 3, 4, 10, 15, 18, 20, 21, 23, 29};
    int chave = 15; 

    BuscaBinaria e = new BuscaBinaria();

    assertEquals(5, e.buscaBinaria(array, chave));
  }

  @Test
  public void casoDeTesteFim(){

    int[] array = {2, 4, 6, 8};
    int chave = 8; 

    BuscaBinaria e = new BuscaBinaria();

    assertEquals(3, e.buscaBinaria(array, chave));
  }

  @Test
  public void casoDeTesteInexistente(){

    int[] array = {0, 1, 3, 4, 10, 20, 23, 25, 30};
    int chave = 28; 

    BuscaBinaria e = new BuscaBinaria();

    assertEquals(-1, e.buscaBinaria(array, chave));
  }

  }