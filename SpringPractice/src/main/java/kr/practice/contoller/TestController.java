package kr.practice.contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import kr.practice.service.TestService;
import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {
	
	private final TestService testService;

	@GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public String hello() {

        return "Intial Test";
    }
	
	@GetMapping("/{id}/responseStatus")
	@ResponseStatus(HttpStatus.OK)
	public String responseStatus(@PathVariable Long id) {
		return testService.getNameResponseStatus(id);
	}
	
	@GetMapping("/{id}/responseStatusException")
	public ResponseEntity<String> responseStatusException(@PathVariable Long id) {
		try {
			return ResponseEntity.ok(testService.getNameResponseStatusException(id));
		}catch (Exception e){
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"ResponseStatusException");
		}
	}
	
	
	@PostMapping("/name")
	@ResponseStatus(HttpStatus.OK)
	public void insertName() {
		testService.insertName();
	}
	
}
