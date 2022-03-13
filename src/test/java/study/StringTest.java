package study;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    @DisplayName("String replace() 메서드 테스트")
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("String split() 메서드 테스트")
    void replace1() {
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1");
        assertThat(actual).containsExactly("1", "2");
    }

    @Test
    @DisplayName("String substring() 메서드 테스트")
    void replace2() {
        String exampleString = "(1,2)";
        String actual = exampleString.substring(1, exampleString.length() - 1);

        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("String charAt() 메서드 테스트")
    void replace3() {
        char actual = "abc".charAt(1);
        assertThat(actual).isEqualTo("b".charAt(0));
    }

    @Test
    @DisplayName("String charAt() 메서드 IndexOutOfBoundsException 테스트")
    void replaceException1() {
        assertThatThrownBy(() -> {
            "abc".charAt(4);
        }).isInstanceOf(IndexOutOfBoundsException.class)
            .hasMessageContaining("String index out of range: 4");
    }

    @Test
    @DisplayName("String charAt() 메서드 IndexOutOfBoundsException 테스트")
    void replaceException2() {
        assertThatExceptionOfType(IndexOutOfBoundsException.class)
            .isThrownBy(() -> {
                "abc".charAt(4);
            }).withMessageMatching("String index out of range: \\d+");
    }
}
