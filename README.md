# spring

#Error  
운영단계 에서는 trace이 노출되지 않도록.

API error에 아무런 제어가 없다면 500 에러가 나타난다.  
(500 에러가 나는 이유는 WAS가 에러를 전달받았기 때문)


Spring Error 처리  
  
##ExceptionResolver를 동작시켜 에러를 처리  
  1. ResponseStatus  
     1. 에러 응답의 내용(Payload)를 수정할 수 없음(DefaultErrorAttributes를 수정하면 가능하긴 함)  
     2. 예외 클래스와 강하게 결합되어 같은 예외는 같은 상태와 에러 메세지를 반환함  
     3. 별도의 응답 상태가 필요하다면 예외 클래스를 추가해야 됨  
     4. WAS까지 예외가 전달되고, WAS의 에러 요청 전달이 진행됨  
     5. 외부에서 정의한 Exception 클래스에는 @ResponseStatus를 붙여줄 수 없음  
  3. ResponseStatusException  
  4. ExceptionHandler  
  5. ControllerAdvice, RestControllerAdvice  
