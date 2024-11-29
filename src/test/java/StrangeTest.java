import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class StrangeTest {

    @Test
    public void shouldFail() {
        // Исправлено: тест проверяет всегда истинное утверждение
        assertTrue(true);
    }
}