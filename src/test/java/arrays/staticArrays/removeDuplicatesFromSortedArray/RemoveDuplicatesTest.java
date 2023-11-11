package arrays.staticArrays.removeDuplicatesFromSortedArray;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class RemoveDuplicatesTest {

    private RemoveDuplicates removeDuplicates = new RemoveDuplicates();
    @Test
    void testExample1() {
        int[] input = {1, 1, 2};
        int i = removeDuplicates.removeDuplicates(input);

        assertThat(i).isEqualTo(2);
    }

    @Test
    void testExample2() {
        int[] input = {0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates.removeDuplicates(input);

        assertThat(i).isEqualTo(5);
    }
}