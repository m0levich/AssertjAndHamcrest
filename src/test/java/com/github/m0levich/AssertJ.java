package com.github.m0levich;

import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


public class AssertJ {

    @Test
    public void simpleTest(){
        BigDecimal weight = new BigDecimal(3.4).setScale(1,BigDecimal.ROUND_HALF_UP);
        List<String> childrenCat = Arrays.asList("Васька","Мурка","Барсик");
        Cat cat = new Cat("Дуня", 4, "белый", weight, childrenCat);
        assertThat(cat)
                .as("Дуня")
                .hasFieldOrPropertyWithValue("name","Дуня")
                .hasFieldOrPropertyWithValue("age",4)
                .isInstanceOf(Cat.class);
        assertThat(cat.getChildrenCat())
                .as("Потомки")
                .contains("Васька")
                .containsAnyOf("Васька","Маркиз")
                .containsOnly("Васька","Барсик","Мурка")
                .containsSequence("Васька","Мурка","Барсик")
                .startsWith("Васька")
                .isNotInstanceOf(Cat.class)
                .hasSize(3);
    }
}
