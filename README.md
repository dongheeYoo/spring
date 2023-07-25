# spring

#Error
운영단계 에서는 trace이 노출되지 않도록.

API error에 아무런 제어가 없다면 500 에러가 나타난다.
(500 에러가 나는 이유는 WAS가 에러를 전달받았기 때문)


Spring Error 처리

1. ExceptionResolver를 동작시켜 에러를 처리\n
  1.ResponseStatus\n
  2.ResponseStatusException\n
  3.ExceptionHandler\n
  4.ControllerAdvice, RestControllerAdvice\n
