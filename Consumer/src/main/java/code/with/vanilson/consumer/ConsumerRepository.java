package code.with.vanilson.consumer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Long> {



/*
   void saveConsumer(Consumer consumer);
    @Modifying
    @Query("INSERT INTO Consumer (message) VALUES (:msg)")
    void saveConsumer(@Param("msg") String msg);
*/

    // This method retrieves all consumer messages
    @Query("SELECT c.message FROM Consumer c")
    List<String> getAllConsumerMessages();
}
