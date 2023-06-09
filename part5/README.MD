### 의도는 "메시징"이다. 훌륭하고 성장 가능한 시스템을 만들기 위한 핵심은 모듈 내부의 속성과 행동이 어떤가 보다는 모듈이 어떻게 커뮤니케이션하는가에 달려있다. - 앨런 케이

## 자율적인 책임을 위한 자율적 객체
객체지향 공동체를 구성하는 기본 단위는 '자율적'인 객체로 객체들은 애플리케이션의 기능을 구현하기 위해 협력하고, 협력 과정에서 각자 맡은 바 책임을 다하기 위해 자율적으로 판단하고 행동한다.

-> 책임은 협력에 참여하는 의도를 명확하게 설명할 수 있는 수준 안에서 추상적이다.

적절한 책임 -> 자율적인 객체들 -> 유연하고 단순한 협력 가능

## 객체가 자율적?
객체에게 할당되는 책임의 수준 역시 자율적이어야 함

-> 자율적인 객체란 스스로의 의지와 판단에 따라 각자 맡은 책임을 수행하는 객체 의미

## 어떻게 -> 무엇
객체가 어떻게(how)해야 하는가가 아니라 무엇(what)을 해야 하는가를 설명해야 함

-> 객체가 자신에게 할당된 책임을 수행하도록 만드는 것은 외부에서 전달되는 요청(메시지)



# 메시지와 메서드
객체는 객체가 수신할 수 있는 '메시지'와 메시지를 처리하기 위해 선택할 수 있는 '방법'이라는 두 가지 개념 존재



## 메시지
- 메시지 = 메시지 이름 + 인자 
  - 메시지 이름
  - 인자: 메시지 전송시 추가적인 정보가 필요한 경우 메시지 인자를 통해 추가 정보 제공
  - -> 메시지의 인자 통해 '언제'와 '어디서'라는 추가적인 정보를 실어서 보냄
  - 메시지 전송 = 수신자 + 메시지이름 + 인자
- 수신자
- 메시지

- 객체가 수신할 수 있는 메시지의 모양이 객체가 수행할 책임의 모양 결정
- 객체의 외부와 내부가 메시지를 기준으로 분리

## 메서드
- 메시지 받은 객체
- 해당 메시지를 처리할 수 있는지 여부 판단
- 자신에게 주어진 책임을 다하기 위해 메시지 처리할 방법 메서드 선택

## 특징
- 클래스 안에 포함된 함수 또는 프로시저를 통해 구현
- 메시지는 무엇이 실행되기를 바라지만 어떤 메서드로 어떻게 수행할 것인지는 수신자의 결정에 좌우
- 메시지를 수신한 객체가 실행 시간에 메서드 선택가능
## 다형성
- 서로 다른 유형의 객체가 동일한 메시지에 대해 서로 다르게 반응하는 것
- 서로 다른 타입에 속하는 객체들이 동일한 메시지를 수산 할 경우 서로 다른 메서드를 이용해 메시지를 처리할 수 있는 메커니즘
- 하나의 메시지와 하나 이상의 메서드 사이의 관계

->송신자와 수신자간의 객체 타입에 대한 결합도를 메시지에 대한 결합도를 낮춤으로써 달성

## 대체가능성
- 동일한 역할을 수행할 수 있는 객체들 사이를 의미
- 서로 다른 객체들이 다형성을 만족시킨다는 것은 객체들이 동일한 책임 공유를 의미
- 송신자의 관점에서 다형적인 특징들을 구별할 필요 없이 자신의 요청을 수행할 책임을 지닌다는 점이 동일
## 장점
- 협력이 유연해진다.
- 협력이 수행되는 방식을 확장할 수 있다.
- 협력이 수행되는 방식을 재사용할 수 있다.
- 객체지향의 핵심, 메시지

책임을 수행하는 자율적인 객체들의 협력을 통해 애플리케이션을 구축

클래스는 단지 동적인 객체들의 특성과 행위를 정적인 텍스트로 표현하기 위해 사용할 수 있는 추상화 도구

-> 클래스 정의 전 객체들의 속성과 행위 식별을 먼저

-> 메시지를 믿어라

## 데이터-주도 설계
- 데이터를 중심으로 객체를 설계하는 방식
- 객체의 내부 구조를 객체정의의 일부로 만들어 객체의 자율성을 저해
- ->훌륭한 객체지향 설계는 어떤 객체가 어떤 메시지를 전송할 수 있는가와 어떤 객체가 어떤 메시지를 이해할 수 있는가를 중심으로 객체 사이의 협력 관계를 구성하는 것이다.
- -> 설계의 중심에는 메시지가 위치

## 책임-주도 설계
- 어떤 행위가 필요한지를 먼저 결정한 후 이 행위를 수행할 객체 결정
- 객체들 간에 주고받는 메시지를 기반으로 적절한 역할과 책임, 협력을 발견하는 것
- ->메시지가 수진자의 책임을 결정

->what/who 사이클에 따라 협력에 참여할 객체를 결정하기 전에 협력에 필요한 메시지를 먼저 결정



## what/who 사이클
객체 사이의 협력 관계 설계하기 위해서는 먼저 어떤 행위를 수행할 것인지를 결정한 후에 누가 그 행위를 수행할 것인지를 결정

->어떤 객체가 어떤 특성을 가지고 있다고 해서 반드시 그와 관련된 행위를 수행할 것이라고 가정 X

