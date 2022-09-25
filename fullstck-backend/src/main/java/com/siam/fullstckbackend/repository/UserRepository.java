package com.siam.fullstckbackend.repository;
import com.siam.fullstckbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository  extends JpaRepository<User,Long> {
}
