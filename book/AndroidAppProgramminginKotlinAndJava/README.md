2장 간단한 UI
- 안드로이드 애플리케이션
  - 인터페이스는 여러 구성 요소의 합으로 이뤄짐
  - 레이아웃 객체와 뷰 객체들이 계층적으로 배열되어 하나의 콘텐츠 뷰를 만듦
- MainActivity
  - `AppCompatActivity` 객체 상속
  - 기본 액티비티
- `Override`
  - 자바에서 @Override 어노테이션
  - 코틀린 override 키워드 사용
	- 코틀린 문법에 포함 됨
- fun
  - 함수나 메서드 정의 키워드
    - 클래스 내 선언 : 메서드
    - 클래스 속하지 않으면 : 함수
- setContentView(R.layout.activity_main)
  - 액티비티를 위한 뷰 설정
- Toast.makeText(this@MainACtivity, "Hello world", Toast.LENGTH_SHORT).show()
- SAM
  - 단일 추상 메서드
  - 메서드 하나만 있는 클래스나 인터페이스
  - 뷰가 클릭되었을 때 onClick 메서드 하나만 가진 구성

3장 레이아웃
- `CardView`
  - 카드 스타일의 UI를 만들기 위해 제공되는 레이아웃
  - FrameLayout을 확장한 컨트롤
  - 카드 만들 레이아웃 CardView 만듦
  ```kotlin
  xmlns:card_view="http://schemas.android.com/apk/res-auto"
  ```
- app/build.gradle에 의존성 추가
  ```kotlin
  implementation 'androidx.cardview:cardview:1.0.0'
  ```
- 카드뷰 속성
  ```kotlin
  card_view:cardCornerRadius="20dp"
  ```
모서리의 반지름 크기 조절할 수 있음

4장 툴바
(1) xml에 xmlns:app 추가
(2) Toolbar 선언
  - 툴바 높이는 사이즈에 맞게
  - layout_heigh="wrap_content"
  - 툴바 최소 높이는 액션바 사이즈
    - android_minHeight="?attr/actionBarSize"

(3) theme에 스타일을 NoActionBar로 변경
