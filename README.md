# AndroidStudy

# 1주차
  - ## 기본개념 익히기
     - Front_End, Back_End, FullStack, FrameWork 개념
     - Manifest, res, java, gradle 각각의 기능
     
  - ## Layout 다루기
     - Linearlayout, RelativeLayout, GridLayout, FrameLayout 다루기
  
  
# 2주차
 - ## Github 첫 repository 생성 시
 
 ```
    - GitHub 원격 repository 생성 및 생성된 주소 복사
    
    - $ cd (project-name)
        -> git bash 혹은 terminal 에서 해당 프로젝트에 들어가기
    
    - $ git init
        -> git 저장소로 지정
      
    - $ git remote add origin (복사해둔 주소)
        -> 원격 저장소를 origin으로 하고 로컬 저장소와 연결
           꼭 origin 이 아니고 본인에게 편하게 만들어도됨
    
    - $ git add *
        -> 지정해둔 git에 프로젝트의 변경사항을 모두 반영
    
    - $ git commit -m "입력할 내용"
        -> 변경사항에 대한 내용을 commit
    
    - $ git push -u origin master
        -> master branch의 내용을 원격 저장소 origin 으로 push함
  ```
       
 - ## 프로젝트 clone 시
 
 ```
    - 프로젝트를 저장할 디렉토리 생성 후 bash 창 실행
    
    - $ git init
        -> git 저장소로 지정
        
    - $ git clone (원격저장소 url)
        -> 원격저장소에 있는 내용을 그대로 복사
        
    - $ cd (project-name)
        
    - 작업 후 git add, commit, push 명령어 실행하여 업로드
 ```
 
 - ## Branch 다루기
 
 ```
    - $ git branch
        -> 프로젝트에 있는 branch list 보여주기
        
    - $ git branch -r
        -> 원격 저장소 branch list 보여주기
        
    - $ git checkout -b (branch-name)
        -> (branch-name) 브랜치 생성
        
    - $ git branch -d (branch-name)
        -> (branch-name) 브랜치 삭제
        
    - $ git checkout (branch-name)
        -> (branch-name) 브랜치로 전환
        
    - $ git merge (branch-name)
        -> (branch-name)을 master branch에 합침
        
    - 작업 후 git add, commit, push 명령어 실행하여 업로드
```

 - ## 기타 명령어
 
 ```
    - $ git status
        -> git의 변경사항(추가된 내용, 삭제된 내용 등)을 확인
        
    - $ git pull origin master
        -> origin 이라는 원격저장소로부터 내용을 불러와 로컬에서 작업중인 프로젝트와 merge함
 ```       
  
 - ## View 다루기
    - ImageView, TextView, EditText, Button
    - ImageButton, CheckBox, RadioButton
    - 기타 View와 속성에 관해서는 <https://developer.android.com/?hl=ko> 참고
    
# 3주차
  - ## Android 에서 알아두어야 할 아주아주 기본적인 JAVA
  
```
      1. public, private, final, static
      2. Override, Overload
      3. 상속, 인터페이스
```
[참고] <https://github.com/pinokio531/AndroidStudy/blob/master/app/src/main/java/com/sungminapplication/sungminapp/AndroidBase/>
  
  - ## Component
    
```
      1. Activity : 사용자 눈에 직접적으로 View들을 보여주는 곳
      
      2. Service : 응용프로그램이 종료 여부와 상관없이 기능을 실행 시킬 수 있는 곳
                    ex) 뮤직플레이어는 종료되도 노래는 나옴 
                    
      3. Braodcase Receiver : 휴대폰 내의 상태를 파악하다가 특정 변화가 일어나며 알려주는 곳
                              ex) 밧데리 15%가 되며 밧데리 없다고 알림이 옴
                              
      4. Provider : 하나의 응용프로그램에서 서로 다른 응용프로그램으로 정보, 값들을 넘기는 곳
      
      5. Application : 위에서 설명한 4가지 컴포넌트들을 모두 포함하며 최상단에 위치한다.
 ```
   - ## Button 구현 방법
 ```
      1. 익명클래스를 이용하는 방법
      
      2. 인터페이스를 받아 이용하는 방법
                    
      3. 별도의 리스너를 만들어 이용하는 방법(내부 클래스, 외부 클래스, 버튼 리스너 객체 생성)
 ```
 [참고] <https://github.com/pinokio531/AndroidStudy/tree/master/app/src/main/java/com/sungminapplication/sungminapp/MakeButton>

 # 4주차(예정)
  - ## activity 생명주기, 버튼 복습, 화면전환(intent), textview, edittext 이용한 계산기 만들기, 과제로 화면 2개 만들기
      
