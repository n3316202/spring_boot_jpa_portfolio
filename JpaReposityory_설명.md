스프링부트에서는 Entity의 기본적인 CRUD가 가능하도록 JpaRepository 인터페이스를 제공한다.

Spring Data JPA에서 제공하는 JpaRepository 인터페이스를 상속하기만 해도 되며,
인터페이스에 따로 @Repository등의 어노테이션을 추가할 필요가 없다.

JpaRepository를 상속받을 때는 사용될 Entity 클래스와 ID 값이 들어가게 된다.

즉, JpaRepository<T, ID> 가 된다.



그렇게 JpaRepository를  단순하게 상속하는 것만으로 위의 인터페이스는 Entity 하나에 대해서

아래와 같은 기능을 제공하게 된다.

 method

 기능

 save() 레코드 저장 (insert, update)
 findOne() primary key로 레코드 한건 찾기
 findAll() 전체 레코드 불러오기. 정렬(sort), 페이징(pageable) 가능
 count()	 레코드 갯수
 delete()	 레코드 삭제
 
 ====================================================================================
 
 위의 기본기능을 제외한 조회 기능을 추가하고 싶으면 규칙에 맞는 메서드를 추가해야한다.
위와 같이 Query 메소드를 추가하여 스프링에게 알릴 수 있다.

그러기위해서는 규칙에 맞는 메서드를 작성해야 하는데, 그 규칙은 다음과 같다.

method

설명 

 findBy로 시작
 쿼리를 요청하는 메서드 임을 알림

 countBy로 시작
 쿼리 결과 레코드 수를 요청하는 메서드 임을 알림

