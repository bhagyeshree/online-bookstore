package in.bhagyeshree.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import in.bhagyeshree.onlinebookstore.entity.Book;


@CrossOrigin("http://localhost:4200")
public interface BookRepository extends JpaRepository<Book, Long >{

}
