# kotlin-racingcar

## Step2 문자열 계산기
### 메시지
- [x] 두 수에 대한 계산실행하라.
- [x] 입력값 유효성 검증하라.
- [x] 입력문자열을 숫자와 사칙연산으로 변경하라.
- [x] 숫자로 변환된 입력값을 계산하라.
- [x] 결과값을 출력하라.

### 리뷰반영사항 - 1
- [x] 실제 연산역할을 연산자 객체에게 위임
- [x] `Calculator`객체를 `object`로 변환
- [x] Input 객체 파일명 고려
- [x] 정규표현식의 상수화
- [x] Pattern 비용고려 후 캐싱
- [x] input 검증시 불필요한 검증 로직 제거
- [x] OCP 원칙을 고려한 연산자 여부 메서드 수정
- [x] 연산자 적절한 예외 메시지 처리
- [x] 연산자 객체의 변수명 수정
- [x] nullable 빠르게 예외 처리
- [x] readLine() -> readlnOrNull() 수정
- [x] 결과 계산 로직 가독성 증대

**추가 반영사항**
- 정규표현식을 통해 패턴을 찾을 때 연산자가 추가될수있음을 고려해 동적 패턴 생성

### 리뷰반영사항 - 2
- [ ] Operator::SAM 을 통한 개선
- [x] Operator::확장함수의 제한
- [x] Calculator::불필요한 클래스 제거
- [x] InputParser::REGEX 상수 네이밍 규칙 적용
- [x] InputValidator::require 활용
- [x] Input::runCatching <-> try catch 변환 고려
- [x] InputParser::동반객체 위치 컨벤션 지켜보기
- [x] StringCalculator::문자열반환의 필요성 고려
- [x] StringCalculator::범용적으로 쓰일만한 확장함수 접근 제한 확장 고려
