# Ticket-reservation
콘서트 티켓팅 서비스 구현 프로젝트입니다. (24.04.01 ~ ) 

프로젝트 마일스톤은 [Github 이슈와 Products] 확인 


## 시나리오 요구사항 분석 및 설계(Github Wiki) 

[Flow Chat](https://github.com/NoJaeHyuk/ticket-reservation/wiki/Flow-Chat)  

[시퀀스 다이어그램](https://github.com/NoJaeHyuk/ticket-reservation/wiki/%EC%8B%9C%ED%80%80%EC%8A%A4-%EB%8B%A4%EC%9D%B4%EC%96%B4%EA%B7%B8%EB%9E%A8)  

[ERD](https://github.com/NoJaeHyuk/ticket-reservation/wiki/ERD-%EC%84%A4%EA%B2%8C)  

[API 명세](https://github.com/NoJaeHyuk/ticket-reservation/wiki/API-%EB%AA%85%EC%84%B8)  


## 패키지 구성 
발제때 나온 내용으로 api와 domain을 따로 분리하는 구조로 아키텍쳐를 구성했습니다. 
아직 클린 아키텍쳐 구조를 많이 안써봐서 여러 형태를 경험에 보면서 학습 예정입니다.

```
api/
  user/
    dto/
      request, response
    userController
  payment/
  reservation/
  show/

domain/
  user/
    model/
    component/
      repository/
    infrastructure/
  payment/
  reservation/
  show/

```

## Swagger 설정 

- Build.gradle
```
dependencies {
    ...

    implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:2.4.0'

    ...
}
```

- application.yml
```
 springdoc:
  api-docs:
    path: /api-docs
    groups:
      enabled: true
```

![image](https://github.com/NoJaeHyuk/ticket-reservation/assets/32382839/0c108742-7ce1-4c93-9361-8cc1d045679b)

