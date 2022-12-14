# 1기 계산기 프로젝트

## 프로그래밍 요구사항
- 프로그램을 실행하는 시작점은 Application의 main()이다.
- JDK 8 버전에서 실행 가능해야 한다. JDK 8에서 정상 동작하지 않을 경우 0점 처리한다.
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
- https://naver.github.io/hackday-conventions-java
- indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.
  - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
  - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
- 3항 연산자를 쓰지 않는다.
- 함수(또는 메소드)가 한 가지 일만 하도록 최대한 작게 만들어라.
- 프로그래밍 요구사항에서 별도로 변경 불가 안내가 없는 경우 파일 수정과 패키지 이동을 자유롭게 할 수 있다.
- 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.
- 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.
- else 예약어를 쓰지 않는다.
  - 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
  - else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.

## 에러처리
[ ERROR ] {message}

## 테스트 코드
- 가능하다면 TDD 방식의 개발을 진행 해보세요

## 계산기 요구사항
- 사칙연산
- 연산이 되지 않는 경우는 에러처리
- 소수점 3자리 버림
- 콘솔 입출력

## 개발 산출물
- 내가 사용한 개발 기법에 대한 정리
- 각 기능에 대한 구현 방법 및 이유 정리
- 클래스 다이어그램 or 순서도.. 등등

##  개발방법
- repository clone 
```shell
  git@gitlab.com:elonsoft/elon-techcamp/1st-term/caculator.git
```

- branch 생성 
  - branch name = 본인 이니셜 
  - 해당 branch 에서 개발
```shell
  git branch <branchname>
```

# 주의사항 merge 금지