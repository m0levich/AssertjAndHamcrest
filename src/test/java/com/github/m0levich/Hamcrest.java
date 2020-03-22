package com.github.m0levich;

import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class Hamcrest {
    @Test
    public void simpleTest() {
        BigDecimal weight = new BigDecimal(3.4).setScale(1, BigDecimal.ROUND_HALF_UP);
        BigDecimal weight1 = new BigDecimal(4.5).setScale(1, BigDecimal.ROUND_HALF_UP);
        List<String> childrenCat = Arrays.asList("Васька", "Мурка", "Барсик");
        Cat cat = new Cat("Дуня", 4, "белый", weight, childrenCat);

        String name2 = "Мурка";

        assertThat(cat.getName(), is(lessThan(name2)));

        assertThat(cat,
                allOf(notNullValue(),
                        instanceOf(Cat.class),
                        hasProperty("name", equalTo("Дуня")),
                        hasProperty("age", equalTo(4)),
                        hasProperty("weight", lessThan(weight1))));

        assertThat(childrenCat,
                allOf(notNullValue(),
                        hasSize(3)));

        assertThat(childrenCat, not(empty()));
        assertThat(childrenCat, hasItems("Мурка", "Барсик"));
        assertThat(childrenCat, not(hasItem("Матвей")));
        assertThat(childrenCat, containsInAnyOrder("Васька", "Барсик", "Мурка"));
    }
}
