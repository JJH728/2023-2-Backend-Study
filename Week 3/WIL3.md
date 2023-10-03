1.
Spring Bean이란 무엇인가?
스프링 IoC 컨테이너에 의해 관리되는 자바 객체

A 클래스를 생성하기 위해서 B 클래스가 존재해야 할 때,
A 클래스는 B 클래스에 대한 의존성을 가진다 고 한다.
즉 한 객체가 다른 객체를 사용할 때 의존성이 있다고 한다.

Spring Bean을 통해 이런 의존성 문제를 더 쉽게 해결할 수 있도록 한다.

스프링 IoC 컨테이너란?
빈을 관리하는 객체

스프링은 엔터프라이즈 서비스 기능을 POJO에 제공하는 것을 목적으로 하며, 그를 위해서는 POJO 프레임워크가 필요하고, IoC/DI, AOP,PSA 기술을 지원한다.

IoC는 제어의 역전을 의미하며, 프로그램의 제어 흐름을 직접 제어하는 것이 아닌 외부로부터 관리받는 것을 뜻한다. IoC는 역할과 관심을 분리해 응집도를 높이고 결합도를 낮추며, 이에 따라 변경에 유연한 코드를 작성할 수 있는 구조가 될 수 있게 해준다.

스프링은 스프링 빈을 통해 의존성 문제를 더 쉽게 해결할 수 있도록 해준다

스프링 빈은 스프링 IoC 컨테이너에 의해 관리되는 자바 객체

스프링 IoC 컨테이너란 

<img src="Week 3\img\result 1.PNG">
<img src="Week 3\img\result 2.PNG">