## 객체 인터페이스
인터페이스 -> 어떤 두 사물이 마주치는 경계 지점에서 서로 상호작용할 수 있게 이어주는 방법이나 장치를 의미

## 인터페이스 특징
- 인터페이스의 사용법을 익히기만 하면 내부 구조나 동작 방식을 몰라도 쉽게 대상을 조작, 의사를 전달 가능
- 인터페이스 자체는 변경하지 않고 단순히 내부 구성이나 작동방식만을 변경하는 것은 인터페이스 사용자에게 어떤 영향 없음
- 대상이 변경되더라도 동일한 인터페이스를 제공하기만 하면 아무런 문제 없이 상호작용 가능

## 메시지와 인터페이스
->메시지가 인터페이스 결정
- 인터페이스는 객체가 수신할 수 있는 메시지의 목록으로 구성


## 인터페이스 내부와 외부
- 외부에서 접근 가능한 공개된 인터페이스
- 내부에서만 접근 가능한 사적인 인터페이스

->모든 인터페이스는 메시지 전송을 통해서만 접근 가능

->메시지 송신자: 다른 객체 or 객체 자신

## 공용 인터페이스
- 외부에 공개된 인터페이스로 메시지 송신자가 다른 객체에 접근 가능

-> 객체가 협력에 참여하기 위해 수행하는 메시지 - 객체의 공용 인터페이스의 모양을 암시

## 인터페이스와 구현의 분리
- 객체지향적인 사고 방식 이해 원칙

## 좀 더 추상적인 인터페이스
- 세부사항을 제거하고 메시지의 의도 표현 위해 추상화 기법
- 너무 구체적인 인터페이스 보다는 추상적인 인터페이스 설계

## 최소 인터페이스
- 외부에서 사용할 필요가 없는 인터페이스는 최대한 노출 X
- 내부를 수정하더라도 외부에 미치는 영향 최소화 가능
- 인터페이스와 구현간에 차이가 있다는 점 인식

## 구현
- 내부 구조와 작동 방식을 가리키는 고유의 용어
- 상태를 어떻게 표현할 것은 객체의 구현에 해당
- 메서드는 객체의 구현에 포함

->객체의 공용 인터페이스와 구현을 명확하게 구분 필요

### 인터페이스와 구현의 분리
-> 소프트웨어는 항상 변경되기 때문에 중요하다.

- 객체가 가져야할 상태와 메서드 구현-> 객체의 내부
- 객체 외부에 영향을 미치는 변경을 객체의 공용 인터페이스를 수정할 때

## 캡슐화
- 객체의 자율성을 보존하기 위해 구현을 외부로부터 감추는 것
- 객체는 상태와 행위를 함께 캡슐화
- 캡슐화 -> 정보은닉
- 캡슐화의 두 가지 관점
- 상태와 행위의 캡슐화

- 스스로 자신의 상태를 관리 + 상태를 변경 + 외부에 응답 행동 내부에 보관
- 데이터 캡슐화
- 상태: 데이터로 구현 + 행동: 프로세서로 구현
- 사적인 비밀의 캡슐화

객체는 외부의 객체가 자신의 내부 상태를 직접 관찰, 제어 못 하게 의사소통 가능한 경로만 외부 노출

고정된 경로: 공용 인터페이스

고용 인터페이스를 경계로 최대한 자율성 보장 가능

->외부의 객체는 공용 인터페이스만 의존

->어떤 것도 동시에 객체의 내부와 외부에 포함될 수 없음



## 책임의 자율성 - 협력의 품질 결정
- 자율적인 책임은 협력을 단순하게 만듦 
- 세부적인 사항들 무시 + 의도 드러내 협력을 단순화 
- 책임이 적절하게 추상화 
- 자율적인 책임은 모자장수의 외부와 내부를 명확하게 분리함
- 호출하는 부분, 방법 명확하게 나눔
- 요청하는 객체가 몰라도 되는 사적인 부분이 객체 내부로 캡슐화되어 인터페이스와 구현 분리
- 책임이 자율적인 경우 책임 수행하는 내부적인 방법 변경해도 외부에 영향 X

- 책임 자율적일수록 변경에 의해 수정돼야 하는 범위 좁고 명확해짐

- 변경의 파급효과가 객체 내부로 캡슐화되기 때문에 두 객체 간의 결합도 낮아짐

- 자율적인 책임은 협력의 대상을 다양하게 선택 가능한 유연성 제공

- 책임이 자율적일수록 협력이 좀 더 유연해지고 다양한 문맥에서 재활용 가능
- 설계가 유연해지고 재사용성 높아짐
- 객체가 수행하는 책임들이 자율적일수록 객체의 역할 이해 쉬워짐

- 객체는 동일한 목적을 달성하는 강하게 연관된 책임으로 구성
- 책임이 자율적일수록 객체의 응집도 높은 상태 유지 쉬워짐

->결과적으로 책임이 얼마나 자율적인지가 전체적인 협력의 설계 품질을 결정



## 결론
책임이 자율적이면?

- 협력이 이해하기 쉬워짐
- 객체의 외부와 내부의 구분이 명확해짐
- 변경에 의한 파급효과를 제한 가능
- 유연하게 변경할 수 있는 동시에 다양한 문맥에서 재활용 가능-

->책임이 자율적일수록 추상화되며, 응집도가 높아지고, 결합도가 낮아지며, 캡슐화가 증진되고, 인터페이스와

- 구현이 명확히 분리되며, 설계의 유연성과 재사용성이 향상된다.

-> 책임을 자율적으로 만드는 것은 메시지에 따라 달라짐
