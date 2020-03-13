package in.bhagyeshree.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.bhagyeshree.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long >{

}
