package org.example.todo;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class todoRepo {

    private List<todo> todos = new ArrayList<>();
    private AtomicLong counter = new AtomicLong();

    public List<todo> findAll() {
        return new ArrayList<>(todos);
    }

    public Optional<todo> findById(Long id){
        return todos.stream().filter(todo -> todo.getId().equals(id)).findFirst();
    }

    public todo save(todo todo){
        todo.setId(counter.incrementAndGet());
        todos.add(todo);
        return todo;
    }

    public void deleteById(Long id) {
        todos.removeIf(todo -> todo.getId().equals(id));
    }

}
