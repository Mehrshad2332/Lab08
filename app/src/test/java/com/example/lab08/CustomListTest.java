package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();

        City edmonton = new City("Edmonton", "Canada");
        list.addCity(edmonton);

        list.deleteCity(edmonton);

        assertFalse(list.hasCity(edmonton));
    }
    @Test
    public void testCountCities() {
        CustomList list = new CustomList();

        City edmonton = new City("Edmonton", "Canada");
        City calgary = new City("Calgary", "Canada");

        list.addCity(edmonton);
        list.addCity(calgary);

        assertEquals(2, list.countCities());
    }
}