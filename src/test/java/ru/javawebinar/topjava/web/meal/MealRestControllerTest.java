package ru.javawebinar.topjava.web.meal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.javawebinar.topjava.service.MealService;
import ru.javawebinar.topjava.service.UserService;
import ru.javawebinar.topjava.web.AbstractControllerTest;
import ru.javawebinar.topjava.web.user.AdminRestController;

import static org.junit.jupiter.api.Assertions.*;

class MealRestControllerTest extends AbstractControllerTest {

    private static final String REST_URL = MealRestController.REST_URL + '/';

    @Autowired
    private MealService mealService;

    @Test
    void get() throws Exception {
    }

    @Test
    void delete() throws Exception{
    }

    @Test
    void getAll() throws Exception {
    }

    @Test
    void update() throws Exception{
    }

    @Test
    void createWithLocation() throws Exception{
    }

    @Test
    void getBetween() throws Exception{
    }
}