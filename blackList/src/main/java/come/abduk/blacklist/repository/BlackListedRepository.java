package come.abduk.blacklist.repository;

import come.abduk.blacklist.domain.BlackListChecker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlackListedRepository extends JpaRepository<BlackListChecker,Integer> {
}
