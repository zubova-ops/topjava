package ru.javawebinar.topjava.repository;

import ru.javawebinar.topjava.model.Meal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemoryMealRepository implements MealRepository {
    private final Map<Integer, Meal> map = new HashMap<>();

    private final AtomicInteger atomic = new AtomicInteger(0);

    @Override
    public void save(Meal meal) {
        if (meal.isNew()) {
            int id = atomic.incrementAndGet();
            meal.setId(id);
        }
        map.put(meal.getId(), meal);
    }

    @Override
    public Meal get(Integer id) {
        return map.get(id);
    }

    @Override
    public void update(Integer id, Meal meal) {
        map.put(id, meal);
    }

    public Collection<Meal> getAll() {
        return (Collection<Meal>) map.values();
    }

    @Override
    public void delete(Integer id) {
        map.remove(id);
    }
}
