import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MatrixManagementTest {

    QueryManagement q;
    FileManagement f;
    MatrixManagement matriz;

    @BeforeEach
    void setUp() {
        q = new QueryManagement("Java");
        f = new FileManagement(q);
        f.fileReader();
        f.queryFile();
        matriz = new MatrixManagement(f);
    }

    @Test
    void setMatrizCalculada() {
    }

    @Test
    void occurrencesArraySizeTestValid_MM1() {
        assertEquals(matriz.getColumns(),f.getFileNumber(),"O numero de colunas não tá igual ao numero da query");
    }

    @Test
    public void ArraytestSizeROwstest_MM2(){
        assertEquals(q.getTrimmedquery().size(),matriz.getRows(),"O numero de filas não ta igual ao numero de ficheiros");
    }

    @Disabled
    public void Ocorrencestest_MM3(){
        assertArrayEquals(new int[]{1,1,1,1,1},matriz.occurrences(),"O array não tem o numero de ocorrencias esperado");
    }

    @Test
    void grauSemelhanca() {
    }
}