package HomeWork03.test;

import HomeWork03.src.CheckNumInInterval;
import org.junit.jupiter.api.BeforeEach;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CheckNumInIntervalTest {
    private CheckNumInInterval checkNumInInterval;

    @BeforeEach
    void setUp() {
        checkNumInInterval = new CheckNumInInterval();
    }

    // проверка позитивных сценариев
    @ParameterizedTest
    @ValueSource(ints = {25, 100, 50})
    void heckNumInIntervalPositiveCase(int num) {
        assertThat(checkNumInInterval.numberInInterval(num)).isTrue();
    }

    // проверка на выход из интервала
    @ParameterizedTest
    @ValueSource(ints = {24, 101})
    void heckNumInIntervalOutOfInterval(int num) {
        assertThat(checkNumInInterval.numberInInterval(num)).isFalse();
    }
}