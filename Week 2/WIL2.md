HTTP란?

- HyperText Transfer Protocol의 약자

- 서로 다른 시스템 사이에서 통신을 주고받을 수 있도록 만들어주는 application 계층의 프로토콜

- 웹에서만 사용하며, TCP/IP 기반으로 서버와 클라이언트 간의 요청과 응답을 전송한다.

HTTP의 특징에는...

    - 서버가 클라이언트의 요청에 응답을 마친 후 연결이 종료된다.

    - 서버는 클라이언트에 대한 정보를 저장하지 않아 같은 클라이언트가 다시 연결을 요청해도 서버는 기억하지 못한다.

    - HTTP Message를 통해 데이터를 주고받는다.

클라이언트가 서버에게 보내는 요청의 목적을 알리는 수단으로 HTTP Method가 있다. 주로 사용하는 Method에는

    - GET: 리소스 조회

    - POST: 요청 데이터 처리, 주로 등록에 사용

    - PUT: 리소스를 대체, 해당 리소스가 없으면 생성

    - PATCH: 리소스 부분 변경

    - DELETE: 리소스 삭제

가 있다.

HTTP 요청이 성공적으로 완료되었는지 알려주는 HTTP 상태 코드가 있다. 주로 사용되는 상태 코드에는

    - 200 : 클라이언트의 요청을 정상적으로 수행함

    - 201 : 클라이언트가 어떠한 리소스 생성을 요청, 해당 리소스가 성공적으로 생성됨(POST를 통한 리소스 생성 작업 시)

    - 204 : 클라이언트가 어떠한 리소스 삭제를 요청, 해당 리소스가 성공적으로 삭제됨

    - 400 : 클라이언트의 요청이 부적절 할 경우 사용하는 응답 코드

    - 401 : 클라이언트가 인증되지 않은 상태에서 보호된 리소스를 요청했을 때 사용하는 응답 코드

    - 403 : 유저 인증상태와 관계 없이 응답하고 싶지 않은 리소스를 클라이언트가 요청했을 때 사용하는 응답 코드

    - 404 : 클라이언트가 요청한 리소스에서는 사용 불가능한 Method를 이용했을 경우 사용하는 응답 코드

    - 500 : 서버에 문제가 있을 경우 사용하는 응답 코드

    - 502 : 게이트웨이 오류

가 있다.

HTTPS란?

- HTTP 프로토콜의 보안 버전

- HTTP의 요청 및 응답을 SSL 및 TLS 기술에 결합한다.

- 쇼핑, 뱅킹 및 원격 작업과 같은 온라인 활동을 보호하는 데 특히 중요하게 쓰이는 프로토콜

HTTP와 HTTPS의 차이점은 데이터를 전송하기 전 암호화를 거치냐 거치지 않냐의 차이가 있다. HTTP는 암호화 과정이

없어 속도가 빠르지만 데이터 전송에 있어서 안정성과 보안이 떨어진다. HTTPS는 안정성과 보안을 확보한 대신 전송

속도가 HTTP에 비해 떨어진다.

Restful URI 설계

이벤트 목록 조회
    - GET /events
이벤트 조회
    - GET /events/{eventId}
이벤트 등록
    - POST /events/{eventId}
이벤트 수정
    - PATCH /events/{eventId}
이벤트 삭제
    - DELETE /events/{eventId}
이벤트 상태 변경
    - PATCH /events/{eventId}/state
특정 이벤트의 주문 목록 조회
    - GET /events/{eventId}/orders
멤버 목록 조회
    - GET /members
특정 멤버 권한 변경
    - PATCH /members/{memberId}/permission
특정 멤버 정보 조회
    - GET /members/{memberId}/information
특정 멤버 정보 변경
    - PATCH /members/{memberId}/information
멤버 등록
    - POST /members/{memberId}