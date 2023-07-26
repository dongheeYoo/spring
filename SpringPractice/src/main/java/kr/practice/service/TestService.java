package kr.practice.service;

import org.springframework.stereotype.Service;

import kr.practice.entity.TestEntity;
import kr.practice.exception.TestNotFoundException;
import kr.practice.repository.TestRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestService {

	private final TestRepository testRepository;
	
	public String getNameResponseStatus(Long id) {
		TestEntity testEntity = testRepository.findById(id).orElseThrow(TestNotFoundException::new);
		
		return testEntity.getName();
	}
	
	public String getNameResponseStatusException(Long id) {
		TestEntity testEntity = testRepository.findById(id).orElseThrow();
		
		return testEntity.getName();
	}
	public void insertName() {
		TestEntity testEntity = new TestEntity();
		testEntity.setName("test name 1");
		
		testRepository.save(testEntity);
	}
}
