package come.abduk.blacklist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BlackListedRepository extends JpaRepository<BlackListChecker,Integer> {
}
