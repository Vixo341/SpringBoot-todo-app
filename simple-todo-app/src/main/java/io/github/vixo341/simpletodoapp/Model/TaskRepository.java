package io.github.vixo341.simpletodoapp.Model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
interface TaskRepository extends JpaRepository<Task, Integer> {


}
