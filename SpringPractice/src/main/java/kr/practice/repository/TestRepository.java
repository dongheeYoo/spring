package kr.practice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.practice.entity.TestEntity;

public interface TestRepository extends JpaRepository<TestEntity, Long> {

	Optional<TestEntity> findById(Long id);
}
