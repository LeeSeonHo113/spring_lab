package site.metacoding.dbproject.domain.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// PostRepository는 Post오브젝트만 리턴받을 수 있다. DB로부터
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}